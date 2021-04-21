//Worker1 - це клас працівника із фіксованою заробітньою платою
package task1;
public class Worker1 implements Salary {

    //оголошуємо поле класу (назва поля = назві інтерфейсу)
    private double salary;

    //створюємо конструктор класу
    //Alt + Insert -> Constructor (double salary)
    public Worker1(double salary) {
        this.salary = salary;
    }

    //перевизначаємо метод із Salary
    //Alt + Insert -> Override (salary)
    @Override
    public void salary() {
        System.out.println(salary);
    }

    //встановлюємо Get та Set для поля класу Worker1
    //Alt + Insert -> Getter and Setter (double:salary;)
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
