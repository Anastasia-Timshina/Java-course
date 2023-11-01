package task2;

class Country {
    String name;
    int population;
    Country previous;
    Country next;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
}
