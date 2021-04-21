package season;
public enum Month {

    //оголошуємо константи
    JANUARY(31, Season.WINTER),
    FEBRUARY(28, Season.WINTER),
    MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING),
    MAY(31,Season.SPRING),
    JUNE(30,Season.SUMMER),
    JULY(31,Season.SUMMER),
    AUGUST(31,Season.SUMMER),
    SEPTEMBER(30,Season.AUTUMN),
    OCTOBER(31,Season.AUTUMN),
    NOVEMBER(30,Season.AUTUMN),
    DECEMBER(31,Season.WINTER);

    //оголошуємо поля
    int numberDay;
    Season timeYear;

    //створюємо конструктор з визначеними параметрами
    //Alt +Insert -> Constructor (numberDay, timeYear)
    Month(int numberDay, Season timeYear) {
        this.numberDay = numberDay;
        this.timeYear = timeYear;
    }

    //Alt + Insert -> Getter (numberDay, timeYear)
    //Getter - це неабстрактні методи
    public int getNumberDay() {
        return numberDay;
    }
    public Season getTimeYear() {
        return timeYear;
    }
}
