package homework1OOP;

import java.time.LocalDate;
import java.util.Stack;

public class DepositAccount extends Account {
    private Stack<LocalDate> lastTake = new Stack<>();

    public DepositAccount(double value) {
        super(value);
    }

    public DepositAccount() {
        super(0);
    }

    @Override
    public void take(double value) {
        if (lastTake.isEmpty()) {
            super.balance -= checkValue(value);
            lastTake.push(LocalDate.now());
        } else {
            if (LocalDate.now().getMonth() != lastTake.pop().getMonth()) {
                super.balance -= checkValue(value);
                lastTake.push(LocalDate.now());
            } else {
                System.out.println("You already have 1 take this month.");
            }
        }
    }

}