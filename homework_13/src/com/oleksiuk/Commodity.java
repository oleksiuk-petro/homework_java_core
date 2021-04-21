package com.oleksiuk;

public class Commodity {

    //оголошуємо поля класу
    private String name; //назва товару
    private int weight; //вага товару
    private int length; //довжина товару
    private int width; //ширина товару

    //створюємо конструктор класу
    //Alt + Insert -> Constructor (all variables)
    public Commodity(String name, int weight, int length, int width) {
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    //створюємо Getter та Setter для всіх полів класу
    //Alt + Insert -> Getter and Setter (all variables)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    //перевизначаємо метод toString() для коректного виведення інформації
    //Alt + Insert -> toString() (all variables)
    @Override
    public String toString() {
        return "name = " + name + ", weight = " + weight + ", length = " + length + ", width = " + width + "\n";
    }
}
