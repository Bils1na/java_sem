package homework5OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    public void testCreditAccountTake() {
        CreditAccount testObject = new CreditAccount();

        testObject.put(100);
        testObject.take(50);
        Assertions.assertEquals("Balance: 49.5$", testObject.getAmount());
    }

    @Test
    public void testCreditAccountTake2() {
        CreditAccount testObject = new CreditAccount();

        testObject.put(10);
        testObject.take(5);
        Assertions.assertEquals("Balance: 4.95$", testObject.getAmount());
    }

}