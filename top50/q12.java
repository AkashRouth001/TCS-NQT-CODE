/*
Q12-Given an integer array nums, move all O's to the end of it while maintaining the relative order of the non-zero elements.

Input: nums = [0,1,0,3,12]

Output: [1,3,12,0,0]

 */
import java.util.*;
public class q12 {
    static int[] move(int[]arr,int n){
        int j=-1;
        int i;
        for(i=0;i<n;i++){
            if (arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;

        for (i=j+1;i<n;i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return  arr;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = move(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

}
