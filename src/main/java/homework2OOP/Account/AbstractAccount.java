package homework2OOP.Account;

public abstract class AbstractAccount implements Account{

    protected double balance;

    public AbstractAccount(double balance) {
        setBalance(balance);
    }

    public AbstractAccount() {
        this(0);
    }

    @Override
    public final String getAmount() {
        return String.format("Balance: %s$", this.balance);
    }

    @Override
    public final void take(double value) {
        if (value > 0) {
            doTake(value);
        } else {
            throw new IllegalArgumentException("Value must be greater than zero.");
        }
    }

    @Override
    public final void put(double value) {
        if (value > 0) {
            doPut(value);
        } else {
            throw new IllegalArgumentException("Value must be greater than zero.");
        }
    }

    protected void doTake(double value) {
        this.balance -= value;
    }

    protected void doPut(double value) {
        this.balance += value;
    }

    private void setBalance(double value) {
        if (value >= 0) {
            this.balance = value;
        } else {
            throw new IllegalArgumentException("Value must be greater than zero.");
        }
    }

}
