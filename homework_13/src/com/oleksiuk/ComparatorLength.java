package com.oleksiuk;

import java.util.Comparator;

//щоб не було помилки натикаємо праву кнопку
//Show Context Actions -> Implements Method -> compare
public class ComparatorLength implements Comparator<Commodity> {

    //перевизначаємо метод, який порівнює довжину товарів
    @Override
    public int compare(Commodity o1, Commodity o2) {
        int result = Integer.compare(o1.getLength(), o2.getLength());
        return result;
    }
}
