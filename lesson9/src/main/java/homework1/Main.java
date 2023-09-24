package homework1;

class Main {
    public static void main(String[] args) {
        Rabbit rabbit= new Rabbit();
        rabbit.eat("meat");

        Tiger tiger = new Tiger();
        tiger.voice();

        Dog dog = Dog.createDog();
        dog.voice();
        dog.eat("meat");
    }
}
