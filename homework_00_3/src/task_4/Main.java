/*
    Створіть програму, що виводить на екран всі невід’ємні елементи послідовності: 90; 85; 80; 75 ...
 */
package task_4;

public class Main {
    public static void main(String[] args) {
        int element=90;
        while(element>=0){
            System.out.println(element);
            element-=5;
        }
    }
}
