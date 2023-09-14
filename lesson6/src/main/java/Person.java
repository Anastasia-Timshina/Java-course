/*Задача 2:
2.1 Создать класс Person, который содержит: переменные fullName, age; методы
talk(String text) и move(), в которых вывести на консоль сообщение -"*fullName* talk
*text*..." и "*fullName* walk.".
2.2 Добавьте два конструктора - Person() и Person(fullName, age).
2.3 Создайте два объекта этого класса. Один объект инициализируется конструктором
Person(), другой - Person(fullName, age). Вызовите методы move() и talk()*/
public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(String text) {
        System.out.println(fullName + " talk " + text + "...");
    }

    public void move() {
        System.out.println(fullName + " walk.");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "John Doe";
        person1.age = 25;
        person1.move();
        person1.talk("Hello");

        Person person2 = new Person("Jane Smith", 30);
        person2.move();
        person2.talk("Hi");
    }
}