package com.oleksiuk;

public class Soldier_3 extends Soldier{
    //створюємо поля класу
    private int health = 500;
    private String arsenal = "Pistol(500)";
    private int broke =500;

    //створюємо змінну класу Soldier_1
    //не можу це зробити - отримую помилку: "Exception in thread "main" java.lang.StackOverflowError"
    //Soldier_1 soldier_1 = new Soldier_1("1");

    //створюємо конструктор класу
    //Alt + Insert -> Constructor
    public Soldier_3(String id) {
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

    //солдат №3 брав участь у трьох раундах
    //метод описує здоров’я у першому раунді
    public String Soldier3_health1(){
        System.out.println("Soldier №3: 300 hp");
        return "";
    }
    //метод описує здоров’я у другому раунді
    public String Soldier3_health2(){
        System.out.println("Soldier №3: 0 hp\nSoldier №3 is died!");
        return "";
    }

    //солдат №3 атакує тільки у першому раунді
    public String Soldier3_round1(){
        //не можу це зробити - отримую помилку: "Exception in thread "main" java.lang.StackOverflowError"
        //System.out.println("Soldier №" + getId() + " attacks of Soldier №" + soldier_1.getId());
        System.out.println("Soldier №" + getId() + " attacks of Soldier №1");
        return "";
    }
}
