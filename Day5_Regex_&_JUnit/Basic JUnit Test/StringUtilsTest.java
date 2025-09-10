import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils util = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("cba", util.reverse("abc"));
    }

    @Test
    void testPalindrome() {
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", util.toUpperCase("hello"));
    }
}
