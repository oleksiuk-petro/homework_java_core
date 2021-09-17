/*
Описати клас Rectangle, в якому буде описано поля: довжина, ширина. Описати дані поля в конструкторі. Створити конструктор з парметрами і без параметрів. В конструкторі без параметрів описати свої дані. Тобто створюючи об’єкт, за вибору даного конструктору, ви отримаєте прямокутник даного розміру. Написати методи, які будуть розраховувати площу та периметр. В Main класі продемонструвати створення об’єктів використовуючи два конструктори. Вивести на консоль площу і периметр прямокутника.
Вивід на консолі повинен мати наступний вигляд:
"Площа прямокутника = ...",
"Периметр прямокутника = ...".
 */
package task_1;

public class Main {
    public static void main(String[] args) {
        //викликаємо порожній конструктор
        Rectangle figure_empty = new Rectangle();
        figure_empty.setWidth(5);
        figure_empty.setLength(6);
        //виводимо в консоль площу та периметр прямокутника (порожній конструктор)
        System.out.println("--------------------");
        System.out.println("Empty constructor:");
        System.out.println("width=" + figure_empty.getWidth());
        System.out.println("length=" + figure_empty.getLength());
        System.out.println("Area of rectangle = " + figure_empty.getWidth() * figure_empty.getLength());
        System.out.println("Perimeter of rectangle = " + 2 * (figure_empty.getWidth() + figure_empty.getLength()));

        //викликаємо  конструктор з двома параметрами
        Rectangle figure_full = new Rectangle(3, 4);
        //виводимо в консоль площу та периметр прямокутника (конструктор з двома параметрами)
        System.out.println("--------------------");
        System.out.println("Empty constructor:");
        System.out.println("width=" + figure_full.getWidth());
        System.out.println("length=" + figure_full.getLength());
        System.out.println("Area of rectangle = " + figure_full.getWidth() * figure_full.getLength());
        System.out.println("Perimeter of rectangle = " + 2 * (figure_full.getWidth() + figure_full.getLength()));
        System.out.println("--------------------");
    }
}
