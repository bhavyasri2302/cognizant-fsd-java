import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        System.out.println("--- Running Logging Example ---\n");

        // Logging at various log levels
        logger.error("This is an error message!");
        logger.warn("This is a warning message!");
        logger.info("This is an informational message.");
        logger.debug("This is a debug message.");

        System.out.println("\n--- Log Execution Completed ---");
    }
}