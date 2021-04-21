package com.oleksiuk;

public class Soldier_1 extends Soldier{
    //створюємо поля класу
    private int health = 1000;
    private String arsenal = "Knife(200)";
    private int broke =200;
    //створюємо змінну класу Soldier_3
    Soldier_3 soldier_3 = new Soldier_3("3");

    //створюємо конструктор класу
    //Alt + Insert -> Constructor
    public Soldier_1(String id) {
        super(id);
        this.health = health;
        this.arsenal = arsenal;
        this.broke = broke;
    }

    //Alt + Insert ->Getter and Setter (health, arsenal, broke)
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public String getArsenal() {
        return arsenal;
    }
    public void setArsenal(String arsenal) {
        this.arsenal = arsenal;
    }
    public int getBroke() {
        return broke;
    }
    public void setBroke(int broke) {
        this.broke = broke;
    }

    //солдат №1 брав участь у трьох раундах
    //метод описує здоров’я у першому раунді
    public String Soldier1_health1(){
        System.out.println("Soldier №1: 700 hp");
        return "";
    }
    //метод описує здоров’я у другому раунді
    public String Soldier1_health2(){
        System.out.println("Soldier №1: 200 hp");
        return "";
    }
    //метод описує здоров’я у третьому раунді
    public String Soldier1_health3(){
        System.out.println("Soldier №1: -100 hp\nSoldier №1 is died!");
        return "";
    }

    //солдат №1 атакує тільки у першому раунді
    public void Soldier1_round1(){
        System.out.println("Soldier №" + getId() + " attacks of Soldier №" + soldier_3.getId());
        //return "";
    }
}
