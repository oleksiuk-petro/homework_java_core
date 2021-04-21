/*
    Ваше завдання - підсумувати різницю між послідовними парами масиву в порядку спадання. Якщо масив попрожній, або масив має тільки один елемент, то вивести результат "0".
 */
package task_9;
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

        //якщо array має розмірність size, то масив різниць послідовних пар буде мати розмірність (size-1)
        //оголошуємо масив різниць
        int[] dif = new int[array.length - 1];

        //заповнюємо масив різниць
        for (int i = 0; i < dif.length; i++) {
            dif[i] = array[i] - array[i + 1];
        }

        //виводимо масив різниць dif[] на екран
        System.out.println("----------");
        for (int i = 0; i < dif.length; i++) {
            System.out.println("dif[" + i + "] = " + dif[i]);
        }

        //виводимо суму елементів масиву dif[]
        System.out.println("----------");
        int sum = 0;
        for (int i = 0; i < dif.length; i++) {
            sum += dif[i];
        }
        System.out.println("sum = " + sum);
    }
}
