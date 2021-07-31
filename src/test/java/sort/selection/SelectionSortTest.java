package sort.selection;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testSort()
    {
        int arr[] = new int[]{4,6,2,50,34,1 ,9};
        SelectionSort selection = new SelectionSort();
        selection.sort(arr);
        Assert.assertArrayEquals(new int[]{1,2,4,6,9,34,50},arr);

    }
}
