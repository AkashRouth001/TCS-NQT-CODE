import java.util.*;
/*
Q13-Given two integer arrays nums1 and nums2, return an array of their intersection Each element in the result must be unique and you may return the result in any order. (Intersection of two arrays- Leetcode)

Input: nums1=[4,9,5), nums2= [9,4,9,8,4]

Output: [9,4]

Explanation: [4,9] is also accepted.
 */
public class q13 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check which elements of nums2 exist in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); // Only unique values
            }
        }

        // Convert resultSet to an array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Find intersection
        int[] ans = intersection(arr1, arr2);

        // Output result
        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}