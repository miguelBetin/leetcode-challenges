import com.leetcode.easy.EqualFrequency;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualFrecuencyTest {

    @Test
    public void testEqualFrecuency(){
//        assertEquals(true, com.leetcode.easy.EqualFrequency.equalFrequency("abc"));
//        assertEquals(true, com.leetcode.easy.EqualFrequency.equalFrequency("abcc"));
//        assertEquals(true, com.leetcode.easy.EqualFrequency.equalFrequency("aa"));
//        assertEquals(true, com.leetcode.easy.EqualFrequency.equalFrequency("cccaa"));
//        assertEquals(false, com.leetcode.easy.EqualFrequency.equalFrequency("ccaa"));
        assertEquals(true, com.leetcode.easy.EqualFrequency.equalFrequency("caabb"));
        assertEquals(false, com.leetcode.easy.EqualFrequency.equalFrequency("bbbaac"));
        assertEquals(true, com.leetcode.easy.EqualFrequency.equalFrequency("cbbd"));
        assertEquals(true, com.leetcode.easy.EqualFrequency.equalFrequency("abbc"));
        assertEquals(false, EqualFrequency.equalFrequency("ddaccb"));

    }

}
