import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Add two numbers")
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(4.0, calculator.add(2, 2));
    }
}