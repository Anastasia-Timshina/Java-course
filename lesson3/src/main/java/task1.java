import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12");
        int a = scanner.nextInt();
        switch (a) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
        }
    }
}
