package homework5OOP;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DepositAccountTest {

    @Test
    public void testDepositAccountTake() {
        DepositAccount testObject = new DepositAccount();

        testObject.put(100);
        testObject.take(10);
        Assertions.assertThrows(DepositAccount.TakeDateException.class, () -> testObject.take(10));
    }

    @Test
    public void testDepositAccountTake2() {
        DepositAccount testObject = new DepositAccount();

        testObject.put(100);
        Assertions.assertDoesNotThrow(() -> testObject.take(10));
    }

}