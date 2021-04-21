package com.oleksiuk;

import java.util.Comparator;

public interface AnonymousName extends Comparator<Commodity> {

    //перевизначаємо метод, який порівнює назви товарів
    @Override
    default int compare(Commodity o1, Commodity o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
