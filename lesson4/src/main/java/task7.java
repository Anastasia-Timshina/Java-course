import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("input mas's length");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int mas[]=new int[x];

        System.out.println("choose the position: 1 ... " + (x));
        int pos  = scanner.nextInt();
        System.out.println("input the element (int)");
        int elem = scanner.nextInt();
        mas[pos-1]=elem;
        for (int item:mas
             ) {
            System.out.print(item + " ");
        }
    }
}
