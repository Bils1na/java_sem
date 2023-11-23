package homework5OOP;

import homework1OOP.Account;

import java.time.LocalDate;

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
            throw new TakeDateException();
        }
    }

    public class TakeDateException extends RuntimeException {

    }

}