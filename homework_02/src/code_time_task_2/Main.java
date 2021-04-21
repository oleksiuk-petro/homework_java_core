/*
    Вивести суму всіх цілих чисел з проміжку, який введе користувач [a,b].
*/
package code_time_task_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //вводимо число "a"
        System.out.print("a=");
        Scanner scan_a = new Scanner(System.in);
        int a = scan_a.nextInt();
        //вводимо число "b"
        System.out.print("b=");
        Scanner scan_b = new Scanner(System.in);
        int b = scan_a.nextInt();
        //виконуємо автоупаковку (autoboxing)
        Integer var_a = a;
        Integer var_b = b;
        //виводимо суму елементів між двома числами [a,b]
        System.out.println(sumNum(var_a,var_b));
    }
    //метод, який рахує суму цілих чисел з проміжку
    public static Integer sumNum(Integer var_a,Integer var_b){
        //знаходимо мінімальний та максимальний елементи
        Integer min = Math.min(var_a,var_b);
        Integer max = Math.max(var_a,var_b);
        Integer sum=0;
        //цикл рахує суму цільх чисел в проміжку
        for (int i=min;i<=max;i++){
            sum+=i;
        }
        return sum;
    }
}
