package search.binary;

public class BinarySearch {

    public int search(int key, int[] arr) {
        //initialize p, q and r
        int p =0, q =0, r = arr.length-1;

        while(p <= r)
        {
            q = (p+r)/2;
            if(arr[q] > key)
                r = q-1;
            else if(arr[q] < key)
                p = q+1;
            else
                return q;
        }

        return -1;
    }

    public int recursiveSearch(int[] arr, int p, int r, int key) {

        while(p<r)
        {
            int q = (p+r)/2;
            if(arr[q] > key)
                return recursiveSearch(arr, p, q-1, key);
            else if(arr[q] < key)
                return recursiveSearch(arr, q+1, r, key);
            else
                return q;
        }
        return -1;
    }
}
