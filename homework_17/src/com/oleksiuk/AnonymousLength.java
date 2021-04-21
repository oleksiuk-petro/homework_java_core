package com.oleksiuk;

import java.util.Comparator;

public interface AnonymousLength extends Comparator<Commodity> {

    //перевизначаємо метод, який порівнює довжину товарів
    @Override
    default int compare(Commodity o1, Commodity o2) {
        int result = Integer.compare(o1.getLength(), o2.getLength());
        return result;
    }
}
