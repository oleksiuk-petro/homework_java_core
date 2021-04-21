/*
    Створити довільний клас, описати його.
    Створити в мейн його екземпляр, дослідити всю інформацію про нього :
    - отримати всі методи (private в тому числі);
    - отримати поля класу (private в тому числі);
    - отримати всі конструктори;
    - створити екземпляр класу з двох різних конструкторів;
    - викликати 2 методи (один - з параметрами, другий - без параметрів).
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

        //створюємо об’єкт класу Person
        Person person = new Person();

        //виводимо всі методи класу Person
        Class classMethods = person.getClass();
        Method[] methods1 = classMethods.getDeclaredMethods();
        System.out.println("\nВсі методи класу Person:");
        for (Method m : methods1) {
            System.out.println(m.getName());
        }

        //виводимо всі поля класу Person
        Class classFields = person.getClass();
        Field[] fields = classFields.getDeclaredFields();
        System.out.println("\nВсі поля класу Person:");
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        //виводимо всі конструктори
        Class classConstructors = person.getClass();
        Constructor[] constructors = classConstructors.getDeclaredConstructors();
        System.out.println("\nВсі конструктори класу Person:");
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        //передаємо значення в конструктори
        //створюємо об’єкти методом рефлексії
        Person man1 = (Person) constructors[1].newInstance();
        Person man2 = (Person) constructors[0].newInstance("Name for man2", 23);

        //виводимо екземпляри класу для двох різних конструкторів
        System.out.println("\nВиводимо екземпляри класу Person для двох різних конструкторів:");
        System.out.println("man1: " + man1);
        System.out.println("man2: " + man2);

        //виводимо методи Getter та Setter класу Person
        System.out.println("\nВиводимо методи Getter та Setter класу Person:");
        //створюємо об’єкт класу Class, який викликає всі метода об’єкта person
        Class callMethods = person.getClass();
        //викликаємо метод виведення інформації про Getter та Setter
        printGettersOrSetters(callMethods);

        //встановлюємо значення аргумента
        System.out.println("\nВстановлюємо значення аргумента:");
        Method[] methods3 = SampleClass.class.getMethods();
        SampleClass sampleObject = new SampleClass();
        methods3[1].invoke(sampleObject, "data");
        System.out.println(methods3[0].invoke(sampleObject));
    }

    //метод виведення інформації про Getter та Setter
    public static void printGettersOrSetters(Class callMethods){
        //формуємо масив методів класу Person
        Method[] methods2 = callMethods.getMethods();
        //цикл перебирає кожний метод і встановлює істинність існування методів Getter та Setter
        for(Method method : methods2){
            if(isGetter(method))
                System.out.println("getter: " + method);
            if(isSetter(method))
                System.out.println("setter: " + method);
        }
    }

    //метод встановлює істинність існування Getter
    public static boolean isGetter(Method method){
        if (!method.getName().startsWith("get")) {
            return false;
        }
        if (method.getParameterTypes().length != 0) {
            return false;
        }
        if (void.class.equals(method.getReturnType())) {
            return false;
        }
        return true;
    }

    //метод встановлює істинність існування Setter
    public static boolean isSetter(Method method){
        if (!method.getName().startsWith("set")) {
            return false;
        }
        if (method.getParameterTypes().length != 1) {
            return false;
        }
        return true;
    }
}
