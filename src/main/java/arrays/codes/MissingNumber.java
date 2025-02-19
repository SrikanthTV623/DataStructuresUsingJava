package arrays.codes;

/*
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
Hint:

Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.


 */
public class MissingNumber {
    public static int findMissingNumberInArray(int[] array){
        int n = array.length+1;
        int expectedSum = (n * (n+1)) / 2;
        int actualSum = 0;
        int missing_Number;

        for(int number : array){
            actualSum += number;
        }

        missing_Number = expectedSum -actualSum;

        return missing_Number;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,6};

        System.out.println(findMissingNumberInArray(array));
    }
}
