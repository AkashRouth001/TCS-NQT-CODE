/*
Q8- Given an integer array nums sorted in non-decreasing order,
 remove the duplicates in-place such that each unique element appears only once.
 The relative order of the elements should be kept the same.
 Then return the number of unique elements in nums.
 (Remove duplicates from sorted array -Leetcode)

Input: nums = [1, 1, 2]

Output: 2, nums=[1,2]
 */
import java.util.*;
public class q8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //

        int i=0,j;
        for (j=1;j<n;j++){
            if (a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        for (int p=0;p<=i;p++){
            System.out.print(a[p]);
        }
    }
}
