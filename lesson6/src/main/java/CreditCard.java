/*Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек*/
public class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void printInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("123456789", 1000.0);
        CreditCard card2 = new CreditCard("987654321", 500.0);
        CreditCard card3 = new CreditCard("543216789", 200.0);

        card1.deposit(200.0);
        card2.deposit(300.0);
        card3.withdraw(100.0);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
