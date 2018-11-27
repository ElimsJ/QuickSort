public class QuickSort
{
    public int partition(int [] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;
        int temp;
        for(int j = left; j < right; j++)
        {
            if( arr[j] <= pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }
    public void quickSort(int [] arr, int left, int right)
    {
        if ( left < right)
        {
            int pivot = partition(arr,left ,right);
            quickSort(arr,left, pivot -1);
            quickSort(arr, pivot +1, right);
        }
    }
}
