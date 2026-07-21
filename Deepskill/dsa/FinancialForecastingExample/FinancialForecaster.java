import java.util.HashMap;
import java.util.Map;

public class FinancialForecaster {

    /**
     * Standard Recursive Approach
     * Formula: FV(n) = FV(n - 1) * (1 + growthRate)
     * Time Complexity: O(n) | Space Complexity: O(n) [Stack overhead]
     */
    public static double predictFutureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue; // Base case
        }
        return predictFutureValueRecursive(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    /**
     * Optimized Approach (Memoization / Dynamic Programming)
     * Eliminates redundant computations and stack overhead.
     * Time Complexity: O(n) | Space Complexity: O(n)
     */
    public static double predictFutureValueMemoized(double presentValue, double growthRate, int years, Map<Integer, Double> memo) {
        if (years == 0) {
            return presentValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }

        double result = predictFutureValueMemoized(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        memo.put(years, result);
        return result;
    }

    /**
     * Iterative Tail-Recursive Equivalent
     * Optimized for O(1) space complexity.
     */
    public static double predictFutureValueIterative(double presentValue, double growthRate, int years) {
        double futureValue = presentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}