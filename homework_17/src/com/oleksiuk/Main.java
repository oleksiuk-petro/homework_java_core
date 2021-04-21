/*
    Переробити задачі з Comparator так,
    щоб використовувалися anonymous classes,
    замість створення компаратора-класу.
    ---------------------------------------
    Реалізовуємо консольну програму.
    Створити клас Commodity.
    Описати даний клас: поля та методи.
    Повинні бути такі методи:
        1) Додати товар
        2) Видалити товар
        3) Замінити товар
        4) Сортувати за назвою
        5) Сортувати за вагою
        6) Сортувати за довжиною
        7) Сортувати за шириною
        8) Виводимо і-тий елемент колекції (який ми вводимо з консолі
            (використовуємо Scanner))
        9) Вийти з програми(підказка System.exit)
    Для меню використати Switch.
 */
package com.oleksiuk;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //створюємо колекцію subject класу Commodity
        List<Commodity> subject = new ArrayList<>();

        //до колекції додамо первинні елементи
        subject.add(new Commodity("notebook", 30, 40, 30));
        subject.add(new Commodity("phone  ", 10, 16, 80));
        subject.add(new Commodity("box    ", 16, 70, 50));
        subject.add(new Commodity("printer", 14, 55, 45));
        subject.add(new Commodity("speaker", 15, 80, 60));
        subject.add(new Commodity("lamp   ", 90, 90, 14));
        subject.add(new Commodity("desktop", 70, 68, 24));
        subject.add(new Commodity("charger", 35, 23, 15));

        //виводимо елементи колекції на екран
        printCollection(subject);

        //викликаємо метод для виведення меню програми
        methodForSwitch(subject);
    }

    //створюємо метод, який виводить колекцію на екран
    public static void printCollection(List<Commodity> subject) {
        System.out.println(subject);
        System.out.println("-----------------------------------------------------------");
    }

    //метод виведення меню програми
    public static void methodForSwitch(List<Commodity> subject) {
        //виводимо повідомлення для користувача
        System.out.println("Введіть номер бажаної операції:\n" +
                "1) Додати товар.\n" +
                "2) Видалити товар.\n" +
                "3) Замінити товар.\n" +
                "4) Сортувати за назвою.\n" +
                "5) Сортувати за вагою.\n" +
                "6) Сортувати за довжиною.\n" +
                "7) Сортувати за шириною.\n" +
                "8) Виводимо і-тий елемент колекції.\n" +
                "9) Вийти з програми.");
        System.out.print("n = ");
        Scanner scan_n = new Scanner(System.in);
        int n = scan_n.nextInt();
        //меню програми через switch()
        switch (n) {
            case 1: {
                //викликаємо метод, який додає товари до колекції
                addSubject(subject);
                //викликаємо метод, який виводить колекцію на екран
                printCollection(subject);
            }
            break;
            case 2: {
                //викликаємо метод, який буде видаляти j-й елемент колекції товарів
                deleteSubject(subject);
                //викликаємо метод, який виводить колекцію на екран
                printCollection(subject);
            }
            break;
            case 3: {
                //викликаємо метод, який буде заміняти k-й елемент колекції товарів
                replaceSubject(subject);
                //викликаємо метод, який виводить колекцію на екран
                printCollection(subject);
            }
            break;
            case 4:
                //сортуємо колекцію за назвою товару (name)
                AnonymousName anonymousName = new AnonymousName() {
                };
                Collections.sort(subject, anonymousName);
                //викликаємо метод, який виводить колекцію на екран
                printCollection(subject);
                break;
            case 5: {
                //сортуємо колекцію за вагою товару
                AnonymousWeight anonymousWeight = new AnonymousWeight() {
                };
                Collections.sort(subject, anonymousWeight);
                //викликаємо метод, який виводить колекцію на екран
                printCollection(subject);
            }
            break;
            case 6: {
                //сортуємо колекцію за довжиною товару
                AnonymousLength anonymousLength = new AnonymousLength() {
                };
                Collections.sort(subject, anonymousLength);
                //викликаємо метод, який виводить колекцію на екран
                printCollection(subject);
            }
            break;
            case 7: {
                AnonymousWidth anonymousWidth = new AnonymousWidth() {
                };
                Collections.sort(subject, anonymousWidth);
                //викликаємо метод, який виводить колекцію на екран
                printCollection(subject);
            }
            break;
            case 8: {
                //викликаємо метод, який виводить і-й елемент колекції
                showSubjectI(subject);
            }
            break;
            case 9: {
                //викликаємо метод, який завершує виконання програми
                exitProgram();
            }
            break;
            default:
                System.out.println("Ви ввели невірний номер операції!");
        }
    }

    //створюємо метод, який додає товар і його характеристики до колекції subject
    public static void addSubject(List<Commodity> subject) {
        System.out.print("Кількість елементів, які треба додати до колекції: number = ");
        Scanner scan_number = new Scanner(System.in);
        int number = scan_number.nextInt();
        //в циклі записуємо елементи колекції
        for (int i = 0; i < number; i++) {
            //вводимо назву нового товару
            System.out.print("name = ");
            Scanner scan_name = new Scanner(System.in);
            String name = scan_name.nextLine();
            //водимо вагу нового товару
            System.out.print("weight = ");
            Scanner scan_weight = new Scanner(System.in);
            int weight = scan_weight.nextInt();
            //вводимо довжину нового товару
            System.out.print("length = ");
            Scanner scan_length = new Scanner(System.in);
            int length = scan_length.nextInt();
            //вводимо ширину нового товару
            System.out.print("width = ");
            Scanner scan_width = new Scanner(System.in);
            int width = scan_width.nextInt();
            //пряме додавання до колекції
            subject.add(new Commodity(name, weight, length, width));
        }
    }

    //створюємо метод, який видаляє j-й елемент колекції
    public static void deleteSubject(List<Commodity> subject) {
        System.out.print("Введіть порядковий номер товару, який треба видалити (починаючи з \"0\"): j = ");
        Scanner scan_j = new Scanner(System.in);
        int j = scan_j.nextInt();
        //створюємо об’єкт iterator (умовно буде проходитись понад елементами колекції)
        Iterator<Commodity> iteratorDelete = subject.iterator();
        //iterator.hasNext -> перевіряємо, чи стоїть вказівник перед елементами
        int t = 0;
        while (iteratorDelete.hasNext()) {
            //переносимо вказівник на наступний елемент
            iteratorDelete.next();
            //видаляємо j елемент колекції
            if (j == t) {
                iteratorDelete.remove();
            }
            t++;
        }
    }

    //створюємо метод, який замінює k -й елемент колекції
    public static void replaceSubject(List<Commodity> subject) {
        System.out.print("Введіть порядковий номер товару, який треба замінити (починаючи з \"0\"): k = ");
        Scanner scan_k = new Scanner(System.in);
        int k = scan_k.nextInt();
        //вводимо назву нового товару
        System.out.print("name = ");
        Scanner scan_name = new Scanner(System.in);
        String name = scan_name.nextLine();
        //водимо вагу нового товару
        System.out.print("weight = ");
        Scanner scan_weight = new Scanner(System.in);
        int weight = scan_weight.nextInt();
        //вводимо довжину нового товару
        System.out.print("length = ");
        Scanner scan_length = new Scanner(System.in);
        int length = scan_length.nextInt();
        //вводимо ширину нового товару
        System.out.print("width = ");
        Scanner scan_width = new Scanner(System.in);
        int width = scan_width.nextInt();
        //створюємо об’єкт iterator (умовно буде проходитись понад елементами колекції)
        Iterator<Commodity> iteratorReplace = subject.iterator();
        //iterator.hasNext -> перевіряємо, чи стоїть вказівник перед елементами
        int t = 0;
        while (iteratorReplace.hasNext()) {
            //переносимо вказівник на наступний елемент
            iteratorReplace.next();
            //видаляємо j елемент колекції
            if (k == t) {
                subject.set(k, new Commodity(name, weight, length, width));
            }
            t++;
        }
    }

    //метод, який виводить i-й елемент колекції
    public static void showSubjectI(List<Commodity> subject) {
        System.out.print("Введіть порядковий номер товару, який треба вивести (починаючи з \"0\"): i = ");
        Scanner scan_i = new Scanner(System.in);
        int i = scan_i.nextInt();
        System.out.print(subject.get(i));
    }

    //метод виходу з програми
    public static void exitProgram() {
        System.exit(0);
    }
}
