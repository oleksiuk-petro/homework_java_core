/**
 * Користувач з консолі має вводити слова доти, доки не введе “break”,
 * всі слова записуються в List.
 * Написати функцію для :
 * - виведення користувачу всіх слів, які він ввів;
 * - виведення слів, які починаються на “s”;
 * - виведення слів, які мають кількість букв більше ніж 5.
 */
package com.oleksiuk;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //оголошення рядкової змінної колекції LinkedList
        LinkedList<String> words = new LinkedList<>();

        System.out.println("******************************************************************");
        System.out.println("Ви маєте можливість вводити слова, допоки не введете слово \"break\"");

        //викликаємо методи
        System.out.println("******************************************************************");
        enterWords(words);
        System.out.println("******************************************************************");
        outputWords(words);
        System.out.println("******************************************************************");
        startWithS(words);
        System.out.println("******************************************************************");
        moreFiveSymbols(words);
        System.out.println("******************************************************************");
    }

    //метод заповнення колекції з клавіатури
    public static void enterWords(LinkedList<String> words){
        int k = 0;
        boolean r = true;
        while(r){
            Scanner scanWord = new Scanner(System.in);
            words.add(scanWord.nextLine());
            if(words.get(k).equals("break")){
                r = false;
            }
            k++;
        }
    }

    //метод виведення вмісту колекції
    public static void outputWords(LinkedList<String> words){
        System.out.println(words);
    }

    //метод виведення слів, які починаються на 's'
    public static void startWithS(LinkedList<String> words){
        for(int i = 0; i < words.size(); i++){
            String var = words.get(i);
            if(var.charAt(0) == 's'){
                System.out.println(words.get(i));
            }
        }
    }

    //метод виведення всіх слів, які мають більше 5 букв
    public static void moreFiveSymbols(LinkedList<String> words){
        for(int i = 0; i < words.size(); i++){
            String var = words.get(i);
            if(var.length() > 5){
                System.out.println(words.get(i));
            }
        }
    }
}
