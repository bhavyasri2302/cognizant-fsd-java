public class CalculatorTest {

    static Calculator calc;

    // Setup Method (@Before equivalent)
    public static void setUp() {
        calc = new Calculator();
        System.out.println("Setup: Calculator Created");
    }

    // Teardown Method (@After equivalent)
    public static void tearDown() {
        calc = null;
        System.out.println("Teardown: Resources Released");
    }

    public static void main(String[] args) {

        setUp();

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calc.add(a, b);

        // Assert
        if (result == 30) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        tearDown();
    }
}