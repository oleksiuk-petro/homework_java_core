/*
    Написати окремий метод, який заповнюватиме масив і вивести елементи масиву через метод Main.
 */
package task_1;

public class Main {
    //написати метод, який заповнюватиме масив
    public static void main(String[] args) {
        //отримуємо повернутий масив
        int [] masiv = monkeyCount(4);
        //виводимо повернутий масив у консоль
        for(int k=0;k<masiv.length;k++){
            System.out.println(masiv[k]);
        }
    }
    //власне, окремий метод, який заповнює масив
    public static int[] monkeyCount(final int n) {
        //оголошуємо масив
        int array[] = new int[n];
        //заповнюємо масив
        for(int i=0;i<n;i++){
            array[i]=i*2;
        }
        //повертаємо масив у "main"
        return array;
    }
}