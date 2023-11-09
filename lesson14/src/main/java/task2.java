import java.time.DayOfWeek;
import java.time.LocalDate;

public class task2 {

        public static void main(String[] args) {

            LocalDate nextTuesday = LocalDate.now();
            while (nextTuesday.getDayOfWeek() != DayOfWeek.TUESDAY) {
                nextTuesday = nextTuesday.plusDays(1);
            }

            System.out.println("Дата следующего вторника: " + nextTuesday);
        }



}
