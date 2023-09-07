import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("input mas's length");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int mas[]=new int[x];
        for (int i = 0; i < x; i++) {
            mas[i] = (int) (Math.random() * 15);
        }
        for (int item : mas
             ) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int i = (x-1); i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}
