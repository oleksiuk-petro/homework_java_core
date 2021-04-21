public class Person {

    //створюємо поля класу
    private String name;
    private int age;

    //створюємо порожній конструктор
    public Person(){
    }

    //створюємо повний конструктор
    //Alt + Insert -> Constructor (name:String, age:int)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //створюємо методи Getter and Setter
    //Alt + Insert -> Getter and Setter (name:String, age:int)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() { return age; }
    public void setAge(int age) {
        this.age = age;
    }

    //перевизначаємо метод toString()
    //Alt + Insert -> toString() (name:String, age:int)
    @Override
    public String toString() {
        return "name='" + name + ", age=" + age;
    }
}
