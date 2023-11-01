package task2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList countriesList = new DoublyLinkedList();

        countriesList.addFirst(new Country("Россия", 145));
        countriesList.addFirst(new Country("США", 328));
        countriesList.addLast(new Country("Китай", 1394));
        countriesList.addLast(new Country("Индия", 1366));

        Country currentCountry = countriesList.head;
        while (currentCountry != null) {
            System.out.println(currentCountry.name + " -> " + currentCountry.population + " млн.");
            currentCountry = currentCountry.next;
        }

        countriesList.removeFirst();
        countriesList.removeLast();

        Country firstCountry = countriesList.getFirst();
        if (firstCountry != null) {
            System.out.println("Первая страна: " + firstCountry.name);
        }

        Country lastCountry = countriesList.getLast();
        if (lastCountry != null) {
            System.out.println("Последняя страна: " + lastCountry.name);
        }
    }
}

