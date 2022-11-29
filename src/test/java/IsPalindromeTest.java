import com.leetcode.easy.IsPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsPalindromeTest {

    @Test
    public void testIsPalindrome(){


        assertEquals(IsPalindrome.isPalindrome(10), false);
        assertEquals(IsPalindrome.isPalindrome(12), false);
        assertEquals(IsPalindrome.isPalindrome(121), true);
        assertEquals(IsPalindrome.isPalindrome(101), true);
        assertEquals(IsPalindrome.isPalindrome(1020), false);
        assertEquals(IsPalindrome.isPalindrome(393), true);

    }

}
