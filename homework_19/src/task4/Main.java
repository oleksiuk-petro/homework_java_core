package task4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //створюємо екземпляр класу Employee
        Employee worker = new Employee("Ivan", 1, 20000.05);

        //робимо salary об’єктом
        Object objectSalary = worker.getSalary();

        //викликаємо метод серіалізації для salary-об’єкта
        Methods.serializeObject(objectSalary);

        //викликаємо метод десеріалізації
        System.out.println(Methods.deserializeObject());
    }
}
