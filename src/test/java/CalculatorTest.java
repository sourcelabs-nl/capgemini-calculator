import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void shouldMultiplyTwoNumbers() {
        // call the multiply method and verify the result is correct
    }

    @Test
    public void shouldDivideTwoNumbers() {
        // call the divide method and verify the result is correct
    }

    @Test
    public void shouldSumTwoNumbers() {
        // call the sum method and verify the result is correct
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        // call the subtract method - can you spot the bug?
        assertEquals(3, calculator.subtract(6,3));
    }

    //TODO add a test for the maxValue() method!

}
