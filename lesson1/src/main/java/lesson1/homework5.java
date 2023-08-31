package lesson1;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        Scanner scanner = new Scanner(System.in);
        double q = scanner.nextDouble();
        double w = scanner.nextDouble();
        double add1 = q/w;
        int a = (int)add1;
        int b = (int) (q%w);


        System.out.println(a + " и " + b + " в остатке");
    }
}
