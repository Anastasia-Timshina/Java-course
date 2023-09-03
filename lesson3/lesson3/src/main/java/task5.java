import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 2;
        do{
            System.out.println("Input 2 numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a*b);
            System.out.println("Continue? 1 - no, 2 - yes");
            answer = scanner.nextInt();
        }
        while (answer == 2);
    }
}
  /*  В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
        После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
        И если пользователь введет число 1, то программа завершает цикл. Если введено любое другое
        число, то программа продолжает спрашивать у пользователя два числа и умножать их*/