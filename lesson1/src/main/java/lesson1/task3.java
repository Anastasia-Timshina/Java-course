package lesson1;

import jdk.dynalink.Operation;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 число");
        int a = scanner.nextInt();

        System.out.println("Введите операцию (+/-/*)");
        String op = scanner.next();

        System.out.println("Введите 2 число");
        int b = scanner.nextInt();

        if (op.equals("+")){
            System.out.println(a+b);
        }else if (op.equals("-")){
            System.out.println(a-b);
        }else if (op.equals("*")){
            System.out.println(a*b);
        }else{
            System.out.println("Error");
        }
    }
}
