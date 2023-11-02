package homework1OOP;

import java.time.LocalDate;
import java.util.Stack;

public class DepositAccount extends Account {
    private LocalDate lastTake = null;

    public DepositAccount(double value) {
        super(value);
    }

    public DepositAccount() {
        super(0);
    }

    @Override
    public void take(double value) {
        if (lastTake == null || LocalDate.now().getMonth() != lastTake.getMonth()) {
            super.balance -= checkValue(value);
            lastTake = LocalDate.now();
        } else {
            System.out.println("You already have 1 take this month.");
        }
    }

}