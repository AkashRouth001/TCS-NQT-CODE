/*
Q3-Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. (Contains Duplicate -Leetcode)

Input: nums = [1,2,3,1]

Output: true
 */
import java.util.*;
public class q3 {
    public static boolean ans(int []arr,int n){
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr =new int[n];
        for (int i =0;i<n;i++){
             arr[i] = sc.nextInt();
        }
       System.out.print( ans(arr,n));
    }
}
