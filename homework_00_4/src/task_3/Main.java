/*
    Написати функцію, яка при введенні року виводить століття
*/
package task_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //оголошуємо змінну "числове значення року"
        int number;
        //вводимо значення року в консоль
        System.out.print("Enter which year:");
        Scanner scan_number = new Scanner(System.in);
        number = scan_number.nextInt();
        //виводимо значення століття
        int hundreds = century(number);
        System.out.print("If we have " + number + " year, then is " + hundreds + " century.");
    }
    //метод, який обчислює століття
    public static int century(int number) {
        int a=0;
        if (number > 0) {
            a = number / 100 + 1;
        } else {
            System.out.print("You enter incorrect year!");
        }
        //повертаємо значення століття в метод "main"
        return a;
    }
}
