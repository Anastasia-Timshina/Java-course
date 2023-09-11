import java.util.Random;
import java.util.Scanner;

/*1.1 Создайте двумерный массив и заполните его псевдослучайными числами с помощью
класса Random.
1.2 Найдите максимальное значение в созданном 2-мерном массиве*/
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        Random random = new Random();

        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(10);
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }

        // Вывод массива на консоль
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("max: " + max);
    }
}
