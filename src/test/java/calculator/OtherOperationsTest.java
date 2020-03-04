package calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertEquals;

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
}
