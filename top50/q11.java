/*
Q11- Given an array arr[] of length N. The task is to find the maximum and the minimum number in the array.

Input: arr[]={1, 2, 3, 4, 5)

Output: Maximum is: 5

Minimum is: 1

Explanation: The maximum of the array is 5 and the minimum of the array is 1.

 */
import java.util.*;
public class q11 {
    static int maxNum(int[]arr,int n){
        int max = Integer.MIN_VALUE;
        for (int i =0;i<n;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int minNum(int[]arr,int n){
        int min = Integer.MAX_VALUE;
        for (int i =0;i<n;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr=new int[n];
        for (int i =-0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //main
        System.out.println("Maximum is:"+maxNum(arr,n));
        System.out.println("Minimum is:"+minNum(arr,n));
    }
}
