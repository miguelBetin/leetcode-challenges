import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

    @Test
    public void testValidParentheses(){
        assertEquals(ValidParentheses.isValidParentheses("()"), true);
        assertEquals(ValidParentheses.isValidParentheses("())"), false);
        assertEquals(ValidParentheses.isValidParentheses("([]())"), true);
        assertEquals(ValidParentheses.isValidParentheses("(}})"), false);
        assertEquals(ValidParentheses.isValidParentheses("}{"), false);
        assertEquals(ValidParentheses.isValidParentheses("()[]{}"), true);

    }

}
