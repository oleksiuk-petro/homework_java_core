/**
 * Створити клас (будь який), описати в ньому мінімум два поля,
 * одне з яких String, інше числове (довільно яке).
 * Створити в main методі Set. Наповнити його об’єктами даного класу.
 * Вивести спершу невідсортований список, потім відсортований
 * на консоль (використати Comparable для сортування за цими полями);
 * Спробувати зробити завдання з HashSet, LinkedHashSet та TreeSet .
 */
package com.oleksiuk.TreeSet;

import com.oleksiuk.Car;
import com.oleksiuk.ComparName;
import com.oleksiuk.ComparNumber;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //викликаємо метод введення кількості найменувань
        int n = enterTheNumberOfNames();

        //створюємо колекцію carName
        //вона автоматично буде відсортована по полю "name"
        ComparName comparName = new ComparName();
        TreeSet<Car> carName = new TreeSet<>(comparName);

        //викликаэмо метод вводу інформації про автомобілі
        enterInformationAboutCars(carName, n);

        //виводимо відсортовану по полю "name" колекцію на екран
        System.out.println(carName);

        //створюємо колекцію carNumber
        //вона автоматично буде відсортована по полю "number"
        ComparNumber comparNumber = new ComparNumber();
        TreeSet<Car> carNumber = new TreeSet<>(comparNumber);

        //до колекції carNumber додаємо вміст колекції carName
        carNumber.addAll(carName);

        //виводимо відсортовану по полю "number" колекцію на екран
        System.out.println(carNumber);
    }

    //метод введення кількості найменувань автомобілів
    public static int enterTheNumberOfNames() {
        System.out.print("Введіть кількість найменувань автомобілів: n = ");
        Scanner scan_n = new Scanner(System.in);
        int n = scan_n.nextInt();
        return n;
    }

    //метод введення інформації про всі автомобілі
    public static TreeSet<Car> enterInformationAboutCars(TreeSet<Car> car, int n) {

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
}
