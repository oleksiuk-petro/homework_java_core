package task_1;
public class Robot{
    //оголошуємо поля класу
    private String name;

    //створюємо метод, який не повертає значення
    public void work(){
        System.out.println("I am Robot - I am just working.");
    }

    //створюємо пустий конструктор
    public Robot(){
    }

    //Alt + Insert + Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
