/* 
import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber != 0) {
                count++;
            }else{
                break;
            }
        }

        System.out.println("Number of numbers: " + count);
        scanner.close();
    }
} 
*/

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NumberOfNumbers {
    private static final Logger logger = Logger.getLogger(NumberOfNumbers.class.getName());

    public static void main(String[] args) {
        // Setup JSON logging
        setupLogger();

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        try {
            logger.info("NumberOfNumbers program started");
            logger.info("Starting number input loop");

            while (true) {
                System.out.println("Give a number:");
                String input = scanner.nextLine();
                logger.fine("User input received: " + input);

                try {
                    int inputNumber = Integer.parseInt(input);
                    logger.fine("Successfully parsed: " + inputNumber);

                    if (inputNumber != 0) {
                        count++;
                        logger.info("Non-zero number entered: " + inputNumber + ", total count: " + count);
                    } else {
                        logger.info("Zero entered, exiting loop");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    logger.log(Level.WARNING, "Invalid number format: " + input, e);
                    // Continue loop instead of breaking on error
                }
            }

            System.out.println("Number of numbers: " + count);
            logger.info("Final count: " + count);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unexpected error occurred", e);
        } finally {
            scanner.close();
            logger.info("Scanner closed, program ending");
            closeLogger();
        }
    }

    private static void setupLogger() {
        try {
            // Remove default console handler
            Logger rootLogger = Logger.getLogger("");
            Handler[] handlers = rootLogger.getHandlers();
            for (int i = 0; i < handlers.length; i++) {
                rootLogger.removeHandler(handlers[i]);
            }

            // Add JSON file handler
            FileHandler fileHandler = new FileHandler("B:\\JAVA\\MOOC\\assignment logs\\part2.json", true);
            fileHandler.setFormatter(new JsonFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            System.err.println("Failed to setup logger: " + e.getMessage());
        }
    }

    private static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (int i = 0; i < handlers.length; i++) {
            handlers[i].close();
        }
    }

    // Custom JSON Formatter class
    static class JsonFormatter extends Formatter {
        private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        @Override
        public String format(LogRecord record) {
            StringBuilder json = new StringBuilder();
            json.append("{");
            json.append("\"timestamp\":\"").append(dateFormat.format(new Date(record.getMillis()))).append("\",");
            json.append("\"level\":\"").append(record.getLevel().toString()).append("\",");
            json.append("\"logger\":\"").append(record.getLoggerName()).append("\",");
            json.append("\"class\":\"").append(record.getSourceClassName()).append("\",");
            json.append("\"method\":\"").append(record.getSourceMethodName()).append("\",");
            json.append("\"message\":\"").append(escapeJson(formatMessage(record))).append("\"");

            // Add exception if present
            if (record.getThrown() != null) {
                json.append(",\"exception\":{");
                json.append("\"class\":\"").append(record.getThrown().getClass().getName()).append("\",");
                json.append("\"message\":\"").append(escapeJson(record.getThrown().getMessage())).append("\",");
                json.append("\"stackTrace\":\"").append(escapeJson(getStackTrace(record.getThrown()))).append("\"");
                json.append("}");
            }

            json.append("}\n");
            return json.toString();
        }

        private String escapeJson(String str) {
            if (str == null)
                return "";
            return str.replace("\\", "\\\\")
                    .replace("\"", "\\\"")
                    .replace("\n", "\\n")
                    .replace("\r", "\\r")
                    .replace("\t", "\\t");
        }

        private String getStackTrace(Throwable throwable) {
            StringBuilder sb = new StringBuilder();
            sb.append(throwable.toString()).append("\\n");
            StackTraceElement[] elements = throwable.getStackTrace();
            for (int i = 0; i < elements.length; i++) {
                sb.append("  at ").append(elements[i].toString()).append("\\n");
            }
            return sb.toString();
        }
    }
}
