import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        System.out.println("Input a number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if(x%2==0){
            System.out.println("Чётное!!");
        }else {
            System.out.println("Нечётное");
        }
    }
}
/*
Задача 1:
        Напишите программу, которая будет принимать на вход число из консоли и на выход
        будет выводить сообщение четное число или нет. Для определения четности числа
        используйте операцию получения остатка от деления (операция выглядит так: '% 2').*/
