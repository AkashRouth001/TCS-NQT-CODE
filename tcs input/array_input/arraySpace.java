package array_input;

import java.util.ArrayList;
import java.util.Scanner;
//Case 2: 1 2 3 4 5 nad nothing is given
public class arraySpace {
    public static ArrayList<Integer> inputSpaceSeparated() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input);
        while (ss.hasNextInt()) {
            arr.add(ss.nextInt());//ss.nextInt() → Reads the next integer and adds it to the ArrayList.

        }
        return arr;
    }
    public static void main(String[]args){
        ArrayList<Integer> arr2 = inputSpaceSeparated();
        System.out.println("Case 2: 1 2 3 4 5");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
