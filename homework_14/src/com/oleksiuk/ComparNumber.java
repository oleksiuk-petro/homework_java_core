package com.oleksiuk;

import java.util.Comparator;

//створюємо клас ComparName, який імплементує методи класу Comparator
//для змінної типу Car
public class ComparNumber implements Comparator<Car> {

    //перевизначаємо метод, який порівнює
    //два елемента класу Car за полем number
    @Override
    public int compare(Car o1, Car o2) {

        //порівнюємо два елемента за кількістю
        int result = Integer.compare(o1.getNumber(), o2.getNumber());
        return result;
    }
}
