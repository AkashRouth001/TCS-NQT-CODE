/*
find the sum of the given array
*/
import java.util.*;
public class q1 {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int []arr= new int[n];
    // input the array
    for (int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    //solve
    int sum =0;
    for(int i=0;i<n;i++){
        sum = sum + arr[i];
    }
    System.out.println(sum);
 }
}
