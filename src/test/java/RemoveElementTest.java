import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {

    @Test
    public void testRemoveElements(){

        assertEquals(RemoveElement.removeElement(new int[]{3, 2, 2, 3}, 3), 2);
        assertEquals(RemoveElement.removeElement(new int[]{0,0,1,1,1,2,2,3,3,4}, 1), 7);
        assertEquals(RemoveElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2), 5);
        assertEquals(RemoveElement.removeElement(new int[]{4,5}, 4), 1);
        assertEquals(RemoveElement.removeElement(new int[]{-3,-1,0,0,0,3,3}, 0), 4);

    }

}
