public class AssertionsTest {
    public static void main(String[] args) {
        // Assert Equals
        if (5 == (2 + 3))
            System.out.println("assertEquals Passed");
        // Assert True
        if (5 > 3)
            System.out.println("assertTrue Passed");
        // Assert False
        if (!(5 < 3))
            System.out.println("assertFalse Passed");
        // Assert Null
        Object obj1 = null;
        if (obj1 == null)
            System.out.println("assertNull Passed");
        // Assert Not Null
        Object obj2 = new Object();
        if (obj2 != null)
            System.out.println("assertNotNull Passed");
    }
}