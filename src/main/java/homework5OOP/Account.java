package homework5OOP;

public class Account {
    protected double balance;

    /**
     * Это счет в банке.
     * @param value Это значение передает сумму на счете. Параметр типа double.
     */

    public Account(double value) {
        setBalance(value);
    }

    public Account() {
        this(0);
    }

    // Methods put, take and getAmount
    public void put(double value) {
        this.balance += checkValue(value);
    }

    public void take(double value) {
        this.balance -= checkValue(value);
    }

    public String getAmount() {
        return String.format("Balance: %s$", this.balance);
    }

    public void setBalance(double value) {
        if (value >= 0) {
            this.balance = value;
        } else {
            throw new IllegalArgumentException("Value < 0");
        }
    }

    public double checkValue(double value) {
        if (value >= 0) {
                return value;
        } else {
            throw new IllegalArgumentException("Value < 0");
        }
    }

//    private boolean checkBalance(double value) {
//        boolean remain = this.balance - value >= 0;
//
//    }

}