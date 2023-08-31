package lesson1;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        System.out.println("Введите 3значное число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = x/100;
        int add = x/10;
        int b = add%10;
        int c = x%10;
        System.out.println(a+b+c);
    }
}
