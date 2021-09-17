/*
Створити клас коло. Описати його двома полями: радіус та діаметр. Введення може бути дробовим. Написати два методи які будуть виводити на екран площу кола і довжину кола. Для площі використати параметр - діаметр. Для довжини кола використати радіус.
 */
package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //вводимо в консоль радіус
        System.out.println("--------------------");
        System.out.print("radius r=");
        Scanner scan_r = new Scanner(System.in);
        double r = scan_r.nextDouble();
        //вводимо в консоль діаметер
        System.out.print("diameter d=");
        Scanner scan_d = new Scanner(System.in);
        double d = scan_d.nextDouble();
        System.out.println("--------------------");

        //викликаємо конструктор з двома параметрами
        Circle figure = new Circle(r, d);

        //виводимо площу кола у консоль
        System.out.println("Area of circle: s=" + Math.PI * Math.pow(figure.getDiameter(), 2));
        //виводимо довжину кола у консоль
        System.out.println("Length of circle: l=" + 2 * Math.PI * figure.getRadius());
        System.out.println("--------------------");
    }
}
