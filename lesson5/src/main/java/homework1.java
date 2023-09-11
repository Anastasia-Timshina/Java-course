/*Задача 1:
1.1 Создать двумерный массив, заполнить его случайными числами.
1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
1.3 Найти сумму всех получившихся элементов и вывести в консоль.*/

import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];


        Random random = new Random();
        int sum = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }


        System.out.println("Исходная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += number;
                sum += matrix[i][j];
            }
        }


        System.out.println("Измененная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Сумма всех элементов: " + sum);
    }
}
