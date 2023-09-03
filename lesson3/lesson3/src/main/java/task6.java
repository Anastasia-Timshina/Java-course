import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input length");
        int x = scanner.nextInt();
        int[] nums= new int[x];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        // Ладно, массивы не помню
    }
}
   /* за один проход по циклу найти 2 максимальных числа в массиве элементов*/