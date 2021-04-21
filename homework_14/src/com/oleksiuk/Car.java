package com.oleksiuk;

public class Car {

    //оголошуємо поля класу
    private String name;
    private int number;

    //створюємо конструктор класу
    //Alt + Insert -> Constructor (name:String, number:int)
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //створюємо Getter та Setter для полів класу
    //Alt + Insert -> Getter and Setter (name:String, number:int)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    //перевизначаємо метод toString() для коректного виведення даних
    //Alt + Insert -> toString() (name:String, number:int)
    @Override
    public String toString() {
        return name +": " + number;
    }
}
