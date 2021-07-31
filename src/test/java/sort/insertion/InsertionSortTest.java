package sort.insertion;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class InsertionSortTest {

    @Test
    public void testSort()
    {
        int arr[] = new int[]{4,6,2,50,34,1 ,9};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        Assert.assertArrayEquals(new int[]{1,2,4,6,9,34,50},arr);

    }


    @Test
    public void testSortPerformance()
    {
        int arr[] = new int[100000];
        for(int i=0;i<100000;i++)
        {
            int val = new Random().nextInt(100000);
            arr[i] = val;
        }
        long start = System.currentTimeMillis();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.println("Total time taken to sort "+(System.currentTimeMillis() - start));
    }
}
