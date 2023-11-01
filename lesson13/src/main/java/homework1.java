import javax.management.ObjectName;
import java.util.*;

/*Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
При решении использовать коллекции*/
public class homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел (через запятую)");
        String input = scanner.nextLine();

        // Удаление пробелов из строки и разделение по запятой
        String[] numbers = input.replaceAll("\\s", "").split(",");

        // Создание HashSet для хранения уникальных элементов
        Set<String> uniqueNumbers = new HashSet<>();

        // Добавление элементов в HashSet
        for (String number : numbers) {
            uniqueNumbers.add(number);
        }

        // Вывод результатов
        System.out.println("Уникальные числа:");
        for (String number : uniqueNumbers) {
            System.out.print(number + " ");
        }


    }
}
