package homework5OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AccountTest {

    @Test
    public void testAccountPut() {
        Account testObject = new Account();

        testObject.put(100);
        Assertions.assertEquals("Balance: 100.0$", testObject.getAmount());
    }

    @Test
    public void testAccountPut2() {
        Account testObject = new Account();

        testObject.put(10);
        Assertions.assertEquals("Balance: 10.0$", testObject.getAmount());
    }

    @Test
    public void testAccountTake() {
        Account testObject = new Account();

        testObject.put(100);
        testObject.take(55);
        Assertions.assertEquals("Balance: 45.0$", testObject.getAmount());
    }

    @Test
    public void testAccountTake2() {
        Account testObject = new Account();

        testObject.put(100);
        testObject.take(5);
        Assertions.assertEquals("Balance: 95.0$", testObject.getAmount());
    }


}