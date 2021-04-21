/*
    Користувач вводить 10 чисел, в кінці програма рахує скільки додатних, від’ємних та нулів введено.
*/
package code_time_task_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //оголошуємо масив розмірністю 10 елементів
        int [] array = new int[10];

        //вводимо елементи масиву
        for(int i=0;i< array.length;i++) {
            System.out.print("array["+i+"]=");
            Scanner scan_element = new Scanner(System.in);
            array[i] = scan_element.nextInt();
        }
        System.out.println("--------------------");

        //виводимо наші елементи масиву
        for(int i=0;i< array.length;i++){
            System.out.println("array["+i+"]="+array[i]);
        }
        System.out.println("--------------------");

        //рахуємо кількість нулів та додатних і від’ємних елементів
        int numberNull=0;
        int numberPositive = 0;
        int numberNegative = 0;
        for(int i=0;i< array.length;i++){
            if(array[i]==0){
                numberNull++;
            }
            else if(array[i]>0){
                numberPositive++;
            }
            else{
                numberNegative++;
            }
        }

        //виводимо результати обчислень
        System.out.println("number_null="+numberNull);
        System.out.println("number_positive="+numberPositive);
        System.out.println("number_negative="+numberNegative);
    }
}
