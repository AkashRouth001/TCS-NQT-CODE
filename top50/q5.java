/*
Q5- Given an array nums of size n, return the majority element.
 The majority element is the element that appears more than [n/2] times.
 You may assume that the majority element always exists in the array.

Input: nums = [3,2,3]

Output: 3

 */
import java.util.*;
public class q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr=new int [n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // main
        int count;
        int num;
        for (int i =0;i<n;i++){
            count =0;
            num = arr[i];
            for (int j =0;j<n;j++){
                if (arr[j]==num){
                    count++;
                }

            }
            if (count > (n/2)){
                System.out.println(num);
                break;
            }
        }


    }
}
