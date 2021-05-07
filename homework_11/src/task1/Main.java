/*
    Завдання зробити через RegEx.
    Користувач вводить слова з консолі,
    в масив додавати лише ті, що починаються на "а".
 */
package task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //викликаємо метод визначення кількості введених слів
        int n = howManyWords();

        //створюємо список
        List<String> list = new LinkedList<>();

        //виводимо список із слів, які розпочинаються на символ 'a'
        System.out.println(writeWords(list, n));
    }

    //метод визначення кількості введення слів
    public static int howManyWords(){
        System.out.print("Скільки слів ти хочеш ввести?\n" + "n = ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        return n;
    }

    //метод введення і перевірки слів
    public static List<String> writeWords(List<String> list, int n) {
        //за допомогою циклу вводимо n слів
        for (int i = 0; i < n; i++) {
            System.out.print("word №" + (i + 1) + ": ");
            String word; //рядкова змінна (для введення окремих  слів)
            Scanner scanWord = new Scanner(System.in);
            word = scanWord.next(); //ввід слова до пробілу
            String s = "^a"; //означає, що початок слова є символ "а"
            Pattern p = Pattern.compile(s); //скомпільований регулярний вираз
            Matcher m = p.matcher(word); //виявлення збігів першої літери
            if (m.find()) //якщо збіги "істина"
                list.add(word); //то додаємо до списку введене слово
        }
        return list;//повертаємо остаточний список
    }
}
