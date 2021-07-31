package sort.selection;

public class SelectionSort {


    public void sort(int[] arr) {

        for(int i=0; i< arr.length; i++)
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                //compare arr[j] with right side
                if(arr[j] < arr[min])
                    min = j;
            }
            //swap arr[i] with min value
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }
}
