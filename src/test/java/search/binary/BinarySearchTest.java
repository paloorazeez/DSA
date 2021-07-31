package search.binary;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testSearch()
    {

        BinarySearch bs = new BinarySearch();
        int[] arr = new int[]{1, 5, 10, 20, 25, 30, 45, 50};
        Assert.assertEquals(6, bs.search(45, arr));

    }


    @Test
    public void testSearchNegative()
    {

        BinarySearch bs = new BinarySearch();
        int[] arr = new int[]{1, 5, 10, 20, 25, 30, 45, 50};
        Assert.assertEquals(-1, bs.search(55, arr));

    }

    @Test
    public void testRecursiveSearch()
    {

        BinarySearch bs = new BinarySearch();
        int[] arr = new int[]{1, 5, 10, 20, 25, 30, 45, 50};
        Assert.assertEquals(6, bs.recursiveSearch( arr , 0, arr.length, 45));

    }

    @Test
    public void testRecursiveSearch2()
    {

        BinarySearch bs = new BinarySearch();
        int[] arr = new int[]{1, 5, 10, 20, 25, 30, 45, 50};
        Assert.assertEquals(7, bs.recursiveSearch( arr , 0, arr.length, 50));

    }

    @Test
    public void testRecursiveSearchNegative()
    {

        BinarySearch bs = new BinarySearch();
        int[] arr = new int[]{1, 5, 10, 20, 25, 30, 45, 50};
        Assert.assertEquals(-1, bs.recursiveSearch( arr , 0, arr.length, 55));

    }

}
