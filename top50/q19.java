import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Q19- Given an integer array arr,
return the number of distinct bitwise ORs of all the non-empty subarrays of arr.

The bitwise OR of a subarray is the bitwise OR of each integer in the subarray.
 The bitwise OR of a subarray of one integer is that integer.
A subarray is a contiguous non-empty sequence of elements within an array.
(Bitwise ORs of Subarrays) (TCS April 2024)

Input: arr = [1,1,2]
Output: 3
Explanation: The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2]. These yield the results 1, 1, 2, 1, 3, 3. There are 3 unique values, so the answer is 3.

 */
public class q19 {
    public static int subarrayBitwiseORs(int[] arr) {
        Set<Integer> result = new HashSet<>(); // Stores all unique OR results
        Set<Integer> prev = new HashSet<>();   // Stores OR values from the previous step

        // Iterate through each element in the array
        for (int num : arr) {
            Set<Integer> curr = new HashSet<>(); // Stores OR values for subarrays ending at the current index

            // Add the current number itself (each number is a subarray by itself)
            curr.add(num);

            // Compute OR with all previous subarrays' results
            for (int val : prev) {
                curr.add(val | num); // Bitwise OR operation
            }

            // Store all unique OR values found so far
            result.addAll(curr);

            // Update prev for the next iteration
            prev = curr;
        }

        // Return the count of unique OR values
        return result.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input as a single line and splitting it into an array
        System.out.println("Enter the elements of the array (space-separated):");
        String input = scanner.nextLine();
        String[] inputArray = input.split(","); // Splitting based on spaces

        // Convert String array to Integer array
        int[] arr = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]); // Converting each element to an integer
        }

        // Compute and display the result
        int result = subarrayBitwiseORs(arr);
        System.out.println("Number of distinct bitwise ORs of all subarrays: " + result);

        scanner.close();
    }
}
