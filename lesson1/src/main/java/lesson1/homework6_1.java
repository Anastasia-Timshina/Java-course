package lesson1;

import java.util.Scanner;

public class homework6_1 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
