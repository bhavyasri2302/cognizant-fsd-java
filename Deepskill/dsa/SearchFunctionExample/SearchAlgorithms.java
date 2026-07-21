public class SearchAlgorithms {

    // Linear Search: O(n) Time Complexity
    public static Product linearSearch(Product[] products, String targetId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetId)) {
                return product; // Found
            }
        }
        return null; // Not found
    }

    // Binary Search: O(log n) Time Complexity (Assumes array is sorted by productId)
    public static Product binarySearch(Product[] products, String targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = products[mid].getProductId().compareTo(targetId);

            if (comparison == 0) {
                return products[mid]; // Found
            } else if (comparison < 0) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }
        return null; // Not found
    }
}