package com.oleksiuk;

import java.util.Comparator;

//щоб не було помилки натикаємо праву кнопку
//Show Context Actions -> Implements Method -> compare
public class ComparatorWidth implements Comparator<Commodity> {

    //перевизначаємо метод, який порівнює ширину товарів
    @Override
    public int compare(Commodity o1, Commodity o2) {
        int result = Integer.compare(o1.getWidth(), o2.getWidth());
        return result;
    }
}
