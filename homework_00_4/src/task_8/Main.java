/*
  Дано масив цілих чисел. Повертаємо масив, де перший елемент - це кількість позитивних чисел, а другий - сума від’ємних чисел. Якщо масив вводу порожній або нульовий, поверніть порожній масив.
*/
package task_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //користувач вводить розмірність масиву
        System.out.println("----------");
        System.out.print("Enter size of array: size = ");
        Scanner scan_size = new Scanner(System.in);
        int size = scan_size.nextInt();

        //оголошуємо масив
        int[] array = new int[size];

        //користувач вводить масив
        System.out.println("----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            Scanner scan_element = new Scanner(System.in);
            array[i] = scan_element.nextInt();
        }

        //виводимо масив на екран
        System.out.println("----------");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        //оголошуємо масив розмірністю два елемента
        int[] second = new int[2];

        //рахуємо кількість позитивних елементів
        second[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                second[0]++;
            }
        }

        //рахуємо суму від’ємних чисел
        second[1] = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                second[1] += array[i];
            }
        }

        //виводимо масив розмірністю два елемента
        System.out.println("----------");
        System.out.println("second[0] = " + second[0]);
        System.out.println("second[1] = " + second[1]);
    }
}
