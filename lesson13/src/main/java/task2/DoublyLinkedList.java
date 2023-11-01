package task2;

class DoublyLinkedList {
    Country head;
    Country tail;

    public void addFirst(Country country) {
        if (head == null) {
            head = country;
            tail = country;
        } else {
            country.next = head;
            head.previous = country;
            head = country;
        }
    }

    public void addLast(Country country) {
        if (tail == null) {
            head = country;
            tail = country;
        } else {
            tail.next = country;
            country.previous = tail;
            tail = country;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Список пуст");
        } else {
            head = head.next;
            if (head != null) {
                head.previous = null;
            } else {
                tail = null;
            }
        }
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("Список пуст");
        } else {
            tail = tail.previous;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
    }


    public Country getFirst() {
        if (head == null) {
            System.out.println("Список пуст");
            return null;
        } else {
            return head;
        }
    }

    public Country getLast() {
        if (tail == null) {
            System.out.println("Список пуст");
            return null;
        } else {
            return tail;
        }
    }
}
