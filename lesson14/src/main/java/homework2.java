import java.util.Random;
import java.util.function.Predicate;

/*Задача 2:
Используя Predicate среди массива чисел вывести только те, которые являются
положительными.*/
public class homework2 {


    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x > 0;
        int mas[] = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20 - 10);

            System.out.println(mas[i] + " : " + isPositive.test(mas[i]));

        }
        System.out.println("--------");
        for (int ma : mas) {
            if (isPositive.test(ma)) {
                System.out.println(ma);
            }
        }
    }
}
