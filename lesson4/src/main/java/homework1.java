import java.util.Scanner;

public class homework1 {
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
        System.out.println();
        int max = 0;
        int min = 10;
        int maxind = 0;
        int minind = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i]>=max) {
                max = mas[i];
                maxind = i;
            }
            if (mas[i]<=min){
                min = mas[i];
                minind = i;
            }
        }
        System.out.println("max: "+ max);
        System.out.println("min: " + min);
        System.out.println();

        System.out.println("max index: "+ maxind);
        System.out.println("min index: " + minind);
        System.out.println();

        int nul = 0;
        for (int i = 0; i < x; i++) {
            if(mas[i] == 0){
                nul++;
            }
        }
        if (nul == 0){
            System.out.println("no null elements");
        }else{
            System.out.println("null elements: " + nul);
        }

        for (int i = (x-1); i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        // а разве 1 и 5 - не одно и то же?
        System.out.println();
        for (int i = 1; i < x; i++) {
            if (mas[i-1] > mas[i]) {
                System.out.println("it's not growing");
                break;
            }
        }

    }
}
