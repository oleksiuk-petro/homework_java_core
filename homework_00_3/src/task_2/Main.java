/*
Створити стрічкову змінну яка зберігатиме день тижня. Використовуючи конструкцію switch скласти розклад на тиждень. В залежності від дня тижня у користувача на екрані відображається те, ща заплановано на цей день.
 */
package task_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //оголошення рядкової змінної
        String day;

        //просимо користувача ввести день тижня
        System.out.print("Read day of week: number=");
        Scanner num_scan = new Scanner(System.in);
        int number = num_scan.nextInt();

        //оператор вибору switch
        switch (number) {
            case 1:
                day = "Monday - swimming!";
                break;
            case 2:
                day = "Tuesday - running!";
                break;
            case 3:
                day = "Wednesday - jumping!";
                break;
            case 4:
                day = "Thursday - cycling!";
                break;
            case 5:
                day = "Friday - climbing!";
                break;
            case 6:
                day = "Saturday - cleaning!";
                break;
            case 7:
                day = "Sunday - vacation!";
                break;
            default:
                day = "It is wrong number day!";
        }
        System.out.print(day);
    }
}
