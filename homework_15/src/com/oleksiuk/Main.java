/*
    Створити структуру Зооклуб.
    Створити клас Person, який описати двома полями: ім’я , вік.
    Створити клас Animal, який описати двома полями: тип тваринки(кіт, пес), ім’я тваринки.
    Кожна людина може мати багато тваринок.
    Але одна тваринка належить лише одній людині.
    Map<Person, List<Animal>> map;
    Реалізувати консольне меню(НЕ обов’язково), таким чином щоб можна було:
        - Додати людину до клубу
        - Додати тваринку до людини
        - Видалити(забрати) тваринку від людини
        - Видалити людину з клубу
        - Вивести на екран зооклуб
        - Вийти з програми
    Використати для побудови меню Switch.
 */
package com.oleksiuk;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //створюємо людей
        Person person1 = new Person("Name1", 1);
        Person person2 = new Person("Name2", 2);
        Person person3 = new Person("Name3", 3);

        //створюємо тварин
        Animal animal1 = new Animal("Dog", "NameDog1");
        Animal animal2 = new Animal("Dog", "NameDog2");
        Animal animal3 = new Animal("Dog", "NameDog3");
        Animal animal4 = new Animal("Dog", "NameDog4");
        Animal animal5 = new Animal("Dog", "NameDog5");
        Animal animal6 = new Animal("Cat", "NameCat6");
        Animal animal7 = new Animal("Cat", "NameCat7");
        Animal animal8 = new Animal("Cat", "NameCat8");

        //створюємо список тварин кожної людини
        List<Animal> list1 = new ArrayList<>();
        List<Animal> list2 = new ArrayList<>();
        List<Animal> list3 = new ArrayList<>();

        //до кожного списку додаємо тварин
        list1.add(animal1);
        list1.add(animal2);
        list1.add(animal3);
        list2.add(animal4);
        list2.add(animal5);
        list2.add(animal6);
        list3.add(animal7);
        list3.add(animal8);

        //створюємо мапу зооклубу
        Map<Person, List<Animal>> mapZooClub = new HashMap<>();

        //додаємо людей до зооклубу
        mapZooClub.put(person1, list1);
        mapZooClub.put(person2, list2);
        mapZooClub.put(person3, list3);

        System.out.println("Первинний mapZooClub:");
        //викликаємо метод виведення мапи на екран
        showMapZooClub(mapZooClub);

        System.out.println("Ви повинні вибрати одну опцію. Натисніть відповідну цифру:\n" +
                "1 - щоб додати людину до клубу\n" +
                "2 - щоб додати тваринку до людини\n" +
                "3 - щоб видалити (забрати) тваринку від людини\n" +
                "4 - щоб видалити людину з клубу\n" +
                "5 - щоб вийти з програми\n");
        Scanner scanKey = new Scanner(System.in);
        System.out.print("key = ");
        int key = scanKey.nextInt();
        switch (key) {
            case 1:
                //викликаємо метод додавання людини до мапи
                addPersonToClub(mapZooClub, addPerson4(), addList4());
                break;
            case 2:
                //викликаємо метод додавання тваринки до людини
                addAnimalToPerson(mapZooClub, addPerson4(), addList4());
                break;
            case 3:
                //викликаємо метод видалення тваринки 1 від людини 1
                deleteAnimalFromPerson(mapZooClub, person1, animal1);
                break;
            case 4:
                //викликаємо метод видалення людини
                deletePersonFromClub(mapZooClub, person2);
                break;
            case 5:
                //викликаємо метод виходу з програми
                exitProgram();
                break;
        }

        //викликаємо метод виведення мапи на екран
        System.out.println("Кінцевий mapZooClub:");
        showMapZooClub(mapZooClub);
    }

    //метод виведення мапи на екран
    public static void showMapZooClub(Map<Person, List<Animal>> mapZooClub) {
        for (Map.Entry<Person, List<Animal>> entry : mapZooClub.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    //метод створення person4
    public static Person addPerson4() {
        Person person4 = new Person("name4", 4); //створюємо 4-ту людину
        return person4;
    }

    //метод створення list4
    public static List<Animal> addList4() {
        List<Animal> list4 = new ArrayList<>(); //створюємо список для 4-ї людини
        return list4;
    }

    //метод додавання людини до клубу
    public static Map<Person, List<Animal>> addPersonToClub(Map<Person, List<Animal>> mapZooClub, Person person4, List<Animal> list4) {
        mapZooClub.put(person4, list4); //заносимо людину зі списком в мапу
        return mapZooClub; //метод повертає мапу
    }

    //метод додавання тваринки до людини
    //додаємо тваринок 9 та 10 до людини 3
    public static Map<Person, List<Animal>> addAnimalToPerson(Map<Person, List<Animal>> mapZooClub, Person person3, List<Animal> list3) {
        Animal animal9 = new Animal("Cat", "NameCat9");
        Animal animal10 = new Animal("Cat", "NameCat10");
        list3.add(animal9);
        list3.add(animal10);
        mapZooClub.put(person3, list3);
        return mapZooClub; //метод повертає мапу
    }

    //метод видалення тваринки від людини
    public static void deleteAnimalFromPerson(Map<Person, List<Animal>> mapZooClub, Person person1, Animal animal1) {
        //видаляємо тваринку 1 від людини 1
        mapZooClub.get(person1).remove(animal1);
    }

    //метод видалення людини із зооклубу
    public static void deletePersonFromClub(Map<Person, List<Animal>> mapZooClub, Person person2) {
        mapZooClub.remove(person2);
    }

    //метод виходу з програми
    public static void exitProgram() {
        System.exit(0);
    }
}
