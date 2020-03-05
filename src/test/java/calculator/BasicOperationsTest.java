package calculator;
// +, -, *, /, / entera

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BasicOperationsTest {

    private Calculator calculator;


    @Test
    public void testSubtraction() {
        int expected = 8 - 6;
        int result = this.calculator.subtraction(8,6);
        System.out.println("Expected (subtraction): "+expected+". Result (subtraction): "+result);
        assertEquals(expected, result);

    }
}
