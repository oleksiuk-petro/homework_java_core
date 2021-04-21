/*
Створіть інтерфейси:
- Plus з методoм додати;
- Minus з методoм відняти;
- Multiply з методoм помножити;
- Devide з методoм поділити.
Створіть інтерфейс Numerable,
який наслідуватиметься від інтерфейсів Plus, Minus, Multiply, Devide в пакеті first.
Створіть пакет second в якому створіть клас MyCalculator
і заімплементіть даному класу інтерфейс Numerable та задайте реалізацію всім методам даного інтерфейсу.
Створіть метод main та створіть об’єкт класу MyCalculator , до якого викличте всі його методи .
Результати арифметичних операцій виведіть на консоль.
 */
package task2.second;
public class Main {
    public static void main(String[] args){

        //створюємо об’єкт класу MyCalculator
        MyCalculator counter = new MyCalculator(100,50);

        //викликаємо методи до нашої змінної класу
        counter.plus();
        counter.minus();
        counter.multiply();
        counter.devide();
    }
}
