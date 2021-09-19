public class People {

    //оголошуємо поля класу
    public String name;
    public int age;
    public String sex;

    //конструктор класу People
    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //Getter and Setter

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //перевизначаємо метод toString()
    @Override
    public String toString() {
        return name + ", " + age + ", " + sex + "\n";
    }
}
