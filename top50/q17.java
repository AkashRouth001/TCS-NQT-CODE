import java.util.Scanner;

/*
Q17-Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1. (Binary Search)

Input: nums = [-1,0,3,5,9,12], target = 9

Output: 4

Explanation: 9 exists in nums and its index is 4
 */
public class q17 {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid to avoid integer overflow

            if (nums[mid] == target) {
                return mid; // Target found, return index
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sorted array
        System.out.println("Enter the elements of the sorted array (space-separated):");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        // Convert String array to Integer array
        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]); // Convert to integer
        }

        // Taking user input for the target element
        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = search(nums, target);

        // Print result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }
}
