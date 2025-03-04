import java.util.*;

/*
Q20-Q1-A person has many shoes of different sizes and he wants to arrange them,
 Calulate the numbers of pairs of shoes. (TCS 2024 April)

I/P-6 7L 8L 6R 6L 7L 8R

O/P-2
 */
public class q20 {
    public static int countShoePairs(int n, String[] shoes) {
        Map<String, Integer> shoeCounts = new HashMap<>();

        // Count occurrences of each shoe
        for (String shoe : shoes) {
            shoeCounts.put(shoe, shoeCounts.getOrDefault(shoe, 0) + 1);
        }

        int pairs = 0;
        Set<String> uniqueSizes = new HashSet<>();

        // Extract unique sizes
        for (String shoe : shoes) {
            uniqueSizes.add(shoe.substring(0, shoe.length() - 1)); // Remove L/R to get size
        }

        // Calculate pairs for each size
        for (String size : uniqueSizes) {
            int leftCount = shoeCounts.getOrDefault(size + "L", 0);
            int rightCount = shoeCounts.getOrDefault(size + "R", 0);
            pairs += Math.min(leftCount, rightCount);
        }

        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of shoes
        System.out.print("Enter the number of shoes: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read shoe details
        String[] shoes = new String[n];
        System.out.println("Enter shoe sizes with L/R (e.g., 7L 8L 6R 6L 7L 8R): ");
        shoes = scanner.nextLine().split(" ");

        // Calculate and print the number of pairs
        System.out.println("Number of shoe pairs: " + countShoePairs(n, shoes));

        scanner.close();
    }
}
