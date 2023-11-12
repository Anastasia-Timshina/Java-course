package task3;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developers = Arrays.asList(
                new Developer(1, "Alice"),
                new Developer(15, "Bob"),
                new Developer(8, "Anna"),
                new Developer(20, "Andrew")
        );

        developers.stream()
                .filter(dev -> dev.getId() > 10 && dev.getName().startsWith("An"))
                .forEach(System.out::println);
    }
}