import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //створюємо колекцію об’єктів класу People
        List<People> people =
                List.of(
                        //і заповнюємо колекцію об’єктами
                        new People("Andrii", 19, "man"),
                        new People("Aanton", 17, "man"),
                        new People("Bohdan", 28, "man"),
                        new People("Olexandr", 25, "man"),
                        new People("Ivan", 19, "man"),
                        new People("Aanton", 16, "man"),
                        new People("Aanton", 6, "man"),
                        new People("Petrovich", 68, "man"),
                        new People("Anna", 18, "woman"),
                        new People("Oliviya", 35, "woman"),
                        new People("Antonina", 23, "woman"),
                        new People("Galina", 70, "woman"),
                        new People("Motrja", 40, "woman"),
                        new People("Alina", 64, "woman"),
                        new People("Dana", 12, "woman")
                );

        System.out.println("\na)  Вибрати чоловіків-військовозобов’язаних (від 18 до 27 років).");
        people.stream()
                .filter(element -> element.age >= 18 && element.age <= 27 && element.sex.equals("man"))
                .collect(Collectors.toList())
                .forEach(System.out::print);

        System.out.println("\nb)  Знайти середній вік серед чоловіків.");
        double average = people.stream()
                .filter(element -> element.sex.equals("man"))
                .mapToInt(element -> element.getAge())
                .average()
                .getAsDouble();
        System.out.println("Average: " + average);

        System.out.println("\nc)  Знайти кількість потенційно працездатних людей у вибірці" +
                "\n    (тобто від 18 років і з огляду на що жінки виходять в 55 років, а чоловік в 60).");
        long countWorker = people.stream()
                .filter(element -> element.getAge() >= 18)
                .filter(element -> (element.getAge() <= 55 && element.getSex().equals("woman"))
                        || (element.getAge() <= 60 && element.getSex().equals("man")))
                .count();
        System.out.println("countWorker: " + countWorker);

        System.out.println("\nd)  Відсортувати колекцію людей за ім’ям в зворотному алфавітному порядку.");
        people.stream()
                .sorted(new NameComparator().reversed())
                .forEach(System.out::print);

        System.out.println("\ne)  Відсортувати колекцію людей спочатку за ім’ям, а потім за віком.");
        people.stream()
                .sorted(new NameComparator().thenComparing(new AgeComparator()))
                .forEach(System.out::print);

        System.out.println("\nf)  Знайти найстаршу людину.");
        People theOldestPerson = people.stream()
                .max(new AgeComparator())
                .get();
        System.out.println(theOldestPerson.toString());

        System.out.println("\ng)  Знайти наймолодшу людину.");
        People theYoungestPerson = people.stream()
                .min(new AgeComparator())
                .get();
        System.out.println(theYoungestPerson.toString());

        System.out.println("\nh)  Вивести скільки є чоловіків.");
        long countMan = people.stream()
                .filter(element -> element.getSex().equals("man"))
                .count();
        System.out.println("countMan: " + countMan);

        System.out.println("\ni)  Вивести скільки є жінок.");
        long countWoman = people.stream()
                .filter(element -> element.getSex().equals("woman"))
                .count();
        System.out.println("countWoman: " + countWoman);

        System.out.println("\nj)  Вивеcти всіх жінок в яких ім’я починається на “A”.");
        people.stream()
                .filter(element -> element.getSex().equals("woman") && element.getName().startsWith("A"))
                .forEach(System.out::print);
    }
}
