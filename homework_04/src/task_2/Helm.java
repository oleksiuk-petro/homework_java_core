package task_2;
//клас Кермо
public class Helm {
    //оголошуємо поле
    private double diametr;

    //створюємо конструктор з параметрами
    Helm(double diametr){
        this.diametr = diametr;
    }

    //Alt + Insert + Getter and Setter
    public double getDiametr() {
        return diametr;
    }
    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    //створюємо метод, який змінює діаметр
    public void changeDiametr(double diametr1){
        diametr1 = diametr*0.75;
    }

    //створюємо метод toString, який повертає рядок
    public String toString(){
        return "Helm [diametr=" + diametr +"]";
    }
}
