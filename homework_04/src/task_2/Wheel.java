package task_2;
//клас Колесо
public class Wheel {
    //оголошуємо поле
    private double size;

    //створюємо конструктор з параметрами
    Wheel(double size){
        this.size = size;
    }

    //Alt + Insert + Getter and Setter
    public double getDiametr() {
        return size;
    }
    public void setDiametr(double diametr) {
        this.size = diametr;
    }

    //створюємо метод, який змінює розмір
    public void changeSize(double size1){
        size1 = size + 2.5;
    }

    //створюємо метод toString, який повертає рядок
    public String toString(){
        return "Wheel [size=" + size +"]";
    }
}
