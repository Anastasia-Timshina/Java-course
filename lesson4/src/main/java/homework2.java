import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
        System.out.println("input mas's length");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("input mas's element");
            array[i] = scanner.nextInt();
        }

        int[] correctedArray = addOne(array);
        System.out.println();

        for (int i : correctedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] addOne(int[] array) {
        int addi = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            int sum = array[i] + addi;
            if (sum == 10) {
                array[i] = 0;
                addi = 1;
            } else {
                array[i] = sum;
                addi = 0;
                break;
            }
        }
        if (addi == 1) {
            int[] correctedArray = new int[array.length + 1];
            correctedArray[0] = 1;
            System.arraycopy(array, 0, correctedArray, 1, array.length);
            return correctedArray;
        } else {
            return array;
        }
    }
    //public static void main(String[] args) {


        /*System.out.println("input mas's length");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int mas[]=new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("input mas's element");
            mas[i] = scanner.nextInt();
        }

        System.out.println();

        int addi = 1;
        for (int i = x-1; i >= 0; i--) {
            int sum = mas[i] + addi;
            if (sum==10){
                mas[i] = 0;
                addi = 1;
            }
            else{
                mas[i] = sum;
                addi = 0;
                break;
            }

            int variant = 3;

            if (addi == 1) {
                int[] correctedArray = new int[mas.length + 1];
                correctedArray[0] = 1;
                System.arraycopy(mas, 0, correctedArray, 1, mas.length);
                for (int item:correctedArray
                ) {
                    System.out.print(item);
                }
            } else {
                for (int item:mas
                ) {
                    System.out.print(item);
                }
            }*/
            /*mas[i] = mas[i]+addi;
            if(mas[i] == 10){
                mas[i] = 0;
                mas[i-1] = mas[i-1] + 1;
            }else{
                mas[i] =
                addi = 0;
                break;
            }*/

        }

        /*System.arraycopy();
        if (addi ==1){
            System.out.print("1");
            for (int item:mas
                 ) {
                System.out.print(item);
            }
        }else{
            for (int item:mas
            ) {
                System.out.print(item);
            }
        }*/

    //}
//}
//Имеется массив из неотрицательных чисел(любой). Представьте что массив
//представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
//добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
//содержит нуля в начале, кроме самого числа 0.
//Пример:
//Input: [1,4,0,5,6,3]
//Output: [1,4,0,5,6,4]
//Input: [9,9,9]
//Output: [1,0,0,0]
