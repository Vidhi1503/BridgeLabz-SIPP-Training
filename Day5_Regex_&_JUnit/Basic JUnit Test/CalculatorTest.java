import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calc.add(5, 5), "Addition should be correct");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(7, 5), "Subtraction should be correct");
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calc.multiply(3, 5), "Multiplication should be correct");
    }

    @Test
    void testDivision() {
        assertEquals(4, calc.divide(20, 5), "Division should be correct");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
