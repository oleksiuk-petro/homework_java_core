package task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //створюємо колекцію об’єктів класу Employee
        List<Employee> employeeList = new ArrayList<>();

        //до колекції додаємо об’єкти класу Employee
        employeeList.add(new Employee("Andrii", 1, 20000.05));
        employeeList.add(new Employee("Maxsim", 2, 14000.57));
        employeeList.add(new Employee("Petro", 3, 18000.95));
        employeeList.add(new Employee("Ivan", 4, 40700.15));
        employeeList.add(new Employee("Bohdan", 5, 23050.40));
        employeeList.add(new Employee("Volodimir", 6, 2000.95));

        //викликаємо метод серіалізації
        Methods.serializeObject(employeeList);

        //викликаємо метод десеріалізації
        System.out.println(Methods.deserializeObject());
    }
}
