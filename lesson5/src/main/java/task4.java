import java.util.Scanner;

/*Вывести на экран матрицу m*n вида:

4, 3, 2, 1
8, 7, 6, 5,
12,11,10, 9

*/
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int count = 1;

        for (int i = 0; i < m; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = count++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = count++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j != n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
