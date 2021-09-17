package task_2;

public class Circle {
    //описуємо глобальні поля
    private double radius;
    private double diameter;

    //створюємо конструктор з двома параметрами
    Circle(double new_radius, double new_diameter) {
        this.radius = new_radius;
        this.diameter = new_diameter;
    }

    //створюємо методи Get і Set для поля radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //створюємо методи Get і Set для поля diameter
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
