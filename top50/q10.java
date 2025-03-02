import java.util.Arrays;
import java.util.Scanner;

public class q10 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // main
        Arrays.sort(arr);
        for (int i =0;i<n;i++){
            int count =0;
            if (i==0||arr[i]!=arr[i-1]){
                count =1;
                int num =  arr[i];
                for (int j =i+1;j<n;j++){
                    if (arr[j]==num){
                        count++;
                    }
                }
                System.out.println(num+"=>"+count);
            }
        }
    }
}
