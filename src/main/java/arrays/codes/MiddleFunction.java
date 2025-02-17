package arrays.codes;

// Write a function called middle that takes an array and returns a new array that
// contains all but the first and last elements.

//myArray = [1, 2, 3, 4]
//middle(myArray)  # [2,3].

import java.util.Arrays;
import java.util.Scanner;

public class MiddleFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements in an array:");
        int  n = sc.nextInt();
        int myArray[] = new int[n];
        for(int i=0;i<n;i++){
            myArray[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(middleArray(myArray)));
    }

    public static int[] middleArray(int array[]){
        int middle_Array[] = new int[array.length-2];
        if(array.length<=2){
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }
        for (int index=1;index<array.length-1;index++){
            middle_Array[index-1] = array[index];
        }
        return middle_Array;
    }
}
