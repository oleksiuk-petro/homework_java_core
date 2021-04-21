package com.oleksiuk;

public class Animal {
    //оголошуємо поля класу
    private String type;
    private String name;

    //конструктор класу
    //Alt + Insert -> Constructor (login:String, password:String)
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    //перевизначаємо методи Getter та Setter
    //Alt + Insert -> Getter and Setter (login:String, password:String)
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //перевизначаємо метод toString() для коректного виведення даних
    //Alt + Insert -> toString() (login:String, password:int)
    @Override
    public String toString() {
        return "Animal( " + type + ", " + name + ')';
    }

    //перевизначаэмо методи equals() та hashCode()
    //Alt + Insert -> equals() and hashCode() -> IntelliJ Idea
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        if (getType() != null ? !getType().equals(animal.getType()) : animal.getType() != null) return false;
        return getName() != null ? getName().equals(animal.getName()) : animal.getName() == null;
    }
    @Override
    public int hashCode() {
        int result = getType() != null ? getType().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
