package com.oleksiuk;

import java.util.Comparator;

//щоб не було помилки натикаємо праву кнопку
//Show Context Actions -> Implements Method -> compare
public class ComparatorName implements Comparator<Commodity> {

    //перевизначаємо метод, який порівнює назви товарів
    @Override
    public int compare(Commodity o1, Commodity o2) {
        int result = o1.getName().compareTo(o2.getName());
        return result;
    }
}
