package com.oleksiuk;

import java.util.Comparator;

//створюємо клас ComparName, який імплементує методи класу Comparator
//для змінної типу Car
public class ComparName implements Comparator<Car>{

    //перевизначаємо метод, який порівнює
    //два елемента класу Car за полем name
    @Override
    public int compare(Car o1, Car o2) {

        //порівнюємо два елемента за алфавітом
        int result = o1.getName().compareTo(o2.getName());
        return result;
    }
}
