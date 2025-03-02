/*
Q7-Given an integer x, return true if x is a palindrome, and false otherwise. (Palindrome Number-Leetcode).

Input: x = 121

Output: true

Explanation: 121 reads as 121 from left to right and from right to left.

 */
import java.util.*;
public class q7 {
    public static boolean palin(int num){
        int rev =0;
        int realn = num;
        while(realn>0){
            int n = realn%10;
            rev=rev*10+n;
            realn = realn/10;
        }
        if (rev == num){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        //main
        System.out.println(palin(num));
    }
}
