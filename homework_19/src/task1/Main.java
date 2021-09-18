package task1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //створюємо екземпляр класу Employee
        Employee worker = new Employee("Ivan",1,20000.05);

        //викликаємо метод серіалізації
        Methods.serializeObject(worker);

        //викликаємо метод десеріалізації
        System.out.println(Methods.deserializeObject());
    }
}
