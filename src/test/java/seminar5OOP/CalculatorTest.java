package seminar5OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        int actualSum = calculator.sum(2, 2);
        int expectedSum = 4;

//        Assertions.assertEquals(expectedSum, actualSum);
        Assertions.assertTrue(expectedSum == actualSum);
    }

    @Test
    void testSum2() {
        Calculator calculator = new Calculator();
        int actualSum = calculator.sum(3, 5);
        int expectedSum = 8;

        Assertions.assertEquals(expectedSum, actualSum);
    }
}