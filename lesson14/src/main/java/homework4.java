import java.util.function.Consumer;

public class homework4 {
    public static void main(String[] args) {
        Consumer<String> convertToDollars = (String input) -> {
            String[] parts = input.split(" ");
            double sum = Double.parseDouble(parts[0]);
            double result = sum * 0.3;
            System.out.println(result);
        };

        String input = "100 BYN";
        convertToDollars.accept(input);
    }
}
