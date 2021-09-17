/*
    Створіть масив, наповніть його рандомними даними, знайдіть найбільше та найменше значення масиву.
 */
package task_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //просимо користувача ввести розмірність масиву від 5 (включно) до 15 (включно)
        System.out.print("Enter the size (any number from 5 to 15): size=");
        Scanner scan_s = new Scanner(System.in);
        int size = scan_s.nextInt();

        //перевіряємо коректність розмірності масиву
        if ((size > 15) || (size < 5)) {
            System.out.println("Incorrect size!");
        } else {
            //оголошуємо масив
            int array[];
            array = new int[size];

            //заповнюємо масив випадковими значеннями від 0 (включно) до 100 (включно)
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * (100 + 1));
                //виводимо елементи масиву
                System.out.println("array[" + i + "]=" + array[i]);
            }
            //знаходимо найбільше значення масиву
            int max;
            int num_max;
            max = array[0];
            num_max = 0;
            for (int i = 1; i < size; i++) {
                if (max < array[i]) {
                    max = array[i];
                    num_max = i;
                }
            }

            //виводимо найбільше значення масиву
            System.out.println("Maximum element: array[" + num_max + "]=" + max);

            //знаходимо найменше значення масиву
            int min;
            int num_min;
            min = array[0];
            num_min = 0;
            for (int i = 1; i < size; i++) {
                if (min > array[i]) {
                    min = array[i];
                    num_min = i;
                }
            }

            //виводимо найменше значення масиву
            System.out.println("Minimum element: array[" + num_min + "]=" + min);
        }
    }
}
