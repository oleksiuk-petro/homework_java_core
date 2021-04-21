/*
В банк поклали m - гривень під n-% річних.
Яким буде вклад за k - років.
Користувач вводить:
    m - суму грошей
    n - процентна ставка
    k - кількість років
 */
package task_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //користувач вводить дані
        System.out.print("Summa of money: m=");
        Scanner scan_m = new Scanner(System.in);
        int m = scan_m.nextInt();
        System.out.print("Percent: n=");
        Scanner scan_n = new Scanner(System.in);
        int n = scan_n.nextInt();
        System.out.print("Numbers of years: k=");
        Scanner scan_k = new Scanner(System.in);
        int k = scan_k.nextInt();

        //виводимо загальну суму на екран
        System.out.println("Summa="+compoundPercentage(m, n, k));
    }
    public static double compoundPercentage(int a, int b, int c){
        //використовуємо приведення типів
        double new_a = (double)a; //сума грошей
        double new_b = (double)b; //відсоткова ставка
        double new_c = (double)c; //кількість років
        //повертаємо результат формули складних відсотків
        return new_a*Math.pow((1+0.01*new_b),new_c);
    }
}
