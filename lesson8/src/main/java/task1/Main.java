package task1;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        Garage garage = new Garage();

        System.out.println("House type: " + house.getType());
        System.out.println("Garage type: " + garage.getType());
    }
}
