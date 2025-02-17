package arrays.codes;

/*
Best Score

Given an array, write a function to get first, second best scores from the array and return it in new array.
Array may contain duplicates.

Example
        myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
        firstSecond(myArray) // {90, 87}

 */

import java.util.Arrays;
import java.util.Scanner;

public class FindTopTwoScores {

    public static int[] topTwoScores(int array[]) {
        int firstLargestScore = Integer.MIN_VALUE;
        int secondLargestScore = Integer.MIN_VALUE;

        //int topTwoScoresArray[] = new int[2];

        //using for each loop
        for(int score:array){
            if(score>firstLargestScore){
                secondLargestScore=firstLargestScore;
                firstLargestScore=score;
            }
            else if(score>secondLargestScore && score<firstLargestScore){
                secondLargestScore=score;
            }
        }

        /*
        for (int i=0;i<array.length;i++){
            if(array[i]>firstLargestScore){
                secondLargestScore=firstLargestScore;
                firstLargestScore=array[i];
            }
            else if(array[i]>secondLargestScore && array[i]<firstLargestScore){
                secondLargestScore=array[i];
            }
        }

         */

        return new int[]{firstLargestScore,secondLargestScore};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int scores_Array[] = {84,56,66,85,90,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println("enter no of elements in array");
        int n = sc.nextInt();
        int scores_Array[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<scores_Array.length;i++){
            scores_Array[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(scores_Array));

        System.out.println(Arrays.toString(topTwoScores(scores_Array)));
    }
}
