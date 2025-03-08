package array_input;
import java.util.*;
public class SizeAndArray {
    public static void main(String[]args){
        // taking input
        Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int []arr=new int[size];
         for (int i =0;i<size;i++){
             arr[i]=sc.nextInt();
         }

         // output
        for (int i =0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
