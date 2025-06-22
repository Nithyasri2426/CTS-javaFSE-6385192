public class LoggerTest {
    public static void main(String[] args) {
        // Get Logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        // Use log method
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verify that all instances are the same
        System.out.println("Logger 1 hash: " + logger1.hashCode());
        System.out.println("Logger 2 hash: " + logger2.hashCode());
        System.out.println("Logger 3 hash: " + logger3.hashCode());
    }
}
