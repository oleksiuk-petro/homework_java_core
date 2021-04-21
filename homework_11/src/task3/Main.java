/*
    Вхідним параметром є стрічка:
    String str = "I love Java more than my friend. Java is so beautiful."
    - перевірити чи є в стрічці слово “Java”;
    - замінити слово “Java” на “C#”;
    - замінити всі слова “Java” на “C#”.
 */
package task3;

public class Main {

    public static void main(String[] args) {

        //оголошуємо та ініціалізуємо рядкову змінну
        String sentence = "I love Java more than my friend. Java is so beautiful.";

        //виводимо істинність існування слова "Java" в рядку
        System.out.println(sentence.matches(".*Java.*"));

        //замінюємо сперше слово “Java” на “C#”
        System.out.println(sentence.replaceFirst("Java", "C#"));

        //замінюємо всі слова “Java” на “C#”
        System.out.println(sentence.replaceAll("Java", "C#"));
    }
}
