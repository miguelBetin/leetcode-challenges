import com.leetcode.easy.RemoveDuplicates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates(){

        assertEquals(RemoveDuplicates.removeDuplicates(new int[]{1, 1, 2}), 2);
        assertEquals(RemoveDuplicates.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}), 5);
        assertEquals(RemoveDuplicates.removeDuplicates(new int[]{-3,-1,0,0,0,3,3}), 4);

    }

}
