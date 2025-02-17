package arrays.codes;

/*
2D Arrays
Given 2D array calculate the sum of diagonal elements.
        Example
        myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        sumDiagonalElements(myArray2D) # 15

 */


import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonalElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int array[][] = new int[row][col];

        for(int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(array));

        System.out.println(sumDiagonalElements(array));
    }

    //1st way of writing
    public static int sumDiagonalElements(int[][] array) {

        int sum_Of_Diagonal_Elements = 0;

        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[0].length;col++){
                if(row == col){
                    sum_Of_Diagonal_Elements += array[row][col];
                }
            }
        }

        return sum_Of_Diagonal_Elements;
    }

    /*
    //2nd way of writing
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }

        return sum;
    }

     */

}
