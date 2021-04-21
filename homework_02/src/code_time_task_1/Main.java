/*
    Запропонувати користувачу вводити числа доти, поки він не введе "0". Після того, як користувач вводить "0" вивести на екран кількість чисел та суму чисел.
*/
package code_time_task_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //оголошуємо змінну типу "int"
        int sc1;
        //оголошуємо змінну типу "Integer"
        Integer summa = 0;
        //оголошуємо масив з елементами "обгортки" типу Integer
        List<Integer> list = new ArrayList<>();
        //цикл рахує кількусть введених чисел
        do{
            //вводимо змінну в консоль
            System.out.print("Your number: ");
            Scanner scan1 = new Scanner(System.in);
            sc1 = scan1.nextInt();
            //введена змінна записується в масив list (autoboxing - автоупаковка)
            list.add(sc1);
            summa = summa +sc1;
            //поки змінна не дорівнює "0"
        }while(sc1!=0);
        //виводимо розмір масиву
        System.out.println("size list[] is "+list.size());
        //виводимо суму всіх елементів масиву
        System.out.println("summa: "+summa);
    }
}
