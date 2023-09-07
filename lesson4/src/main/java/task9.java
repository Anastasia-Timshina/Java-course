import java.util.Scanner;

public class task9 {
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
        System.out.println("input a sum number");
        int sum = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (mas[i] + mas[j] == sum && (i!=j)){
                    System.out.println(mas[i] + " and " + mas[j]);
                    mas[i] = Integer.MIN_VALUE;
                    mas[j] = Integer.MIN_VALUE;
                }

            }
        }
    }
}
//Integer.MIN_VALUE