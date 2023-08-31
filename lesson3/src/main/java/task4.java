import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Money");
        double money = scanner.nextDouble();
        System.out.println("Month");
        int month = scanner.nextInt();


        for (int i = 0; i < month; i++) {
            money = money * 1.07;
        }
        System.out.println(money);
    }
}
