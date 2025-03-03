/*
Q16-Given an integer array nums, find a subarray that has the largest product, and return the product. (Maximum product subarray-Leetcode)

Input: nums = [2,3,-2,4]

Output:6
 */
import java.util.*;
public class q16 {
    static int maxProduct(int[]arr,int n){
        int maxP =arr[0];
        for(int i=0;i<n;i++){
            int p =arr[i];
            for (int j=i+1;j<n;j++){
                maxP = Math.max(maxP,p);
                p*=arr[j];
            }
           maxP = Math.max(maxP,p);
        }
        return  maxP;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr=new int [n];
        for (int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        System.out.println(maxProduct(arr,n));
    }
}
