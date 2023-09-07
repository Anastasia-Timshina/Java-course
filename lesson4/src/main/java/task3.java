import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("input mas's length");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double [] masDouble = new double[x];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i]= Math.random()*10;
            System.out.print(masDouble[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < masDouble.length ; i++) {
            if ((i % 2) == 1){
                System.out.print(Math.pow(masDouble[i], 2) + " ");
            }else{
                System.out.print(masDouble[i] + " ");
            }
        }
    }
}
//masDouble