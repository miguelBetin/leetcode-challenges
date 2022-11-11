import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

    @Test
    public void testValidParentheses(){
        assertEquals(validParentheses.isValidParentheses("()"), true);
        assertEquals(validParentheses.isValidParentheses("())"), false);
        assertEquals(validParentheses.isValidParentheses("([]())"), true);
        assertEquals(validParentheses.isValidParentheses("(}})"), false);
        assertEquals(validParentheses.isValidParentheses("}{"), false);
        assertEquals(validParentheses.isValidParentheses("()[]{}"), true);

    }

}
