package task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");

        strings.stream()
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
    }
}