public class QuickSort  {

    public void Sort(int[] arr, int low, int high) {
        if (low >= high) return;
        int pivot = arr[low + (high - low) / 2];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot ){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }

            //swap
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // recursive
        if (low < j) Sort(arr, low, j);
        if (high > i) Sort(arr, i, high);
    }
}