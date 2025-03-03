/*
Q15- You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4]

Output: 5

Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit 6-1=5.
 */
import java.util.*;
public class q15 {
    static int prof(int []arr,int n){
        int min=Integer.MAX_VALUE;
        int maxpro =0;
        for (int i =0;i<n;i++){
            min = Math.min(arr[i],min);
            maxpro = Math.max(maxpro,arr[i]-min);
        }
        return maxpro;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("max pro="+prof(arr,n));
    }
}
