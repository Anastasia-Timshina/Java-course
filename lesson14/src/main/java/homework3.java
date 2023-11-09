import java.util.function.Function;

/*Используя Function реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
возвращать сумму, переведенную сразу в доллары*/
public class homework3 {

    public static void main(String[] args) {
        Function<String, Double> convertToDollars = (String input) -> {
            String[] parts = input.split(" ");
            double sum = Double.parseDouble(parts[0]);
            return sum * 0.3;
        };

        String input = "100 BYN";
        double result = convertToDollars.apply(input);
        System.out.println(result);
    }
}
