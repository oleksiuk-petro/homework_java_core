import java.util.*;

/*
    Створити клас MyEntry<K,V>.
    Описати в ньому дженеріками – поля, гетери/сетери, toString.
    Реалізувати в даному класі методи, які б:
    - Додавали новий об’єкт в мапу.
    - Видаляли об’єкт мапи за ключем.
    - Видаляли об’єкт мапи за значенням.
    - Виводили на екран Set ключів.
    - Виводили на екран List значень.
    - Виводили на екран цілу мапу.
 */
public class Main {
    public static void main(String[] args) {

        //створюємо об’єкт map
        Map<Object, Object> map = new HashMap<>();

        //викличемо метод додавання об’єктів до map
        addMap(map);

        System.out.println("\nКоли додали елементи в map перший раз:");
        //викличемо метод виведення всього вмісту map
        showMap(map);

        //викликаємо метод видалення з мапи за ключем
        deleteWithKey(map);
        System.out.println("\nКоли видалили елементи з map за ключем:");
        //викличемо метод виведення всього вмісту map
        showMap(map);

        //викличемо метод видалення з мапи по значеннню
        deleteWithValue(map);
        System.out.println("\nКоли видалили елементи з map за значенням:");
        //викличемо метод виведення всього вмісту map
        showMap(map);

        //викличемо метод виведення на екран set ключів
        System.out.println("\nSet ключів:");
        showSetKey(map);

        //викличемо метод виведення на екран list значень
        System.out.println("\nList значень:");
        showListValue(map);

        //виводимо на екран цілу мапу
        System.out.println("\nОстаточна мапа:");
        showMap(map);
    }

    //метод додає об’єкт до map
    public static void addMap(Map<Object, Object> map) {
        //створюємо об’єкти класу MyEntry
        MyEntry<Integer, String> element0 = new MyEntry<>(0, "a");
        MyEntry<Integer, String> element1 = new MyEntry<>(1, "b");
        MyEntry<Integer, String> element2 = new MyEntry<>(2, "c");
        MyEntry<Integer, String> element3 = new MyEntry<>(3, "d");
        MyEntry<Integer, String> element4 = new MyEntry<>(4, "e");
        MyEntry<String, Integer> element5 = new MyEntry<>("f", 5);
        MyEntry<String, Integer> element6 = new MyEntry<>("g", 6);
        MyEntry<String, Integer> element7 = new MyEntry<>("f", 7);
        MyEntry<String, Integer> element8 = new MyEntry<>("h", 8);
        MyEntry<String, Integer> element9 = new MyEntry<>("i", 9);

        //додаємо до мапи створені об’єкти
        map.put(element0.getKeyMap(), element0.getValueMap());
        map.put(element1.getKeyMap(), element1.getValueMap());
        map.put(element2.getKeyMap(), element2.getValueMap());
        map.put(element3.getKeyMap(), element3.getValueMap());
        map.put(element4.getKeyMap(), element4.getValueMap());
        map.put(element5.getKeyMap(), element5.getValueMap());
        map.put(element6.getKeyMap(), element6.getValueMap());
        map.put(element7.getKeyMap(), element7.getValueMap());
        map.put(element8.getKeyMap(), element8.getValueMap());
        map.put(element9.getKeyMap(), element9.getValueMap());
    }

    //метод видаляє об’єкт мапи за ключем
    public static void deleteWithKey(Map<Object, Object> map) {
        map.remove(3);
        map.remove(4);
    }

    //метод видаляє об’єкт мапи за значенням
    public static void deleteWithValue(Map<Object, Object> map) {
        map.remove("h", 8);
        map.remove("i", 9);
    }

    //метод виводить на екран всю мапу
    public static void showMap(Map<Object, Object> map) {
        System.out.println(map);
    }

    //метод виводить на екран Set ключів
    public static void showSetKey(Map<Object, Object> map) {
        //створимо множину для зберігання елементів
        Set<Object> setKey = new HashSet<>();
        //цикл записує значення ключів
        for (Map.Entry<Object, Object> r : map.entrySet()) {
            setKey.add(r.getKey());
        }
        //цикл виводить на екран значення ключів
        for (Object x : setKey)
            System.out.println(x);
    }

    //метод виводить на екран List значень
    public static void showListValue(Map<Object, Object> map) {
        //створимо список для зберігання елементів
        List<Object> listValue = new ArrayList<>();
        //цикл записує значення value
        for (Map.Entry<Object, Object> r : map.entrySet()) {
            listValue.add(r.getValue());
        }
        //цикл виводить на екран значення value
        for (Object x : listValue)
            System.out.println(x);
    }
}
