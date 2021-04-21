package task_3;

public class Animal {
    //оголошуємо поля класу
    private String name;
    private int speed;
    private int vik;

    //створюємо конструктор з визначеними параметрами
    //Alt + Insert -> Constructor
    public Animal(String name, int speed, int vik) {
        this.name = name;
        this.speed = speed;
        this.vik = vik;
    }

    //створюємо get та set для всіх полів класу
    //Alt + Insert -> Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getVik() {
        return vik;
    }
    public void setVik(int vik) {
        this.vik = vik;
    }
}
