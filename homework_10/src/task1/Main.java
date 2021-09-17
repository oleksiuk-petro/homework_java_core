/*
 а) Ініціалізувати стрічку : String str = "I like Java !!!".
 б) Роздрукувати останній символ рядка. Використовуємо метод
 в) Перевірити, чи закінчується ваша рядок підрядком "!!!".
 г) Перевірити, чи починається ваша рядок підрядком "I like".
 д) Перевірити, чи містить ваша рядок підрядок "Java".
 e) Знайти позицію підрядка "Java" в рядку "I like Java !!!".
 ж) Замінити всі символи "а" на "о".
 з) Перетворіть рядок до верхнього регістру.
 і) Перетворіть рядок до нижнього регістру.
 к) Вирізати рядок Java c допомогою методу String.substring()
 */
package task1;

public class Main {

    public static void main(String[] args) {

        // a) ініціалізуємо стрічку
        String str = "I like Java !!!";
        // виводимо стрічку на екран
        System.out.println("a) -> " + str);

        // б) роздруковуємо останній символ стрічки
        char lastSymbol;
        lastSymbol = str.charAt(getNumberLastSymbol(str));
        System.out.println("б) -> " + lastSymbol);

        //в) перевіряємо, чи закінчується наш рядок підрядком "!!!"
        boolean isEndStr = str.endsWith("!!!");
        System.out.println("в) -> " + isEndStr);

        //г) перевіряємо, чи починається наш рядок підрядком "I like"
        boolean isStartStr = str.startsWith("I like");
        System.out.println("г) -> " + isStartStr);

        //д) перевіряємо, чи містить наш рядок підрядок "Java"
        int isWordStr = str.indexOf("Java");
        if (isWordStr == -1) {
            System.out.println("д) -> false");
        } else {
            System.out.println("д) -> true");
        }

        //е) знаходимо позицію підрядка "Java" в рядку "I like Java !!!"
        System.out.println("e) -> " + isWordStr);

        //ж) замінюємо всі символи "а" на "о" в рядку "I like Java !!!"
        String replaceSymbol = str.replaceAll("a", "o");
        System.out.println("ж) -> " + replaceSymbol);

        //з) перетворіть рядок "I like Java !!!" до верхнього регістру
        String bigSymbol = str.toUpperCase();
        System.out.println("з) -> " + bigSymbol);

        //і) перетворюємо рядок "I like Java !!!" до нижнього регістру
        String smallSymbol = str.toLowerCase();
        System.out.println("i) -> " + smallSymbol);

        //к) вирізаємо рядок Java c допомогою методу String.substring()
        int startWord = isWordStr;
        int endWord = startWord + 4;
        String newStr = str.substring(startWord, endWord);
        System.out.println("к) -> " + newStr);
    }

    //б) створюємо метод знаходження останнього символу рядка
    public static int getNumberLastSymbol(String text) {
        return text.length() - 1;
    }
}
