/*Задача *:
Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).

Формат входных данных:
Программа получает на вход два числа n и m.

Формат выходных данных:
Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
символа.

*/
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        int value = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
