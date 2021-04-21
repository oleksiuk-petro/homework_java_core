/**
 * Створити клас (будь який), описати в ньому мінімум два поля,
 * одне з яких String, інше числове (довільно яке).
 * Створити в main методі Set. Наповнити його об’єктами даного класу.
 * Вивести спершу невідсортований список, потім відсортований
 * на консоль (використати Comparable для сортування за цими полями);
 * Спробувати зробити завдання з HashSet, LinkedHashSet та TreeSet .
 */
package com.oleksiuk.HashSet;

import com.oleksiuk.Car;
import com.oleksiuk.ComparName;
import com.oleksiuk.ComparNumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //викликаємо метод введення кількості найменувань
        int n = enterTheNumberOfNames();

        //створюємо колекцію car
        Set<Car> car = new HashSet<>();

        //викликаэмо метод вводу інформації про автомобілі
        enterInformationAboutCars(car, n);

        //виводимо невідсортовану колекцію на екран
        System.out.print("Невідсортована колекція:");
        System.out.println(car);

        //викликаємо метод сортування використовуючи HashSet
        sortUsingHashSet(car);

    }

    //метод введення кількості найменувань автомобілів
    public static int enterTheNumberOfNames() {
        System.out.print("Введіть кількість найменувань автомобілів: n = ");
        Scanner scan_n = new Scanner(System.in);
        int n = scan_n.nextInt();
        return n;
    }

    //метод введення інформації про всі автомобілі
    public static Set<Car> enterInformationAboutCars(Set<Car> car, int n) {

        //за допомогою циклу вводимо інформацію про n найменувань автомобілів
        for (int i = 0; i < n; i++) {
            System.out.print("name = ");
            Scanner scan_name = new Scanner(System.in);
            String name = scan_name.nextLine();
            System.out.print("number = ");
            Scanner scan_number = new Scanner(System.in);
            int number = scan_number.nextInt();

            //до колекції додаємо інформацію про одне найменування автомобіля
            car.add(new Car(name, number));
        }
        return car;
    }

    //метод сортування використовуючи HashSet
    public static void sortUsingHashSet(Set<Car> car) {
        System.out.println("Виконуємо, використовуючи HashSet.");

        //ми не можемо відсортувуати "Set" звичним способом
        //створимо колекцію "List" і присвоїмо їй значення "Set"
        List<Car> listCar = new ArrayList<>(car);

        //сортуємо колекцію car по полю name
        ComparName comparName = new ComparName();
        listCar.sort(comparName);

        //виводимо відсортовану колекцію на екран по полю name
        System.out.print("Відсортована колекція (по полю name):");
        System.out.println(listCar);

        //сортуємо колекцію car по полю number
        ComparNumber comparNumber = new ComparNumber();
        listCar.sort(comparNumber);

        //виводимо відсортовану колекцію на екран по полю name
        System.out.print("Відсортована колекція (по полю number):");
        System.out.println(listCar);
    }
}


