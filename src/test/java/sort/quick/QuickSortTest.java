package sort.quick;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class QuickSortTest {

    @Test
    public void testSort()
    {
        QuickSort QuickSort = new QuickSort();
        int arr[] = new int[]{4,6,2,50,34,1 ,9};

        QuickSort.sort(arr, 0, arr.length-1);
        Assert.assertArrayEquals(new int[]{1,2,4,6,9,34,50},arr);

    }

    @Test
    public void testSort2()
    {
        QuickSort QuickSort = new QuickSort();
        int arr[] = new int[]{9,7,3,1,6,3,2,6,8,9,2,3,0};

        QuickSort.sort(arr, 0, arr.length-1);
        Assert.assertArrayEquals(new int[]{0,1,2,2,3,3,3,6,6,7,8,9,9},arr);

    }

    @Test
    public void testSortPerformance()
    {
        QuickSort QuickSort = new QuickSort();
        int arr[] = new int[100000];
        for(int i=0;i<100000;i++)
        {
            int val = new Random().nextInt(100000);
            arr[i] = val;
        }
        System.out.println("Before Sort");
        //printArray(arr);
        long start = System.currentTimeMillis();
        QuickSort.sort(arr, 0, arr.length-1);
        long end = System.currentTimeMillis();
        System.out.println("Total time taken:"+ (end -start));
        System.out.println("After Sort");
        //printArray(arr);
        //Assert.assertArrayEquals(new int[]{1,2,4,6,9,34,50},arr);

    }
}
