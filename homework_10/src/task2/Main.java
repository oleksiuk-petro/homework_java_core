/**
 * Ввести n слів з консолі. Знайти найдовше і найкоротше слово
 * та вказати яким воно було введено(порядковий номер).
 */
package task2;

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

        //знаходимо порядковий номер найдовшого слова в масиві
        int maxIndex = 0;
        String maxWord = array[0];
        for (int i = 1; i < n; i++) {
            if (maxWord.length() < array[i].length()) {
                maxIndex = i;
                maxWord = array[i];
            }
        }

        //виводимо найдовше слово масиву разом з індексом
        System.out.println("Найдовше слово:   array[" + maxIndex + "] = " + maxWord);

        //знаходимо порядковий номер найкоротшого слова в масиві
        int minIndex = 0;
        String minWord = array[0];
        for (int i = 1; i < n; i++) {
            if (minWord.length() > array[i].length()) {
                minIndex = i;
                minWord = array[i];
            }
        }

        //виводимо найдовше слово масиву разом з індексом
        System.out.println("Найкоротше слово: array[" + minIndex + "] = " + minWord);
    }
}
