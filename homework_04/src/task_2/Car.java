package task_2;
//клас Машина
public class Car {
    private int vik;
    private double using;
    private Body type;
    private Helm diametr;
    private Wheel size;

    //конструктор з параметрами
    public Car(int vik, double using, Body type, Helm diametr, Wheel size) {
        this.vik = vik;
        this.using = using;
        this.type = type;
        this.diametr = diametr;
        this.size = size;
    }

    //Alt + Insert + Getter and Setter
    public int getVik() {
        return vik;
    }
    public void setVik(int vik) {
        this.vik = vik;
    }
    public double getUsing() {
        return using;
    }
    public void setUsing(double using) {
        this.using = using;
    }
    public Body getType() {
        return type;
    }
    public void setType(Body type) {
        this.type = type;
    }
    public Helm getDiametr() {
        return diametr;
    }
    public void setDiametr(Helm diametr) {
        this.diametr = diametr;
    }
    public Wheel getSize() {
        return size;
    }
    public void setSize(Wheel size) {
        this.size = size;
    }

    //метод, який змінює вік
    public  void changeVik(int vik1){
        vik = vik1;
    }

    //метод, який змінює використання
    public void changeUsing(double using1){
        using = using1;
    }

    //створюємо метод toString, який повертає рядок
    public String toString(){
        return "Car\nvik=" + vik + ",\nusing=" + using + ",\ntype=" + type + ",\ndiametr=" + diametr + ",\nsize=" + size + ",\ngetVik()=" + getVik() + ",\ngetUsing()=" + getUsing() + ",\ngetType()=" + getType() + ",\ngetDiametr()=" + getDiametr() + ",\ngetSize()=" + getSize() ;
    }
}
