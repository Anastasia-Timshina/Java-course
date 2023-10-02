package task1;

public class third {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }
}
