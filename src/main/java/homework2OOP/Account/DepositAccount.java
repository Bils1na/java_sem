package homework2OOP.Account;

import java.time.LocalDate;
import java.util.Stack;

public class DepositAccount extends AbstractAccount {
    private LocalDate lastTake = null;

    public DepositAccount(double value) {
        super(value);
    }

    public DepositAccount() {
        super(0);
    }

    @Override
    protected void doTake(double value) {
        if (lastTake == null || LocalDate.now().getMonth() != lastTake.getMonth()) {
            lastTake = LocalDate.now();
            super.balance -= value;
        } else {
            System.out.println("You already have 1 take this month.");
        }
    }
}