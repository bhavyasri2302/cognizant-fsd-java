import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        System.out.println("--- Exercise 2: E-Commerce Search Test ---\n");

        Product[] products = {
            new Product("P103", "Wireless Mouse", "Electronics"),
            new Product("P101", "Gaming Laptop", "Computers"),
            new Product("P105", "Mechanical Keyboard", "Electronics"),
            new Product("P102", "USB-C Hub", "Accessories"),
            new Product("P104", "Monitor Stand", "Office Supplies")
        };

        String targetId = "P104";

        // 1. Linear Search
        System.out.println("1. Running Linear Search...");
        Product linearResult = SearchAlgorithms.linearSearch(products, targetId);
        System.out.println("Found: " + linearResult + "\n");

        // 2. Binary Search (Requires array to be sorted)
        System.out.println("2. Sorting array for Binary Search...");
        Arrays.sort(products);

        System.out.println("Running Binary Search...");
        Product binaryResult = SearchAlgorithms.binarySearch(products, targetId);
        System.out.println("Found: " + binaryResult + "\n");

        // Time Complexity Summary
        System.out.println("--- Analysis Summary ---");
        System.out.println("Linear Search: Best = O(1), Average/Worst = O(n)");
        System.out.println("Binary Search: Best = O(1), Average/Worst = O(log n)");
        System.out.println("Recommendation: Binary Search is optimal for large, frequently searched platforms if data remains sorted.");
    }
}