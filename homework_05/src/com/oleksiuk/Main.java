/*
Зробити міні-гру битва.
Створити одну сутність - шаблонний варіант воїна.
Зробити декілька типів наслідників.
Кожен з них має свої особливості, наприклад hp, зброя і т.д.
Тут потрібно проявити свою фантазію і додавати класи, які хочеться.
Потім має бути битва.
Воїни можуть атакувати, якщо вони атакують, то життя зменшується.
На кожному етапі показувати інформацію.
 */
package com.oleksiuk;

public class Main {
    public static void main(String[] args) {
	    //створюємо об’єкти класів
        Soldier soldier = new Soldier("");
        Soldier1 soldier1 = new Soldier1("1");
        Soldier2 soldier2 = new Soldier2("2");
        Soldier3 soldier3 = new Soldier3("3");

        //виводимо інформацію про солдатів
        System.out.println("--------------------");
        System.out.println("Soldier №" + soldier1.getId() + "\nHealth: " + soldier1.getHealth() + "\nArsenal: " + soldier1.getArsenal() + "\n--------------------");
        System.out.println("Soldier №" + soldier2.getId() + "\nHealth: " + soldier2.getHealth() + "\nArsenal: " + soldier2.getArsenal() + "\n--------------------");
        System.out.println("Soldier №" + soldier3.getId() + "\nHealth: " + soldier3.getHealth() + "\nArsenal: " + soldier3.getArsenal() + "\n--------------------");

        //виводимо повідомлення про бойові дії
        System.out.println("       WAR!       ");

        //раунд 1
        System.out.println(soldier2.soldier2Round1() + "\n" + soldier1.soldier1Health1());
        soldier1.soldier1Round1();
        System.out.println("\n");
        soldier3.soldier3Health1();
        System.out.println(soldier3.soldier3Round1() + "\n" + soldier1.soldier1Health2());

        //раунд 2
        System.out.println(soldier2.soldier2Round2() + "\n" + soldier3.soldier3Health2());

        //раунд 3
        System.out.println(soldier2.soldier2Round3() + "\n" + soldier1.soldier1Health3());

        //виводимо повідомлення про завершення війни
        System.out.println(soldier.victoryWar());
    }
}
