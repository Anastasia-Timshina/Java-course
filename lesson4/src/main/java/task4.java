import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("input mas's length");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int mas[] = new int[x];
        for (int i = 0; i < x; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        int sum = 0;
        for (int item:mas
             ) {
            System.out.println(item);
        }
        for (int i = 0; i < x; i++) {
            sum = sum + mas[i];
        }
        System.out.println(sum/x);
    }
}
