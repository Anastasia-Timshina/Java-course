package homework1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 8, 6, 4, 2));

        int sum = numbers.stream()
                .distinct()
                // удалить дубликаты

                .filter(n -> n % 2 == 0)
                // оставить только четные элементы

                .mapToInt(Integer::intValue)
                // преобразовать Integer в int

                .sum();
                // вычислить сумму

        System.out.println("Сумма четных уникальных элементов: " + sum);
    }
}
