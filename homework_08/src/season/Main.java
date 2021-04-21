/*
Написати консольну програму для роботи з Enums.
Створити енум Сезони, в якому оголосити такі константи : Зима , Весна, Літо, Осінь.
Створити енум Місяці, в якому створити 12 констант- місяці року(Січень, Лютий, ..., Грудень),
оголосити змінну дні, та змінну сезон типу Сезон, як поле енума.
Створити конструктор з визначеними параметрами в енумі Місяці,
в який як параметри передати змінну дні та сезон.
Описати getters до даних полів (дні, сезони).

Створити консольне меню, в якому реалізувати наступні пункти :
● Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити,
  щоб регістр букв був не важливим).
● Вивести всі місяці з такою ж порою року.
● Вивести всі місяці які мають таку саму кількість днів.
● Вивести на екран всі місяці які мають меншу кількість днів.
● Вивести на екран всі місяці які мають більшу кількість днів.
● Вивести на екран наступну пору року.
● Вивести на екран попередню пору року.
● Вивести на екран всі місяці які мають парну кількість днів.
● Вивести на екран всі місяці які мають непарну кількість днів.
● Вивести на екран чи введений з консолі місяць має парну кількість днів.
 */
package season;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введіть назву місяця англійською мовою: ");
        Scanner scan_m = new Scanner(System.in);
        String nameMonth = scan_m.nextLine();

        //робимо всі букви ВЕЛИКИМИ
        nameMonth = nameMonth.toUpperCase();
        System.out.println("\nПравильний регістр букв: " + nameMonth);

        //перевіряємо навність такого місяця у enum Month
        int i = 0;
        for (Month month : Month.values()) {
            //повертаємо нашу стрічку до класу Month
            Month varMonth = Month.valueOf(nameMonth);
            //порівнюємо стрічку з константами місяців
            if ((varMonth.compareTo(month)) == 0) {
                i++;
            } else {
            }
        }
        if (i == 1) {
            System.out.println("\nТака назва місяця існує!");
        } else {
            System.out.println("\nТака назва місяця не існує!");
        }

        //це розгалуження виконується тоді, коли назва місяця відповідає дійсності
        if (i == 1) {
            System.out.print("\nВиводимо всі місяці з такою порою року: ");
            //повертаємо нашу стрічку до класу Month
            Month varMonth = Month.valueOf(nameMonth);
            System.out.println(varMonth.getTimeYear());
            //використаємо оператор switch
            switch (varMonth.getTimeYear()) {
                case WINTER:
                    System.out.println(Month.DECEMBER.name());
                    System.out.println(Month.JANUARY.name());
                    System.out.println(Month.FEBRUARY.name());
                    break;
                case SPRING:
                    System.out.println(Month.MARCH.name());
                    System.out.println(Month.APRIL.name());
                    System.out.println(Month.MAY.name());
                    break;
                case SUMMER:
                    System.out.println(Month.JUNE.name());
                    System.out.println(Month.JULY.name());
                    System.out.println(Month.AUGUST.name());
                    break;
                case AUTUMN:
                    System.out.println(Month.SEPTEMBER.name());
                    System.out.println(Month.OCTOBER.name());
                    System.out.println(Month.NOVEMBER.name());
                    break;
            }

            System.out.println("\nВиводимо всі місяці, які мають таку саму кількість днів (" + varMonth.getNumberDay() + "):");
            //масив проходиться по всім місяцям року
            for (Month month : Month.values()) {
                if (varMonth.getNumberDay() == month.getNumberDay()) {
                    System.out.println(month.toString() + " " + month.getNumberDay());
                } else {
                }
            }

            System.out.println("\nВиводимо на екран всі місяці, які мають меншу кількість днів:");
            //масив проходиться по всім місяцям року
            for (Month month : Month.values()) {
                if (varMonth.getNumberDay() > month.getNumberDay()) {
                    System.out.println(month.toString() + " " + month.getNumberDay());
                } else {
                }
            }

            System.out.println("\nВиводимо на екран всі місяці, які мають більшу кількість днів:");
            //масив проходиться по всім місяцям року
            for (Month month : Month.values()) {
                if (varMonth.getNumberDay() < month.getNumberDay()) {
                    System.out.println(month.toString() + " " + month.getNumberDay());
                } else {
                }
            }

            System.out.println("\nВиводимо на екран нинішню пору року: " + varMonth.getTimeYear());

            System.out.print("\nВиводимо на екран наступну пору року: ");
            switch (varMonth.getTimeYear()) {
                case WINTER:
                    System.out.println(Season.SPRING.name());
                    break;
                case SPRING:
                    System.out.println(Season.SUMMER.name());
                    break;
                case SUMMER:
                    System.out.println(Season.AUTUMN.name());
                    break;
                case AUTUMN:
                    System.out.println(Season.WINTER.name());
                    break;
            }

            System.out.print("\nВиводимо на екран попередню пору року: ");
            switch (varMonth.getTimeYear()) {
                case WINTER:
                    System.out.println(Season.AUTUMN.name());
                    break;
                case SPRING:
                    System.out.println(Season.WINTER.name());
                    break;
                case SUMMER:
                    System.out.println(Season.SPRING.name());
                    break;
                case AUTUMN:
                    System.out.println(Season.SUMMER.name());
                    break;
            }

            System.out.println("\nВиводимо на екран всі місяці, які мають парну кількість днів:");
            //масив проходиться по всім місяцям року
            for (Month month : Month.values()) {
                if ((month.getNumberDay() == 28) || (month.getNumberDay() == 30)) {
                    System.out.println(month.toString() + " " + month.getNumberDay());
                } else {
                }
            }

            System.out.println("\nВиводимо на екран всі місяці, які мають непарну кількість днів:");
            //масив проходиться по всім місяцям року
            for (Month month : Month.values()) {
                if ((month.getNumberDay() == 29) || (month.getNumberDay() == 31)) {
                    System.out.println(month.toString() + " " + month.getNumberDay());
                } else {
                }
            }

            System.out.println("\nЧи має введений з консолі місяць парну кількість днів?");
            if ((varMonth.getNumberDay() == 28) || (varMonth.getNumberDay() == 30)) {
                System.out.println("\nТак, місяць " + varMonth.toString() + " має " + varMonth.getNumberDay() + " днів.");
            } else {
                System.out.println("\nНі, місяць " + varMonth.toString() + " має " + varMonth.getNumberDay() + " днів.");
            }
        }
    }
}

