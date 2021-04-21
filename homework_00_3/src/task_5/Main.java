/*
    Створити програму, що виводить на екран найближче до 10 з двох чисел, записаних в змінні m та n.
 */
package task_5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //вводимо змінну m
        System.out.print("Enter variable: m=");
        Scanner scan_m = new Scanner(System.in);
        double m = scan_m.nextDouble();

        //вводимо змінну n
        System.out.print("Enter variable: n=");
        Scanner scan_n = new Scanner(System.in);
        double n = scan_n.nextDouble();

        //знаходимо модуль різниці між 10 та змінною m
        double dif_m = Math.abs(m-10.0);

        //знаходимо модуль різниці між 10 та змінною n
        double dif_n = Math.abs(n-10.0);

        //порівнюємо модулі різниць
        if(dif_m>dif_n){
            System.out.println("n="+n+" is closer to 10");
        }
        else if(dif_n>dif_m){
            System.out.println("m="+m+" is closer to 10");
        }
        else{
            System.out.println("m=n="+m);
        }
    }
}
