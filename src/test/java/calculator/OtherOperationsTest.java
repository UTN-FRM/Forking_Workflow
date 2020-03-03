package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OtherOperationsTest {

    Calculator calculator;

    @BeforeEach
    public void before() {
        this.calculator = new Calculator();
    }

    @Test
    public void testModule() {
        int expected = 43 % 10;
        int result = this.calculator.module(43, 10);
        assertEquals(expected, result);
    }

    @Test
    public void testModuleDivByZero() {
        assertThrows(ArithmeticException.class, () -> this.calculator.module(10, 0), "Divide by zero should throw");
    }

}
