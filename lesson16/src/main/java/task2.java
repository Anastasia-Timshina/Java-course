public class task2 {
    public record Person(String name, int age) {

    }

    public class Main {
        public static void main(String[] args) {
            var person = new Person("John", 30);
            System.out.println(person);
        }
    }
}
