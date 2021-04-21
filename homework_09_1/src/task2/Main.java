/*
Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел, введених користувачем.
Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.
 */
package task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //вводимо перше дійсне число через консоль
        System.out.print("Введіть ціле число: a=");
        Scanner scan_a = new Scanner(System.in);
        double a = scan_a.nextDouble();

        //вводимо друге дійсне число через консоль
        System.out.print("Введіть ціле число: b=");
        Scanner scan_b = new Scanner(System.in);
        double b = scan_b.nextDouble();

        //викликаємо метод визначення парності числа
        System.out.println(summaNumbers(a,b));
    }

    //пишемо метод визначення парності введеного числа
    public static double summaNumbers(double var1, double var2){
        double summa;
        if(((Math.floor(var1)-var1)!=0) || ((Math.floor(var2)-var2)!=0)){
            //передаємо аргумент, він виведеться у вікні помилок
            //throw (англ. кинути)
            throw new IllegalArgumentException("Якесь ведене число НЕ ціле!");
        }
        else{
            summa = var1 + var2;
        }
        return summa;
    }
}
