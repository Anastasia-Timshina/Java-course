/*Задача 1:
Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
когда пользователю исполнится 100 лет. Использовать Date/Time API.*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your birthday in format xxxx-xx-xx");
        String birthdate = scanner.next();

        LocalDate birth100 = LocalDate.parse(birthdate).plusYears(100);
        System.out.println(birth100);
    }
}
