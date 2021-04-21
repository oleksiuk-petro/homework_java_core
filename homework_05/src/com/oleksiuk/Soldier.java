package com.oleksiuk;

public class Soldier {
    //створюємо поле класу
    private String id;

    //створюємо конструктор класу Soldier
    //Alt + Insert -> Constructor
    public Soldier(String id) {
        this.id = id;
    }

    //створюємо Getter та Setter
    //Alt + Insert -> Getter and Setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    //метод, який виводить інформацію про перемогу
    public String victoryWar(){
        return "Битва завершилась!\nПереміг воїн №2\n";
    }
}
