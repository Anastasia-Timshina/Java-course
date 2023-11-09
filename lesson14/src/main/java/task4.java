import java.util.Scanner;
import java.util.function.Predicate;

/*При помощи лямбда выражения реализовать логику, при которой, если а < b, то вернуть
        а. Если a > b, то вернуть b. Иначе вернуть 0*/
public class task4 {
    interface ILogic{
        int getResult(int a, int b);
    }
    public static void main(String[] args) {
        ILogic iLogic = (a, b) -> {
            if (a<b){
                return a;
            }
            else if(a>b){
                return b;
            }else{
                return 0;
            }
        };
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = iLogic.getResult(a, b);
        System.out.println("Result: " + res);
    }
}
