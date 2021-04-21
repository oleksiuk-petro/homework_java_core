/*
Створити свій Exception(MyException). Створити клас Methods.
Описати в ньому методи, які б розраховували додавання, віднімання, множення, ділення двох змінних.
При цьому врахувати:
- Якщо a<0 і b<0 викидаємо IllegalArgumentException
- Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
- Якщо a=0 і b=0 викидаємо IllegalAccessException
- Якщо a>0 і b>0 викидаємо MyException
- Протестувати всі можливі варіанти, і вивести все на консоль.
 */
package task3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IllegalAccessException, MyException{

        //вводимо перше дійсне число через консоль
        System.out.print("Введіть ціле число: a=");
        Scanner scan_a = new Scanner(System.in);
        double a = scan_a.nextDouble();

        //вводимо друге дійсне число через консоль
        System.out.print("Введіть ціле число: b=");
        Scanner scan_b = new Scanner(System.in);
        double b = scan_b.nextDouble();

        //створюю змінну класу Methods
        Methods result = new Methods();

        //викидаємо IllegalArgumentException
        if((a<0)&&(b<0)){
            //передаємо аргумент, він виведеться у вікні помилок
            //throw (англ. кинути)
            throw new IllegalArgumentException("a<0 і b<0 -> IllegalArgumentException");
        }
        else if(((a==0)&&(b!=0))||((b==0)&&(a!=0))){
            //передаємо аргумент, він виведеться у вікні помилок
            //throw (англ. кинути)
            throw new ArithmeticException("(a=0 і b!=0) або (b=0 і a!=0) -> ArithmeticException");
        }
        else if((a==0)&&(b==0)){
            //передаємо аргумент, він виведеться у вікні помилок
            //throw (англ. кинути)
            throw new IllegalAccessException("a=0 і b=0 -> IllegalAccessException");
        }
        else if((a>0)&&(b>0)){
            throw new MyException("a>0 і b>0 -> MyException");
        }

        //викликаємо всі методи із класу Methods
        result.addition(a,b);
        result.subtraction(a,b);
        result.multiplication(a,b);
        result.division(a,b);
    }
}
