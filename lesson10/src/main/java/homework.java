import java.util.Arrays;
import java.util.Comparator;

public class homework {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
    }

    /*Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
      найденные строки и их длину.*/
    public static void first(){
        String a = "1";
        String b = "22";
        String c = "333";

        char[] masA = a.toCharArray();
        char[] masB = b.toCharArray();
        char[] masC = c.toCharArray();

        System.out.println("max: " + Math.max(masA.length, Math.max(masB.length, masC.length)));
        System.out.println("min: " + Math.min(masA.length, Math.min(masB.length, masC.length)));


    }

    /*Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
      значений их длины.*/
    public static void second(){
        String a = "333";
        String b = "1";
        String c = "22";

        char[] masA = a.toCharArray();
        char[] masB = b.toCharArray();
        char[] masC = c.toCharArray();

        String[] strings = {a, b, c};
        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println("Строки в порядке возрастания их длины:");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    /*Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
      средней, а также их длину.*/
    public static void third(){
        String a = "hahahhaha";
        String b = "euwqi";
        String c = "quwu";

        char[] masA = a.toCharArray();
        char[] masB = b.toCharArray();
        char[] masC = c.toCharArray();

        int averageLength = (a.length() + b.length() + c.length()) / 3;

        System.out.println("Строки, длина которых меньше средней (" + averageLength + "):");
        if (a.length() < averageLength) {
            System.out.println(a + ", её длина: " + a.length());
        }
        if (b.length() < averageLength) {
            System.out.println(b + ", её длина: " + b.length());
        }
        if (c.length() < averageLength) {
            System.out.println(c + ", её длина: " + c.length());
        }
    }

    /*Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
      Если таких слов несколько, найти первое из них.*/
    public static void fourth(){
        String str1 = "578";
        String str2 = "£$";
        String str3 = "java java";

        String uniqueWord = findUniqueWord(str1, str2, str3);

        if (uniqueWord != null) {
            System.out.println("Слово, состоящее только из различных символов: " + uniqueWord);
        } else {
            System.out.println("Нет слов, состоящих только из различных символов.");
        }
    }

    public static String findUniqueWord(String str1, String str2, String str3) {
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");
        String[] words3 = str3.split(" ");

        for (String word : words1) {
            if (isUnique(word)) {
                return word;
            }
        }

        for (String word : words2) {
            if (isUnique(word)) {
                return word;
            }
        }

        for (String word : words3) {
            if (isUnique(word)) {
                return word;
            }
        }

        return null;
    }

    public static boolean isUnique(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    /*Вывести на консоль новую строку, которой задублирована каждая буква из
      начальной строки. Например, "Hello" -> "HHeelllloo".*/
    public static void fifth(){
        String a = "hello";
        StringBuilder duplicatedString = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            duplicatedString.append(c).append(c);
        }

        System.out.println("Новая строка: " + duplicatedString.toString());
    }
}
