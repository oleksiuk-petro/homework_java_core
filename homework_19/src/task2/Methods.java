package task2;

import java.io.*;

public class Methods {

    //константа - абсолютний шлях файлу
    private static final String FILE = "src/task2/data.txt";

    //описуємо метод "серіалізація"
    public static void serializeObject(Object o) throws IOException {
        //збереження об’єкта у файл
        FileOutputStream fileOutputStream = new FileOutputStream(FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        //записуємо об’єкт
        objectOutputStream.writeObject(o);

        //закриваємо потоки
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object was serialized!");
    }

    //описуємо метод "десеріалізація"
    public static  Object deserializeObject() throws IOException, ClassNotFoundException {
        //збереження об’єкта із файла
        FileInputStream fileInputStream = new FileInputStream(FILE);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        //зчитуємо об’єкт із файла
        Object object = objectInputStream.readObject();

        //закриваємо потоки
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Object was deserialized");

        //повертаємо об’єкт
        return object;
    }
}
