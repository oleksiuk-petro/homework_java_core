package com.oleksiuk;

public class Soldier_2 extends Soldier{
    //створюємо поля класу
    private int health = 800;
    private String arsenal = "Saber(300)";
    private int broke =300;
    //створюємо змінну класу Soldier_1
    Soldier_1 soldier_1 = new Soldier_1("1");
    //створюємо змінну класу Soldier_3
    Soldier_3 soldier_3 = new Soldier_3("3");

    //створюємо конструктор класу
    //Alt + Insert -> Constructor
    public Soldier_2(String id) {
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
    public String Soldier2_round1(){
        System.out.println("Soldier №" + getId() + " attacks of Soldier №" + soldier_1.getId());
        return "";
    }
    public String Soldier2_round2(){
        System.out.println("Soldier №" + getId() + " attacks of Soldier №" + soldier_3.getId());
        return "";
    }
    public String Soldier2_round3(){
        System.out.println("Soldier №" + getId() + " attacks of Soldier №" + soldier_1.getId());
        return "";
    }
}
