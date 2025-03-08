package array_input;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayComa {
    public static ArrayList<Integer> inputCommaSeparated() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input).useDelimiter(",");//.useDelimiter(",") → Sets the delimiter to a comma (,), so Scanner will split the input based
        while (ss.hasNextInt()) {//ss.hasNextInt() → Checks if there's another integer in the input.
            arr.add(ss.nextInt());//ss.nextInt() → Reads the next integer and adds it to the ArrayList.

        }
        return arr;
    }
    public static void main(String[]args){
        ArrayList<Integer> arr3 = inputCommaSeparated();
        System.out.println("Case 3: 1,2,3,4,5");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
