/**
 * Ввести n слів з консолі. Вивести на екран слова які починаються на ‘a’
 * і мають парну кількість символів.
 */
package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //вводимо кількість слів
        System.out.print("n = ");
        Scanner n_scan = new Scanner(System.in);
        int n = n_scan.nextInt();

        //оголошуємо масив рядків розмірністю "n"
        String[] array = new String[n];

        //за допомогою циклу вводимо масив слів
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            Scanner array_scan = new Scanner(System.in);
            array[i] = array_scan.next(); //в масив заноситься ТІЛЬКИ одне слово
        }

        //виводимо на екран слова які починаються на ‘a’ (англ. та укр.)
        //і мають парну кількість символів
        for (int i = 0; i < n; i++) {

            //перевіряємо, чи починається слово на ‘a’ (англ. та укр.)
            boolean firstLetter = (array[i].startsWith("a"));

            //перевіряємо, чи має слово парну кількість символів
            boolean evenNumber = (((array[i].length()) % 2) == 0);

            //виводимо слово, якщо одночасно виконуються обидві умови
            if ((firstLetter == true) && (evenNumber == true)) {
                System.out.println(array[i]);
            }
        }
    }
}
