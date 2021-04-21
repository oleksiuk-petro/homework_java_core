/*
    Написати метод, у якому вводимо розмірність масиву, вводимо сам масив і виводимо новий масив зі збільшеними вдвічі елементами.
*/
package task_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //вводимо розмірність масиву
        System.out.print("Enter zise of array: size=");
        Scanner scan_size = new Scanner(System.in);
        int size = scan_size.nextInt();

        //оголошуємо масив
        int [] arr = new int [size];

        //вводимо елементи масиву
        System.out.println("------------------------");
        for(int i=0;i< arr.length;i++){
            System.out.print("arr["+i+"]=");
            Scanner scan_arr = new Scanner(System.in);
            arr[i] = scan_arr.nextInt();
        }

        //виведемо елементи масиву
        System.out.println("------------------------");
        for(int i=0;i< arr.length;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }

        //виводимо елементи нового масиву
        System.out.println("------------------------");
        int [] new_arr = map(arr);
        for(int i=0;i<new_arr.length;i++){
            System.out.println("new_arr["+i+"]="+new_arr[i]);
        }
        System.out.println("------------------------");
    }
    //окремий метод, який збільшує елементи масиву "arr[]"
    public static int[] map(int[] arr) {
        int [] masiv = new int [arr.length];
        //збільшуємо елементи масиву в 2 рази
        for(int i=0;i< arr.length;i++){
            masiv[i]=2*arr[i];
        }
        //повертаємо масив в метод "main"
        return masiv;
    }
}
