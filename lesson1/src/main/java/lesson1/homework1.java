package lesson1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа a и b");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int a = 4*(b+c-1)/2;
        System.out.println(a);
    }
}
