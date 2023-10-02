package task2;

public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person(16);
            System.out.println("Возраст первого человека: " + person1.getAge());
        } catch (AgeException e) {
            System.out.println("Ошибка создания объекта Person: " + e.getMessage());
        }

        try {
            Person person2 = new Person(20);
            System.out.println("Возраст второго человека: " + person2.getAge());
        } catch (AgeException e) {
            System.out.println("Ошибка создания объекта Person: " + e.getMessage());
        }
    }
}
