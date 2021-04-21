/*
    Користувач вводить розмірність масиву.
    Масив повинен містити рядкові величини.
    Користувач вводить або "bad" або "good".
    Якщо масив не містить значення "good, то виводиться повідомлення "Fail!".
    Якщо масив містить одне або два значення "good", то виводиться повідомлення "Publish!".
    Якщо масив містить більше двох значень "good", то виводиться повідомлення "I smell a series!".
*/
package task_7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //вводимо розмірність масиву
        int size;
        System.out.print("Enter size of array: size=");
        Scanner scan_size = new Scanner(System.in);
        size = scan_size.nextInt();
        System.out.println("--------------------");

        //оголощуємо масив рядків
        String[] array = new String[size];

        //вводимо масив рядків
        System.out.println("Please, enter words \"good\" or \"bad");
        for(int i=0;i< array.length;i++){
            System.out.print("array ["+i+"]=");
            Scanner scan_array = new Scanner(System.in);
            array[i] = scan_array.nextLine();
        }
        System.out.println("--------------------");

        //виводимо масив рядків
        for(int i=0;i< array.length;i++){
            System.out.println("array ["+i+"]="+array[i]);

        }
        //викликаємо метод, який виводить повідомлення
        String welcome = well(array);
        System.out.println(welcome);
    }
    public static String well(String[] array) {
        //тимчасова змінна, яку повертатиме метод "well"
        String text = null;

        //в циклі рахуємо кількість слів "good"
        int k=0;
        String a="good";
        for(int i=0;i< array.length;i++){
            if(array[i].equals(a)){
                k++;
            }
        }
        System.out.println(k);

        //визначаємо текст повідомлення, яке буде виводитись
        if(k<=0){
            text = "Fail!";
        }
        else if((k>0)&&(k<3)){
            text = "Publish!";
        }
        else{
            text = "I smell a series!";
        }
        return text;
    }
}
