/*
Створити клас Robot i класи CoffeRobot, RobotDancer, RobotCoocker, які будуть нащадками Robot. Оголосити в Robot метод work(), в якому слід описати роботу яку буде виконувати кожен з роботів (тобто, метод повинен пронаслідуватись):
• Для Robot, щоб на консоль виводився текст «Я Robot – я просто працюю».
• Для CoffeRobot, щоб на консоль виводився текст «Я CoffeRobot – я варю каву».
• Для RobotDancer, щоб на консоль виводився текст «Я RobotDancer – я просто танцюю».
• Для RobotCoocker, щоб на консоль виводився текст «Я RobotCoocker – я просто готую».
Створити в Main класі екземпляри вищеописаних класів і викликати до кожного з них метод work().
Створити в Main класі масив класу Robot , заповнити масив екземплярами вищеописаних класів. Створити цикл for , пройтись по всіх елементах масиву і викликати для кожного елемент масиву метод work().
 */
package task_1;
public class Main {
    public static void main(String[] args) {
        //створюємо масив класу Robot
        Robot[] masiv = new Robot[4];

        //заповнюємо масив
        masiv[0] = new Robot();
        masiv[1] = new RobotCoocker();
        masiv[2] = new CoffeRobot();
        masiv[3] = new RobotDancer();

        //за допомогою цикла проходимось по масиву і методом work виводимо інформацію
        for(int i = 0; i < masiv.length; i++){
            masiv[i].work();
        }
    }
}
