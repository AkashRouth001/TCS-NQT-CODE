/*
Output: true

Q4- Given a non-empty array of integers nums,
every element appears twice except for one. Find that single one.

Input: nums = [2, 2, 1]

Output: 1
 */
import java.util.*;
public class q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //

        for(int i=0;i<n;i++){
            int count =0;
            int num = arr[i];
            for (int j =0;j<n;j++){
                if (num ==arr[j]){
                    count ++;
                }
            }
            if (count==1){
                System.out.println(num);
            }
        }
    }
}
