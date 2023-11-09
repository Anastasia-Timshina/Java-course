import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a date like xxxx-xx-xx");
        String date = scanner.next();
        DayOfWeek sunday = LocalDate.parse(date).getDayOfWeek();
        System.out.println("Day of week: " + sunday);
    }
}
