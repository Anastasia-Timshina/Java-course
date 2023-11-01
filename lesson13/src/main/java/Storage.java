public class Storage<T> {
    private T item;

    public Storage() {
    }

    public Storage(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {

        Storage<String> stringStorage = new Storage<>("Hello");
        Storage<Integer> integerStorage = new Storage<>(123);


        System.out.println(stringStorage.getItem()); // Вывод: Hello
        System.out.println(integerStorage.getItem()); // Вывод: 123


        stringStorage.setItem("World");
        integerStorage.setItem(456);

        System.out.println(stringStorage.getItem()); // Вывод: World
        System.out.println(integerStorage.getItem()); // Вывод: 456
    }
}
