package com.oleksiuk;

import java.util.Comparator;

public interface AnonymousWeight extends Comparator<Commodity> {

    //перевизначаємо метод, який порівнює вагу товарів
    @Override
    default int compare(Commodity o1, Commodity o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
