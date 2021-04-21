/*
Користувач задає елементи масиву певного розміру (розмір масиву вибирає програміст). Ваше завдання вивести масив, який ввів користувач, а потім вивести масив у зворотньому порядку.
 */
package task_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //оголошуємо динамічний масив
        List<Integer> array = new ArrayList<>();

        //заповнюємо динамічний масив 10-ма елементами
        System.out.println("Enter elements of array!");
        for (int i = 0; i < 10; i++) {
            Scanner scan_el = new Scanner(System.in);
            int el = scan_el.nextInt();
            array.add(el);
        }

        //виводимо динамічний масив
        System.out.println("----------");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }

        //виводимо динамічний масив у зворотньому порядку
        System.out.println("\n----------");
        for (int i = array.size() - 1; i >= 0; i--) {
            System.out.print(array.get(i) + " ");
        }
    }
}
