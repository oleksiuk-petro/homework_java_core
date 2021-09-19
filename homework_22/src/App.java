public class App {

    public static void main(String[] args) {

        //lambda-вираз для знаходження максимального елемента
        CustomInterface maxValue = (x, y, z) -> {
            if ((x > y) && (x > z))
                return x;
            else if ((y > x) && (y > z))
                return y;
            else
                return z;
        };

        //lambda-вираз для знаходження середнього арифметичного
        CustomInterface averageValue = (x, y, z) -> (x + y + z) / 3;

        //lambda-вираз для знаходження суми елементів
        CustomInterface sumValues = (x, y, z) -> (x + y + z);

        //задаємо значення для змінних
        int a = 1;
        int b = 2;
        int c = 3;

        //викликаємо lambda-функції для змінних
        int maximum = maxValue.calculate(a, b, c);
        int middle = averageValue.calculate(a, b, c);
        int sum = sumValues.calculate(a, b, c);

        //виводимо результати обчислень
        System.out.println("maximum = " + maximum);
        System.out.println("middle = " + middle);
        System.out.println("sum = " + sum);
    }
}
