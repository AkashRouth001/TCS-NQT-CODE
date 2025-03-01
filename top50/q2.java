/*
give the array element find with linear search
 */
import java.util.*;
public class q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r=0;
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        // main
        for (int i =0;i<n;i++){
            if(arr[i]==target){
                System.out.print(i);
            }
        }

    }
}
