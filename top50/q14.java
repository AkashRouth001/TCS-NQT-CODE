import java.util.Scanner;

/*
Q14-Given an integer array nums, return an array answer such
that answer[i] is equal to the product of all the elements of nums except nums[i].
 (Product of array except self-Leetcode)

Input: nums = [1,2,3,4]

Output: [24,12,8,6]

 */
public class q14 {
    static int[]arrpro(int[]arr,int n){
        int[] result = new int[n];
        int j,i;
        for (i=0;i<n;i++){
            int product = 1;
            for (j=0;j<n;j++){
                if (i!=j){
                    product*=arr[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // main
        int[] ans = arrpro(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
