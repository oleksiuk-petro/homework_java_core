//в цьому класі задаємо реалізацію всім методам інтерфейсів
package task2.second;
import task2.first.Numerable;
public class MyCalculator implements Numerable {

    //оголошуємо поля класу
    private double variable1;
    private double variable2;

    //створюємо конструктор класу з двома змінними
    //Alt + Insert -> Constructor (variable1, variable 2)
    public MyCalculator(double variable1, double variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    //виконуємо імплементацію методів усіх інтерфейсів
    //Alt + Insert -> Implement (choose all methods)
    @Override
    public void plus() {
        double resultPlus = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + resultPlus);
    }
    @Override
    public void minus() {
        double resultMinus = variable1 - variable2;
        System.out.println(variable1 + " - " + variable2 + " = " + resultMinus);
    }
    @Override
    public void multiply() {
        double resultMultiply = variable1*variable2;
        System.out.println(variable1 + " * " + variable2 + " = " + resultMultiply);
    }
    @Override
    public void devide() {
        double resultDevide = variable1/variable2;
        System.out.println(variable1 + " / " + variable2 + " = " + resultDevide);
    }
}
