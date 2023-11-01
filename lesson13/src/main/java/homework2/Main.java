package homework2;

public class Main {
    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();

        animalCollection.addAnimal("Dog");
        animalCollection.addAnimal("Cat");
        animalCollection.addAnimal("Elephant");

        animalCollection.displayAnimals();

        animalCollection.removeAnimal();

        animalCollection.displayAnimals();
    }
}

