package task1;

public class first {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Выбрасываем исключение
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива!");
        }
    }
}
