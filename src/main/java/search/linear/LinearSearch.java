package search.linear;

public class LinearSearch {

    public int search(int arr[], int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }


    public int recursiveLinearSearch(int arr[], int i, int key)
    {
            if(i > arr.length-1)
                return -1;
            else if(arr[i] == key)
                return i;
            else
                return recursiveLinearSearch(arr, i+1, key);
    }
}
