import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calculator.subtract(10, 6));
    }
}
