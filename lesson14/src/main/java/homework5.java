import java.util.Scanner;
import java.util.function.Supplier;

public class homework5 {
    public static void main(String[] args) {
        Supplier<String> reverseInput = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            return new StringBuilder(input).reverse().toString();
        };

        String reversed = reverseInput.get();
        System.out.println("Reversed input: " + reversed);
    }
}
