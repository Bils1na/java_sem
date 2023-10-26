package homework1OOP;

public class Account {
    protected double balance;

    /**
     * Это счет в банке.
     * @param value Это значение передает сумму на счете. Параметр типа double.
     */

    public Account(double value) {
        this.balance = value;
    }

    public Account() {
        this(0);
    }

    // Methods put, take and getAmount
    public void put(double value) {
        this.balance += value;
    }

    public void take(double value) {
        this.balance -= value;
    }

    public String getAmount() {
        return String.format("Balance: %s$", this.balance);
    }

}