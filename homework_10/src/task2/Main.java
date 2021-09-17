/*
    Ввести n слів з консолі. Знайти найдовше і найкоротше слово
    та вказати яким воно було введено(порядковий номер).
 */
package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // вводимо кількість слів
        int n = writeNumberWords();

        // викликаємо метод, який заповнює масив словами
        String[] array = writeArrayWords(n);

        //знаходимо порядковий номер найдовшого слова в масиві
        int maxIndex = getNumberTheLongestWord(array);

        //виводимо найдовше слово масиву разом з індексом
        System.out.println("Найдовше слово:   array[" + maxIndex + "] = " + array[maxIndex]);

        //знаходимо порядковий номер найкоротшого слова в масиві
        int minIndex = getNumberTheShortestWord(array);

        //виводимо найдовше слово масиву разом з індексом
        System.out.println("Найкоротше слово: array[" + minIndex + "] = " + array[minIndex]);
    }

    // метод введення кількості слів
    public static int writeNumberWords() {
        System.out.print("Write number of words: n = ");
        Scanner n_scan = new Scanner(System.in);
        return n_scan.nextInt();
    }

    // метод вводить масив слів
    public static String[] writeArrayWords(int n) {
        //оголошуємо масив рядків розмірністю "n"
        String[] mas = new String[n];
        //за допомогою циклу вводимо масив слів
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + i + "] = ");
            Scanner array_scan = new Scanner(System.in);
            mas[i] = array_scan.next(); //в масив заноситься ТІЛЬКИ одне слово
        }
        return mas;
    }

    // метод знаходить порядковий номер найдовшого слова
    public static int getNumberTheLongestWord(String[] mas) {
        int numberWord = 0;
        String longerWord = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (longerWord.length() < mas[i].length()) {
                numberWord = i;
                longerWord = mas[i];
            }
        }
        return numberWord;
    }

    // метод знаходить порядковий номер найкоротшого слова
    public static int getNumberTheShortestWord(String[] mas) {
        int numberWord = 0;
        String shortWord = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (shortWord.length() > mas[i].length()) {
                numberWord = i;
                shortWord = mas[i];
            }
        }
        return numberWord;
    }
}
