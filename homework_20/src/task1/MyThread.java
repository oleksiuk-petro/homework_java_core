package task1;

import java.util.Scanner;

public class MyThread extends Thread {
    //конструктор класу
    public MyThread() {
        start(); //запускаємо потік на виконання
    }

    //перевизначаємо метод run()
    @Override
    public void run() {
        try {
            System.out.println("Введіть, скільки чисел Фібоначчі ви хочете бачити: ");
            Scanner scan_numbers = new Scanner(System.in);
            int numbers = scan_numbers.nextInt();

            //числа Фібоначчі
            int n0 = 1;
            int n1 = 1;
            int n2;
            System.out.print("звичайний порядок: " + n0 + ";  ");
            Thread.sleep(1000); //затримка дочірнього потоку
            System.out.print(n1);
            Thread.sleep(1000); //затримка дочірнього потоку
            for (int i = 3; i <= numbers; i++) {
                n2 = n0 + n1;
                System.out.print(";  " + n2);
                n0 = n1;
                n1 = n2;
                Thread.sleep(1000); //затримка дочірнього потоку
            }
            System.out.println();
            //опрацювання випадку переривання дочірнього потоку
        } catch (InterruptedException e) {
            System.out.println("Переривання дочірнього потоку: " + e);
        }
    }
}
