package homework1OOP;

public class CreditAccount extends Account {

    private double percent;

    public CreditAccount(double value) {
        super(value);
        this.percent = 0.01;
    }

    public CreditAccount() {
        super(0);
        this.percent = 0.01;
    }

    @Override
    public void take(double value) {
        super.balance -= value + getPercent(value);
    }

    private double getPercent(double value) {
        return value * this.percent;    
    }

}