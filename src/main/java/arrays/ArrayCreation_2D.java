package arrays;

import java.util.Arrays;

public class ArrayCreation_2D {
    public static void main(String[] args) {
        //declaring an 2D Array
        int[][] twoDArray;

        //instantiating an 2D Array
        twoDArray = new int[2][2];

        //initialize a 2D Array
        twoDArray[0][0]=20;
        twoDArray[0][1]=40;
        twoDArray[1][0]=60;
        twoDArray[1][1]=80;

        System.out.println(Arrays.deepToString(twoDArray));

        //All Together
        String twoDStringArray[][] = {{"a","b","c"},{"c","d","e"}};
        System.out.println(Arrays.deepToString(twoDStringArray));

    }
}
