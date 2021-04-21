/*
    Зробити через RegEx.
    Зробити валідацію для емейл-адрес, зберігати лише ті,
    які закінчуються на @gmail.com
 */
package task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //викликаємо метод визначення кількості введених email-адрес
        int n = howManyEmailAddress();
        //створюємо список
        List<String> list = new LinkedList<>();
        //виводимо список із адрес, які закінчуються на "@gmail.com"
        System.out.println(writeEmailAddress(list, n));
    }

    //метод визначення кількості введення email-адрес
    public static int howManyEmailAddress(){
        System.out.print("Скільки email-адрес ти хочеш ввести?\n" + "n = ");
        Scanner scanNumber = new Scanner(System.in);
        int n = scanNumber.nextInt();
        return n;
    }

    //метод введення і перевірки слів
    public static List<String> writeEmailAddress(List<String> list, int n) {
        //за допомогою циклу вводимо n email-адрес
        for (int i = 0; i < n; i++) {
            System.out.print("email-адреса №" + (i + 1) + ": ");
            String emailAddress; //рядкова змінна (для введення окремих  слів)
            Scanner scanEmailAddress = new Scanner(System.in);
            emailAddress = scanEmailAddress.next(); //ввід слова до пробілу
            String s = "@gmail.com$"; //означає, що кінець email-адреси є "@gmail.com"
            Pattern p = Pattern.compile(s); //скомпільований регулярний вираз
            Matcher m = p.matcher(emailAddress); //виявлення збігів кінця адреси
            if (m.find()) //якщо збіги "істина"
                list.add(emailAddress); //то додаємо до списку введену email-адресу
        }
        return list;//повертаємо остаточний список
    }
}
