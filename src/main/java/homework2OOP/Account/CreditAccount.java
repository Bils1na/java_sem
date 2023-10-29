package homework2OOP.Account;

public class CreditAccount extends AbstractAccount {

    private double percent;

    public CreditAccount(double value) {
        super(value);
        this.percent = 0.01;
    }

    public CreditAccount() {
        this(0);
    }

    @Override
    protected void doTake(double value) {
        super.balance -= value + getPercent(value);
    }

    private double getPercent(double value) {
        return value * this.percent;
    }

}