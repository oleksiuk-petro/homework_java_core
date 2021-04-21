/*
 Користувач вводить масив. Необхідно створити метод, який виводить найменший елемент масиву.
 */
package task_6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //вводимо розмірність масиву
        System.out.print("Enter zise of array: size=");
        Scanner scan_size = new Scanner(System.in);
        int size = scan_size.nextInt();

        //оголошуємо масив
        int [] array = new int [size];

        //вводимо елементи масиву
        System.out.println("------------------------");
        for(int i=0;i< array.length;i++){
            System.out.print("array["+i+"]=");
            Scanner scan_array = new Scanner(System.in);
            array[i] = scan_array.nextInt();
        }

        //виведемо елементи масиву
        System.out.println("------------------------");
        for(int i=0;i< array.length;i++){
            System.out.println("args["+i+"]="+array[i]);
        }

        //виводимо найменший елемент масиву
        System.out.println("------------------------");
        int number = findSmallestInt(array);
        System.out.println("Minimal element is array["+number+"]="+array[number]);
        System.out.println("------------------------");
    }

    //окремий метод, який знаходить найменший елемент масиву "args[]"
    public static int findSmallestInt(int[] array) {
        //заповнюємо проміжний масив
        int [] masiv = new int [array.length];
        for(int i=0;i< array.length;i++){
            masiv[i]=array[i];
        }

        //знаходимо найменший елемент масиву array[]
        int k=0;
        int min = masiv[0];
        for(int i=1;i< array.length;i++){
            if(masiv[i]<min){
                min=masiv[i];
                k=i;
            }
        }
        //повертаємо номер найменшого елементу масиву array[]
        return k;
    }
}
