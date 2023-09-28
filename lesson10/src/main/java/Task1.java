/*Задача 1:
1.1 Объединить 2 строки в одну 2-мя способами.
1.2 Проверить 2 строки на равенство с и без учета регистра.
1.3 Вернуть подстроку с 3-го символа до конца.
1.4 Вывести длину строки
1.5 Вывести порядковый номер любого символа в строке.
1.6 Преобразовать логический тип true к строке.
1.7 Перевести строку в верхний регистр.
1.8 Заменить ‘1’ в строке на ‘%’.
1.9 Убрать все пробелы в строке с двух сторон.
1.10 Проверить, пустая ли строка.
1.11 Разбить строку на несколько по делителю.*/
public class Task1 {
    public static void main(String[] args) {
        first();
        System.out.println("************************");
        second();
        System.out.println("************************");
        third();
        System.out.println("************************");
        fourth();
        System.out.println("************************");
        fifth();
        System.out.println("************************");
        sixth();
        System.out.println("************************");
        seventh();
        System.out.println("************************");
        eighth();
        System.out.println("************************");
        ninth();
        System.out.println("************************");
        tenth();
        System.out.println("************************");
        eleventh();
    }

    public static void first(){
        String a = "I like";
        String b = " Java";

        System.out.println("1: " + a+b);
        System.out.println("2: "+ a.concat(b));
    }
    public static void second(){
        String a = "firstline";
        String b = "firstline";
        String c = "FirstLine";

        System.out.println("Равенство 1 и 2 строки: ");
        System.out.println(a.equals(b));
        System.out.println("Равенство 1 и 3 строки: ");
        System.out.println(a.equals(c));
        System.out.println("Равенство 1 и 3 строки c ignorecase: ");
        System.out.println(c.equalsIgnoreCase(a));
    }
    public static void third(){
        // " " - символ
        String a = "I like Java";
        System.out.println("1. ");
        char[] charArray = a.toCharArray();
        for (int i = 2; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println();

        // " " - не символ
        System.out.println("2. ");
        a = a.replace(" ", "");
        char[] charArray2 = a.toCharArray();
        for (int i = 2; i < charArray2.length; i++) {
            System.out.print(charArray2[i]);
        }
        System.out.println();
    }
    public static void fourth(){
        String a = "jajjajaajaa";
        char[] mas = a.toCharArray();
        System.out.println(mas.length);
    }
    public static void fifth(){
        String a = "1234567890";
        System.out.println(a.indexOf("3")+1);
    }
    public static void sixth(){
        boolean a = true;
        String b = String.valueOf(a);
        System.out.println(b);
    }
    public static void seventh(){
        String a = "helllooooooooo";
        System.out.println(a.toUpperCase());
    }
    public static void eighth(){
        String a = "I l1ke Java";
        /*String b = a.replace("1", "%");
        System.out.println(b);*/
        System.out.println(a.replace("1", "%"));
    }
    public static void ninth(){
        String a = "    hi  ";
        System.out.println(a.trim());
    }
    public static void tenth(){
        String a = "";
        String b = null;
        String c = "hihi";
        if (a == null || a.isEmpty()){
            System.out.println("empty/null");
        }else System.out.println("norm");
        if (b == null || b.isEmpty()){
            System.out.println("empty/null");
        }else System.out.println("norm");
        if (c == null || c.isEmpty()){
            System.out.println("empty/null");
        }else System.out.println("norm");
    }
    public static void eleventh(){
        String a = "hi my name is:Nastya";
        String[] mas = a.split(":");
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }
}

