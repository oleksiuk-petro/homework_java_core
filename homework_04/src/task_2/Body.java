package task_2;
//клас Кузов
public class Body {
    //оголошуємо поле
    private String type;

    //створюємо конструктор з параметрами
    Body (String type) {
        this.type=type;
    }
    //Alt + Insert + Getter and Setter
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    //створюємо метод, який змінює тип
    public void changeType(String type1 ) {
        type= type1;
    }

    //створюємо метод toString, який повертає рядок
    public String toString() {
        return "Body [type=" + type + "]";
    }
}
