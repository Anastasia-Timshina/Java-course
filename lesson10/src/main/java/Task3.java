/*1. Найти количество слов в строке(слова разделены пробелами)
2. Найти слово с минимальной длинной
3. Найти в строке слова палиндромы и вывести их через запятую*/
public class Task3 {
    public static void main(String[] args) {
        /*first();
        second();*/
        third();
    }
    public static void first(){
        String a = " I like Java";
        String b = a.trim();
        String[] mas = b.split(" ");
        System.out.println(mas.length);
    }
    public static void second(){
        int length = 10000000;
        String word = "";
        String a = " I like Java";
        String b = a.trim();
        String[] mas = b.split(" ");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length(); j++) {
                String dop = mas[i];
                char[] mas1 = dop.toCharArray();
                if (mas1.length<length){
                    length = mas1.length;
                    word = mas[i];
                }
            }
        }
        System.out.println(word);
    }
    public static void third(){
        String str = "боб топот ляляля хахах";
        String a = str.trim();
        String[] mas = a.split(" ");
        for (int i = 0; i < mas.length; i++) {
            StringBuilder sb = new StringBuilder(mas[i]);
            StringBuilder b = sb.reverse();
            String dop = String.valueOf(b);
            if(dop.equals(mas[i])){
                System.out.print(mas[i] + " ");
            }
        }
    }
}

