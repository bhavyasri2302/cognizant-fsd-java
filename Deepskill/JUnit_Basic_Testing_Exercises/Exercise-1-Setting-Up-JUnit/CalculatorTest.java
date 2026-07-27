public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result = calc.add(10, 20);

        if(result == 30) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}