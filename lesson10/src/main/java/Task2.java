/*Задача 2:
2.1 Создать объект StringBuilder c любой строкой.
2.2 Добавить к строке “xxxx”.
2.3 В 5-ю позицию вставить “y”.
2.4 Удалить символы с 3 по 6.
2.5 Перевернуть строку.
2.6 Преобразовать в String и вывести в консоль.*/
public class Task2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1234567");
        System.out.println(sb);
        sb.append("xxxx");
        sb.insert(5, "y");
        sb.delete(2,6);
        sb.reverse();
        String a = String.valueOf(sb);
        System.out.println(a);
    }
}

