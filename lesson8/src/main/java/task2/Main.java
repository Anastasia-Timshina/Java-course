package task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nastya", 17, "Female");

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}