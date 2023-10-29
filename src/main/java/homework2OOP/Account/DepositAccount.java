package homework2OOP.Account;

import java.time.LocalDate;
import java.util.Stack;

public class DepositAccount extends AbstractAccount {
    private final Stack<LocalDate> lastTake = new Stack<>();

    public DepositAccount(double value) {
        super(value);
    }

    public DepositAccount() {
        super(0);
    }

    @Override
    protected void doTake(double value) {
       if (lastTake.isEmpty()) {
            lastTake.push(LocalDate.now());
            super.balance -= value;
        } else {
            if (LocalDate.now().getMonth() != lastTake.pop().getMonth()) {
                lastTake.push(LocalDate.now());
                super.balance -= value;
            } else {
                System.out.println("You already have 1 take this month.");
            }
        }
    }
}