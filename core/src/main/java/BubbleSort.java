public class BubbleSort extends Sort{
    public void sort( int arr[]){
        int n= arr.length;
        int i, j, temp2;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {

		
                    // swap arr[j] and arr[j+1]  efdedwefdefef
                    temp2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp2;
                    swapped = true;
                }
            }

            
            if (swapped == false)
                break;


        }
        printArray(arr);
    }
}
