/*
    Реалізувати алгоритм написаний у попередньому ДЗ через програму. Користувач вводить (a, b, c) і отримує: розв’язки(2)/розв’язки(1)/ повідомлення про те, що розв’язків немає.
 */
package task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //зчитуємо з консолі коефіцієнти квадратного рівняння
        System.out.print("a=");
        Scanner scan_a = new Scanner(System.in);
        double a = scan_a.nextDouble();
        System.out.print("b=");
        Scanner scan_b = new Scanner(System.in);
        double b = scan_b.nextDouble();
        System.out.print("c=");
        Scanner scan_c = new Scanner(System.in);
        double c = scan_c.nextDouble();

        //виводимо на екран наше квадратне рівняння
        System.out.println(a + "*x^2 + " + b + "*x + " + c + " = 0");

        //знаходимо дискримінант квадратного рівняння
        double d = b * b - 4 * a * c;

        //обчислюємо корені рівняння
        if (d < 0) {
            System.out.println("There is no solution equation!");
        } else if (d == 0) {
            double x = (-1.0) * b / (2 * a);
            System.out.println("x= " + x);
        } else {
            double x1 = ((-1.0) - Math.sqrt(d)) / (2.0 * a);
            System.out.println("x1= " + x1);
            double x2 = ((-1.0) + Math.sqrt(d)) / (2.0 * a);
            System.out.println("x2= " + x2);
        }
    }
}