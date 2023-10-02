package task2;

public class Person {
    private int age;

    public Person(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Возраст должен быть не менее 18 лет");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}


