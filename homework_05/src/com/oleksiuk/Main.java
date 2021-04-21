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
        Soldier_1 soldier_1 = new Soldier_1("1");
        Soldier_2 soldier_2 = new Soldier_2("2");
        Soldier_3 soldier_3 = new Soldier_3("3");

        //виводимо інформацію про солдатів
        System.out.println("--------------------");
        System.out.println("Soldier №" + soldier_1.getId() + "\nHealth: " + soldier_1.getHealth() + "\nArsenal: " + soldier_1.getArsenal() + "\n--------------------");
        System.out.println("Soldier №" + soldier_2.getId() + "\nHealth: " + soldier_2.getHealth() + "\nArsenal: " + soldier_2.getArsenal() + "\n--------------------");
        System.out.println("Soldier №" + soldier_3.getId() + "\nHealth: " + soldier_3.getHealth() + "\nArsenal: " + soldier_3.getArsenal() + "\n--------------------");

        //виводимо повідомлення про бойові дії
        System.out.println("       WAR!       ");

        //раунд 1
        System.out.println(soldier_2.Soldier2_round1() + "\n" + soldier_1.Soldier1_health1());
        soldier_1.Soldier1_round1();
        System.out.println("\n");
        soldier_3.Soldier3_health1();
        System.out.println(soldier_3.Soldier3_round1() + "\n" + soldier_1.Soldier1_health2());

        //раунд 2
        System.out.println(soldier_2.Soldier2_round2() + "\n" + soldier_3.Soldier3_health2());

        //раунд 3
        System.out.println(soldier_2.Soldier2_round3() + "\n" + soldier_1.Soldier1_health3());

        //виводимо повідомлення про завершення війни
        System.out.println(soldier.victoryWar());
    }
}
