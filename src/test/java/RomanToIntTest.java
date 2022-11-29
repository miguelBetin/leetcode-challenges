import com.leetcode.easy.RomanToInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntTest {

    @Test
    public void testRomanToInt(){
        assertEquals(RomanToInteger.romanToInt("IV"), 4);
        assertEquals(RomanToInteger.romanToInt("LIV"), 54);
        assertEquals(RomanToInteger.romanToInt("MXIX"), 1019);
        assertEquals(RomanToInteger.romanToInt("XXVIII"), 28);
    }

}
