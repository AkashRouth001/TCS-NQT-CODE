import java.util.Scanner;

/*
Q6-Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. (Two Sum - Leetcode)

Input: nums = [2,7,11,15], target = 9

Output: [0,1]

 */
public class q6 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        // main

        int l=0;
        int r= n-1;
        int sum;
        while(l<r){
            sum = arr[l]+arr[r];
            if (sum == target){
                System.out.println(l+","+r);
                break;
            } else if (sum<target) {
                l++;
            }
            else {
                r--;
            }
        }
    }
}
