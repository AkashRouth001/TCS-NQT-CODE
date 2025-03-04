/*
Q18- A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index.
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words,
an element is always considered to be strictly greater than a neighbor that is outside the array.( Find Peak Element - Leetcode)

Input: nums = [1,2,3,1]

Output: 2

Explanation: 3 is a peak element and your function should return the index number 2.
 */
import java.util.*;
public class q18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //
        int max = Integer.MIN_VALUE;

        int maxIndex = 0;
        for (int i =0;i<n;i++){
            if (max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }
}
