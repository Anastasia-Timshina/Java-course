import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 1;
        do {
            System.out.println("input a number");
            int x = scanner.nextInt();
            int res = 0;

            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x%i == 0){
                    res++;
                    break;
                }
            }
            if (res != 0 ){
                System.out.println("число составное");
            }else{
                System.out.println("число простое");
            }
            System.out.println("Continue? 1 - yes, 2 - no");
            answer = scanner.nextInt();
        }
        while (answer == 1);
    }
}/*
        Проверьте, является ли введённое пользователем с клавиатуры натуральное число
        — простым. Постарайтесь не выполнять лишних действий
        (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно,
        что число составное и проверку продолжать не нужно).
        Также учтите, что наименьший делитель натурального числа n, если он вообще имеется,
        обязательно располагается в отрезке [2; √n].*/