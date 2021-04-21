/*
Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем, парним або непарним.
Якщо користувач введе не ціле число, то повідомляти йому про помилку.
 */
package task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    //вводимо дійсне число через консоль
        System.out.print("Введіть ціле число: a=");
        Scanner scan_a = new Scanner(System.in);
        double a = scan_a.nextDouble();

        //викликаємо метод визначення парності числа
        parityNumber(a);
    }

    //пишемо метод визначення парності введеного числа
    public static void parityNumber(double var){
        if((Math.floor(var)-var)!=0){
            //передаємо аргумент, він виведеться у вікні помилок
            //throw (англ. кинути)
            throw new IllegalArgumentException("Введене число " + var + " НЕ ціле!");
        }
        else if(((var/2.0)-Math.floor(var/2.0))!=0){
            System.out.println("Введене число " + var + " НЕПАРНЕ!");
        }
        else{
            System.out.println("Введене число " + var + " ПАРНЕ!");
        }
    }
}
