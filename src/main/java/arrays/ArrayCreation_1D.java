package arrays;

import java.util.Arrays;

public class ArrayCreation_1D {
    public static void main(String[] args) {
        int intArray[];
        intArray = new int[5];
        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 4;
        intArray[3] = 6;
        intArray[4] = 8;

        System.out.println(Arrays.toString(intArray));


        //All Together
        String charArray[] = {"a","b","c"};
        System.out.println(Arrays.toString(charArray));

    }
}
