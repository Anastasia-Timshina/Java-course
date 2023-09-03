import java.util.Scanner;

public class task7_1 {
    public static void main(String[] args) {
        System.out.println("enter x coordinates");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("enter y coordinates");
        int y = scanner.nextInt();

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
таблица из звёздочек */
