package array_input;

import java.util.ArrayList;
import java.util.Scanner;
//Case 1: [1,2,3,4,5]
public class array3rdBracketAndComa {
    public static ArrayList<Integer> inputArrayFormat() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();//Reads a full line of user input as a String.
        for (char c : input.toCharArray()) {//Converts the input string into a character array and iterates over each character.
            if (Character.isDigit(c)) {//Checks if the current character c is a digit (0-9).
                int num = Character.getNumericValue(c);//Converts the character c into an integer using Character.getNumericValue(c)
                arr.add(num);
            }
        }
        return arr;
    }
    public static void main(String[]args){
        ArrayList<Integer> arr1 = inputArrayFormat();
        System.out.println("Case 1: [1,2,3,4,5]");
        for (int num : arr1) {
            System.out.print(num);
        }
        System.out.println();
    }
}
