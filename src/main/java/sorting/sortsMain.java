package sorting;



public class sortsMain {
    public static void main(String[] args) {
        sorts s = new sorts();

        int arr[] = {5,4,9,2,3,1,6};
        System.out.print("Original Array: ");
        printArray(arr);

        s.insertionSort(arr);
        System.out.print("Array after Insertion Sort: ");
        printArray(arr);

        s.insertionSortInDecreasingOrder(arr);
        System.out.print("Array after Insertion Sort in Decreasing Order: ");
        printArray(arr);

        s.quickSort(arr,0, arr.length - 1);
        System.out.print("Array after Quick Sort: ");
        printArray(arr);

        s.mergeSort(arr,0,arr.length - 1);
        System.out.print("Array after Merge Sort: ");
        printArray(arr);

    }
    public static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
