import com.leetcode.easy.GoodString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodStringTest {

    @Test
    public void testGoodString(){

        assertEquals(GoodString.makeGood("s"), "s");
        assertEquals(GoodString.makeGood("leEeetcode"), "leetcode");
        assertEquals(GoodString.makeGood("abBAcC"), "");
        assertEquals(GoodString.makeGood("aabbccdd"), "aabbccdd");

    }

}
