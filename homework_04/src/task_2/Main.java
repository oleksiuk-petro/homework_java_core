/*
Створити клас Кермо (Helm), Колесо (Wheel), Кузов (Body) - описати дані класи(getters, setters, toString). Всі поля повинні бути приватними. Додати методи які б виконували певні функції з полями, тобто збільшували розмір колеса у декілька разів, чи змінювали діаметр керма і т.д.. Створити клас Машина (Car), який матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо - як поля класу. Додати методи, які би змінювали стан полів класу , для виконання певних функцій, описати даний клас(getters, setters, toString). Всі поля повинні бути параметрами в конструкторі. В мейн методі , створити об`єкт Машина, запустити всі його методи.
 */
package task_2;

public class Main {
    public static void main(String[] args){
        //створюємо об’єкт класу Car
        Car a = new Car(5, 3.5, new Body("hatchback "), new Helm(6.8), new Wheel(9.4));

        //встановлюємо об’єкти
        a.getVik();
        a.getDiametr();
        a.getUsing();
        a.getSize();
        a.getType();

        //виводимо інформацію в консоль
        System.out.println(a);
    }
}
