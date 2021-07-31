package search.linear;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void testSearch()
    {
        LinearSearch ls = new LinearSearch();

        int[] arr = new int[]{1,4,2,4,10, 8,9, 6};
        Assert.assertEquals(4,ls.search(arr, 10));
    }

    @Test
    public void testRecursiveLinearSearch()
    {
        LinearSearch ls = new LinearSearch();

        int[] arr = new int[]{1,4,2,4,10, 8,9, 6};
        Assert.assertEquals(4,ls.recursiveLinearSearch(arr, 0,10));
    }


}
