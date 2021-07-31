package sort.merge;

public class MergeSort {
    public void sort(int[] arr) {
    }

    public void sort(int[] arr, int start, int end) {
        ///base condition
        if(end <= start)
            return;
        //calculate mid for splitting
        int mid = (start+end)/2;
        //split left side further until single element
        sort(arr, start, mid);
        //split right side further until single element
        sort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {

        int leftArr[] = new int[(mid-start)+2];
        int rightArr[] = new int[(end-mid)+1];
        //populate leftArray
        for(int i=start;i<=mid;i++)
        {
            leftArr[i-start] = arr[i];
        }
        leftArr[leftArr.length-1] = Integer.MAX_VALUE;

        //populate right array
        for(int i=mid+1;i<=end;i++)
        {
            rightArr[i-(mid+1)] = arr[i];
        }
        rightArr[rightArr.length-1] = Integer.MAX_VALUE;

        int k=start;

        int i=0,j=0;
          while(leftArr[i] != Integer.MAX_VALUE || rightArr[j] != Integer.MAX_VALUE)
        {
            if(leftArr[i]>rightArr[j])
            {
                arr[k] = rightArr[j];
                j++;

            }
            else
            {
                arr[k] = leftArr[i];
                i++;

            }
            k++;
        }

    }
}
