import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertTest {

    @Test
    public void testSearchInsert(){

        assertEquals(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
        assertEquals(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2), 1);
        assertEquals(SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7), 4);

    }

}
