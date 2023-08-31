package lesson1;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        System.out.println("Введите дробное число");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int a = (int)x;
        double b = (x-a);
        int res;
        if (b >= 0.5) {
            res = ++a;
        } else{
            res = a;
        }
        System.out.println(res);

    }
}
