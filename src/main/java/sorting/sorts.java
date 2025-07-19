package sorting;

public class sorts {

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n ; i++){
            int key = arr[i];    // The element to be inserted into the sorted subarray
            int j = i - 1;       // The last element of the sorted subarray

            // Move elements of arr[0......i-1], that are greater than key,
            // to one position ahead of their current position
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];         // Shift element to the right
                j--;
            }

            arr[j+1] = key;             // Place the key in its correct position
        }
    }

    public static void insertionSortInDecreasingOrder(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n ; i++){
            int key = arr[i];    // The element to be inserted into the sorted subarray
            int j = i - 1;       // The last element of the sorted subarray

            // Move elements of arr[0......i-1], that are lesser than key,
            // to one position ahead of their current position
            while(j >= 0 && arr[j] < key){
                arr[j+1] = arr[j];         // Shift element to the right
                j--;
            }

            arr[j+1] = key;             // Place the key in its correct position
        }
    }

    /**
     * The main method that implements QuickSort
     * @param arr The array to be sorted
     * @param low The starting index of the sub-array to be sorted
     * @param high The ending index of the sub-array to be sorted
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);  // Sort the left sub-array
            quickSort(arr, pi + 1, high); // Sort the right sub-array
        }
    }

    /**
     * This method takes the last element as pivot, places the pivot element at
     * its correct position in sorted array, and places all smaller (than pivot)
     * to left of pivot and all greater elements to right of pivot
     * @param arr The array to be partitioned
     * @param low The starting index of the sub-array
     * @param high The ending index of the sub-array (pivot element's index)
     * @return The partitioning index (pivot's final sorted position)
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = (low - 1);     // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++; // increment index of smaller element

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        // This puts the pivot in its correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    public static void mergeSort(int arr[], int left, int right){
        if(left < right){
            // Calculate mid-point. Using (left + right) / 2 is generally fine,
            // but (left + (right - left) / 2) avoids potential overflow for very large left/right.
            int med = (left + right) / 2;

            mergeSort(arr, left, med);
            mergeSort(arr, med + 1, right);

            merge(arr, left, med, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right){
        // Calculate sizes of the two sub-arrays
        int n1 = mid - left + 1; // Number of elements in the left sub-array
        int n2 = right - mid;    // Number of elements in the right sub-array

        // Create temporary arrays to hold the divided elements
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        // Copy elements from the original 'arr' into 'lArr'
        // lArr will contain elements from arr[left] to arr[mid]
        for(int x = 0; x < n1; x++){
            lArr[x] = arr[left + x];
        }

        // Copy elements from the original 'arr' into 'rArr'
        // rArr will contain elements from arr[mid + 1] to arr[right]
        for(int x = 0; x < n2; x++){ // *** Critical fix: changed 'n1' to 'n2' here ***
            rArr[x] = arr[mid + 1 + x];
        }

        // Initialize pointers for the two temporary arrays and the main array
        int i = 0;   // Pointer for lArr
        int j = 0;   // Pointer for rArr
        int k = left; // *** Critical fix: 'k' must start at 'left' for 'arr' ***

        // Compare elements from lArr and rArr and place the smaller one into arr
        while (i < n1 && j < n2){
            if (lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++;
            }
            k++; // Move to the next position in 'arr'
        }

        // Copy any remaining elements from lArr (if j reached end first)
        while (i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from rArr (if i reached end first)
        while (j < n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}
