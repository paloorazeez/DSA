package sort.quick;

public class QuickSort {

    public void sort(int[] arr, int start, int end) {

        if(end <= start)
            return;
        int pivotPosition = partition(arr, start, end);
        sort(arr, start, pivotPosition-1);
        sort(arr, pivotPosition+1, end);

    }

    private int partition(int[] arr, int start, int end) {

        //take the pivot as last element
        int pivot = arr[end];
        int i = start-1, j = start;
        for(;j< end; j++)
        {
            //check the element is lesser than pivot or not
            //if lesser move to left side of the pivot position
            if(arr[j] <= pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, j);
        return i+1;

    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
