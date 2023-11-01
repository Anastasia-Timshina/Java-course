package task3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> personSet = new HashSet<>();

        personSet.add(new Person("Nastya", 25));
        personSet.add(new Person("Anya", 30));
        personSet.add(new Person("Masha", 35));

        for (Person person : personSet) {
            System.out.println(person.name + " - " + person.age + " years old");
        }

        personSet.remove(new Person("Anya", 30));
        personSet.remove(new Person("Masha", 35));

        Person remainingPerson = new Person("Nastya", 25);
        if (personSet.contains(remainingPerson)) {
            System.out.println("Person " + remainingPerson.name + " is in the collection");
        } else {
            System.out.println("Person " + remainingPerson.name + " is not in the collection");
        }
    }
}

