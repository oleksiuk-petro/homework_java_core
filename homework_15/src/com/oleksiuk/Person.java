package com.oleksiuk;

public class Person {

    //оголошуємо поля класу
    private String name;
    private int age;

    //конструктор класу
    //Alt + Insert -> Constructor (name:String, age:int)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //перевизначаємо методи Getter та Setter
    //Alt + Insert -> Getter and Setter (name:String, age:int)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //перевизначаємо метод toString() для коректного виведення даних
    //Alt + Insert -> toString() (name:String, age:int)
    @Override
    public String toString() {
        return "Person( " + name + ", age=" + age + ')';
    }

    //перевизначаэмо методи equals() та hashCode()
    //Alt + Insert -> equals() and hashCode() -> IntelliJ Idea
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }
    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }
}
