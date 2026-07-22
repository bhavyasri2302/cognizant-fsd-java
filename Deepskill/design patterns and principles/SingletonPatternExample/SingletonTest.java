public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("--- Singleton Pattern Test ---");

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("User logged in.");

        System.out.println("Logger 1 HashCode: " + logger1.hashCode());
        System.out.println("Logger 2 HashCode: " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both references point to the exact same Logger instance.");
        } else {
            System.out.println("FAILURE: Different Logger instances were created.");
        }
    }
}