/*
    Створіть програму, що виводить на екран перші 55 елементів послідовності 1 3 5 7 9 11 ...
 */
package task_3;

public class Main {
    public static void main(String[] args) {
        int n=1;
        int element;
        while(n<=55){
            element=2*n-1;
            System.out.println("n="+n+": "+element);
            n++;
        }
    }
}
