/*
Створіть функцію, яка передає персоналізоване привітання. Ця функція приймає два параметри: ім’я та власник. Використовуйте умови, щоб повернути належне повідомлення інакше:
 case                          return
 name equals owner             "Hello boss"
 otherwise                     "Hello guests"
 */
package task_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //вводимо ім’я
        String name = null;
        System.out.print("Do your name is Daniel or Greg? Enter your name, please: ");
        Scanner scan_name = new Scanner(System.in);
        name = scan_name.nextLine();

        //вводимо прізвище
        String owner = null;
        System.out.print("Do your surname is Daniel? Enter your surname, please: ");
        Scanner scan_owner = new Scanner(System.in);
        owner = scan_owner.nextLine();

        //отримуємо повернутий рядок із методу "greet"
        String welcome = greet(name,owner);
        System.out.print(welcome);
    }

    //метод "greet", який перевіряє введені дані та обирає варіант привітання
    static String greet(String name,String owner) {
        String a = "Daniel";
        String b = "Greg";
        String text = null;
        //в розгалуженні порівнюємо дані з метода "main" та "a" і "b"
        if((name.equals(a))&&(owner.equals(a))){
            text = "Hello boss!";
        }
        else if((name.equals(b))&&(owner.equals(a))){
            text = "Hello guests!";
        }
        else{
            text = "You entered incorrect data!";
        }
        //повертаємо результат в метод "main"
        return text;
    }
}
