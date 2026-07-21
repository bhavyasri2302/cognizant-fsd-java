import java.util.HashMap;

public class ForecastTest {
    public static void main(String[] args) {
        System.out.println("--- Exercise 7: Financial Forecasting Test ---\n");

        double initialInvestment = 10000.0; // $10,000 initial
        double annualGrowthRate = 0.07;     // 7% growth rate
        int forecastYears = 10;             // 10-year projection

        // 1. Recursive Calculation
        double recursiveVal = FinancialForecaster.predictFutureValueRecursive(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Recursive Future Value (%d years): $%.2f%n", forecastYears, recursiveVal);

        // 2. Memoized Calculation
        double memoizedVal = FinancialForecaster.predictFutureValueMemoized(initialInvestment, annualGrowthRate, forecastYears, new HashMap<>());
        System.out.printf("Memoized Future Value (%d years):  $%.2f%n", forecastYears, memoizedVal);

        // 3. Iterative Optimized Calculation
        double iterativeVal = FinancialForecaster.predictFutureValueIterative(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Iterative Future Value (%d years): $%.2f%n\n", forecastYears, iterativeVal);

        // Optimization Notes
        System.out.println("--- Optimization Analysis ---");
        System.out.println("Recursive Time Complexity: O(n)");
        System.out.println("Stack Overflow Risk: Deep recursion (large 'years') can lead to StackOverflowError.");
        System.out.println("Optimization Strategy: Use Memoization or Tail-Iteration to reduce memory complexity to O(1).");
    }
}