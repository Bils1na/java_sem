package homework2OOP.Account;

public class FixedAmountAccount extends AbstractAccount {

    public FixedAmountAccount(double value) {
        super(value);
    }

    public FixedAmountAccount() {
        this(0);
    }

    @Override
    protected void doTake(double value) {
    }

    @Override
    protected void doPut(double value) {
    }
}
