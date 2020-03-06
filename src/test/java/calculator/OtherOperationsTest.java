package calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OtherOperationsTest {

    Calculator calculator;

    @BeforeEach
    public void before(){
        this.calculator = new Calculator();
    }

    @Test
    public void testMultiply() throws Exception {

        int expected = 5 * 5;
        int result = this.calculator.multiply(5,5);
        //traza
        System.out.println("Expected: "+expected+ " - Result: "+result);
        assertEquals(expected,result);
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

    @Test
    public void testMinium(){
        int operator1 = 5;
        int operator2 = 7;
        int expected = 5;
        float result = this.calculator.minimum(operator1,operator2);
        System.out.println("Expected: "+expected+". Result: "+result);
        assertEquals(expected,result, 0.0f);
    }
    
}
