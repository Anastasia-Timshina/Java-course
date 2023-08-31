package lesson1;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        System.out.println("Введите 2значное число");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int a = (int) (n/10);
        int b = (int) (n%10);
        System.out.println(a + b);
    }
}
