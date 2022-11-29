import com.leetcode.easy.EqualFrequency;
import com.leetcode.easy.ReverseWords;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsTest {

    @Test
    public void testReverseWords(){

        assertEquals("blue is sky the", ReverseWords.reverseWords("the sky is blue"));
        assertEquals("example good a", ReverseWords.reverseWords("a good   example"));
        assertEquals("example good a", ReverseWords.reverseWords("a good   example"));
        assertEquals("example good a", ReverseWords.reverseWords("a good   example"));



    }

}
