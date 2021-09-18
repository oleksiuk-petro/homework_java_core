package task2;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    Thread z; //змінна-посилання на об’єкт потоку

    //конструктор класу
    public RunnableThread() {
        z = new Thread(this, "Дочірній потік"); //створення дочірнього потоку
        System.out.println(z); //інформація про дочірній потік
        z.start(); //запускаємо дочірній потік
    }

    //перевизначаємо метод run()
    @Override
    public void run() {
        try {
            System.out.println("Введіть, скільки чисел Фібоначчі ви хочете бачити: ");
            Scanner scan_numbers = new Scanner(System.in);
            int numbers = scan_numbers.nextInt();

            //заповнюємо масив числами Фібоначчі
            int n0 = 1;
            int n1 = 1;
            int n2;
            int[] fib = new int[numbers];
            fib[0] = n0;
            fib[1] = n1;
            for (int i = 2; i < fib.length; i++) {
                n2 = n0 + n1;
                fib[i] = n2;
                n0 = n1;
                n1 = n2;
            }

            //виводимо числа Фібоначчі у зворотньому порядку
            System.out.print("зворотній порядок: " + fib[numbers - 1]);
            Thread.sleep(1000); //затримка дочірнього потоку
            for (int i = numbers - 2; i >= 0; i--) {
                System.out.print(";  " + fib[i]);
                Thread.sleep(1000); //затримка дочірнього потоку
            }
            System.out.println();

            //опрацювання випадку переривання дочірнього потоку
        } catch (InterruptedException e) {
            System.out.println("Переривання дочірнього потоку: " + e);
        }
    }
}
