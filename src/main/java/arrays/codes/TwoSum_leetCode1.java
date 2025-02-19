package arrays.codes;

/*
Two Sum - LeetCode 1
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

Examples

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]

Input: nums = [3,2,4], target = 6
Output: [1,2]

 */

import java.util.Arrays;

public class TwoSum_leetCode1 {

    public static int[] twoSum(int[] array,int target){
        for(int i=0;i<array.length-1;i++){
            if (array[i]+array[i+1]==target){
                return new int[]{i,i+1};
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int[] arr2 = {3,2,4};
        int target1 = 9;
        int target2 = 6;

        System.out.println(Arrays.toString(twoSum(arr1,target1)));
        System.out.println(Arrays.toString(twoSum(arr2,target2)));
    }
}
