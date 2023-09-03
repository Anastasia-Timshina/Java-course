import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        int answer = 1;
        do{
            int res = 0;
            System.out.println("input a positive number");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x>0){
                for (int i = 0; i <= x; i++) {
                    res = res + i;
                }
                System.out.println(res);
            }else{
                System.out.println("it's not a positive number");
            }
            System.out.println("Continue? 1 - yes, 2 - no");
            answer = scanner.nextInt();
        } while (answer == 1);
    }
}
/*
Задача *:
        teachmeskills.by
        Напишите программу, где пользователь вводит любое целое положительное число. А
        программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        ввести некорректные данные.*/
