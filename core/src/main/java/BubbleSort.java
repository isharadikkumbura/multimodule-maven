public class BubbleSort extends Sort{
    public void sort( int arr[]){
        int n= arr.length;
        int i, j, temp1;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {

		
                    // swap arr[j] and arr[j+1]  efdedwefdefef
                    temp1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp1;
                    swapped = true;
                }
            }

            
            if (swapped == false)
                break;


        }
        printArray(arr);
    }
}
