package com.oleksiuk;

public class Soldier2 extends Soldier{
    //створюємо поля класу
    private int health = 800;
    private String arsenal = "Saber(300)";
    private int broke =300;
    //створюємо змінну класу Soldier_1
    Soldier1 soldier1 = new Soldier1("1");
    //створюємо змінну класу Soldier_3
    Soldier3 soldier3 = new Soldier3("3");

    //створюємо конструктор класу
    //Alt + Insert -> Constructor
    public Soldier2(String id) {
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

    //солдат №2 брав участь у трьох раундах
    public String soldier2Round1(){
        System.out.println("Soldier №" + getId() + " attacks of Soldier №" + soldier1.getId());
        return "";
    }
    public String soldier2Round2(){
        System.out.println("Soldier №" + getId() + " attacks of Soldier №" + soldier3.getId());
        return "";
    }
    public String soldier2Round3(){
        System.out.println("Soldier №" + getId() + " attacks of Soldier №" + soldier1.getId());
        return "";
    }
}
