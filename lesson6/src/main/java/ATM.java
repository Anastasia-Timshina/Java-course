/*Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
принимает сумму денег, а возвращает булевое значение - успешность выполнения
операции. При снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
количеством купюр каждого номинала.
*/
public class ATM {
    private int numOf20Bills;
    private int numOf50Bills;
    private int numOf100Bills;

    public ATM(int numOf20Bills, int numOf50Bills, int numOf100Bills) {
        this.numOf20Bills = numOf20Bills;
        this.numOf50Bills = numOf50Bills;
        this.numOf100Bills = numOf100Bills;
    }

    public void addMoney(int numOf20Bills, int numOf50Bills, int numOf100Bills) {
        this.numOf20Bills += numOf20Bills;
        this.numOf50Bills += numOf50Bills;
        this.numOf100Bills += numOf100Bills;
    }

    public boolean withdrawMoney(int amount) {
        int remainingAmount = amount;

        int numOf100ToWithdraw = Math.min(remainingAmount / 100, numOf100Bills);
        remainingAmount -= numOf100ToWithdraw * 100;

        int numOf50ToWithdraw = Math.min(remainingAmount / 50, numOf50Bills);
        remainingAmount -= numOf50ToWithdraw * 50;

        int numOf20ToWithdraw = Math.min(remainingAmount / 20, numOf20Bills);
        remainingAmount -= numOf20ToWithdraw * 20;

        if (remainingAmount == 0) {
            System.out.println("Осталось " + numOf100ToWithdraw + " x $100");
            System.out.println("Осталось " + numOf50ToWithdraw + " x $50");
            System.out.println("Осталось " + numOf20ToWithdraw + " x $20");

            numOf100Bills -= numOf100ToWithdraw;
            numOf50Bills -= numOf50ToWithdraw;
            numOf20Bills -= numOf20ToWithdraw;

            return true;
        } else {
            System.out.println("Невозможно выдать запрошенную сумму");
            return false;
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(10, 5, 3);

        atm.addMoney(20, 10, 5);
        atm.withdrawMoney(350);

        atm.addMoney(0, 10, 2);
        atm.withdrawMoney(180);
    }
}
