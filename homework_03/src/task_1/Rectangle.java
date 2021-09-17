package task_1;

public class Rectangle {
    //описуємо глобальні поля
    private double width; //ширина
    private double length; //довжина

    //створюємо конструктор без параметрів
    Rectangle() {
    }

    //створюємо конструктор з двома параметрами
    Rectangle(double new_width, double new_length) {
        this.width = new_width;
        this.length = new_length;
    }

    //створюю метод Get і Set для поля width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //створюю метод Get і Set для поля length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
