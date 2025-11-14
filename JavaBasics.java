/**
 * JavaBasics.java
 *
 * A comprehensive introduction to Java fundamentals covering:
 * - Primitive data types
 * - Variables and constants
 * - Basic operators
 * - Control flow statements
 * - Basic input/output
 *
 * This file serves as the starting point for beginners before diving into
 * the advanced modules (Collections, Multithreading, Streams, etc.)
 *
 * @author Abhinav
 * @version 1.0
 */

public class JavaBasics {

    /**
     * Main method - Entry point of the Java application
     */
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("        JAVA BASICS - FUNDAMENTAL CONCEPTS");
        System.out.println("=".repeat(60));
        System.out.println();

        // Run all demonstration methods
        demonstratePrimitiveTypes();
        demonstrateVariablesAndConstants();
        demonstrateArithmeticOperators();
        demonstrateRelationalOperators();
        demonstrateLogicalOperators();
        demonstrateConditionalStatements();
        demonstrateLoops();
        demonstrateTypeConversion();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("        END OF JAVA BASICS DEMONSTRATION");
        System.out.println("=".repeat(60));
    }

    /**
     * Demonstrates all 8 primitive data types in Java
     *
     * Primitive Types:
     * - byte (8-bit integer)
     * - short (16-bit integer)
     * - int (32-bit integer)
     * - long (64-bit integer)
     * - float (32-bit floating point)
     * - double (64-bit floating point)
     * - char (16-bit Unicode character)
     * - boolean (true/false)
     */
    private static void demonstratePrimitiveTypes() {
        System.out.println("\n1. PRIMITIVE DATA TYPES");
        System.out.println("-".repeat(50));

        // Integer types
        byte byteVar = 127;                    // Range: -128 to 127
        short shortVar = 32767;                // Range: -32,768 to 32,767
        int intVar = 2147483647;               // Range: -2^31 to 2^31-1
        long longVar = 9223372036854775807L;   // Range: -2^63 to 2^63-1 (note the 'L')

        // Floating-point types
        float floatVar = 3.14159f;             // 32-bit (note the 'f')
        double doubleVar = 3.141592653589793;  // 64-bit (default for decimals)

        // Character and boolean types
        char charVar = 'A';                    // Single character in single quotes
        boolean booleanVar = true;             // true or false

        // Display all primitive types
        System.out.println("byte:    " + byteVar + " (8-bit)");
        System.out.println("short:   " + shortVar + " (16-bit)");
        System.out.println("int:     " + intVar + " (32-bit)");
        System.out.println("long:    " + longVar + " (64-bit)");
        System.out.println("float:   " + floatVar + " (32-bit)");
        System.out.println("double:  " + doubleVar + " (64-bit)");
        System.out.println("char:    " + charVar + " (16-bit Unicode)");
        System.out.println("boolean: " + booleanVar + " (true/false)");
    }

    /**
     * Demonstrates variables and constants in Java
     *
     * Variables: Can be changed after initialization
     * Constants: Use 'final' keyword, cannot be changed
     */
    private static void demonstrateVariablesAndConstants() {
        System.out.println("\n2. VARIABLES AND CONSTANTS");
        System.out.println("-".repeat(50));

        // Variables (can be modified)
        int count = 10;
        System.out.println("Initial count: " + count);
        count = 20;  // Modified
        System.out.println("Modified count: " + count);

        // Constants (cannot be modified)
        final double PI = 3.14159;
        final int MAX_USERS = 100;

        System.out.println("Constant PI: " + PI);
        System.out.println("Constant MAX_USERS: " + MAX_USERS);

        // Uncommenting the line below would cause a compilation error:
        // PI = 3.14;  // Error: cannot assign a value to final variable PI

        // Variable naming conventions
        System.out.println("\nNaming Conventions:");
        System.out.println("- Variables: camelCase (e.g., userName, totalCount)");
        System.out.println("- Constants: UPPER_SNAKE_CASE (e.g., MAX_SIZE, PI)");
        System.out.println("- Classes: PascalCase (e.g., JavaBasics, MyClass)");
    }

    /**
     * Demonstrates arithmetic operators
     *
     * Operators: +, -, *, /, %, ++, --
     */
    private static void demonstrateArithmeticOperators() {
        System.out.println("\n3. ARITHMETIC OPERATORS");
        System.out.println("-".repeat(50));

        int a = 20, b = 7;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b):       " + (a + b));
        System.out.println("Subtraction (a - b):    " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b):       " + (a / b));
        System.out.println("Modulus (a % b):        " + (a % b));

        // Increment and Decrement
        int x = 5;
        System.out.println("\nIncrement/Decrement:");
        System.out.println("x = " + x);
        System.out.println("x++ (post-increment):   " + (x++)); // Returns 5, then increments to 6
        System.out.println("x is now:               " + x);
        System.out.println("++x (pre-increment):    " + (++x)); // Increments to 7, then returns 7
        System.out.println("x-- (post-decrement):   " + (x--)); // Returns 7, then decrements to 6
        System.out.println("x is now:               " + x);
    }

    /**
     * Demonstrates relational (comparison) operators
     *
     * Operators: ==, !=, >, <, >=, <=
     * Result: boolean (true/false)
     */
    private static void demonstrateRelationalOperators() {
        System.out.println("\n4. RELATIONAL (COMPARISON) OPERATORS");
        System.out.println("-".repeat(50));

        int a = 10, b = 20;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b (equal to):              " + (a == b));
        System.out.println("a != b (not equal to):          " + (a != b));
        System.out.println("a > b (greater than):           " + (a > b));
        System.out.println("a < b (less than):              " + (a < b));
        System.out.println("a >= b (greater than or equal): " + (a >= b));
        System.out.println("a <= b (less than or equal):    " + (a <= b));
    }

    /**
     * Demonstrates logical operators
     *
     * Operators: && (AND), || (OR), ! (NOT)
     * Used to combine multiple boolean expressions
     */
    private static void demonstrateLogicalOperators() {
        System.out.println("\n5. LOGICAL OPERATORS");
        System.out.println("-".repeat(50));

        boolean x = true, y = false;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y (Logical AND): " + (x && y)); // Both must be true
        System.out.println("x || y (Logical OR):  " + (x || y)); // At least one must be true
        System.out.println("!x (Logical NOT):     " + (!x));     // Negates the value

        // Practical example
        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = (age >= 18) && hasLicense;

        System.out.println("\nPractical Example:");
        System.out.println("Age: " + age + ", Has License: " + hasLicense);
        System.out.println("Can Drive: " + canDrive);
    }

    /**
     * Demonstrates conditional statements
     *
     * Statements: if, if-else, if-else-if, switch, ternary operator
     */
    private static void demonstrateConditionalStatements() {
        System.out.println("\n6. CONDITIONAL STATEMENTS");
        System.out.println("-".repeat(50));

        // if statement
        int score = 85;
        System.out.println("Score: " + score);

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // switch statement
        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("\nDay " + dayOfWeek + " is: " + dayName);

        // Ternary operator (shorthand for if-else)
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("\n" + number + " is: " + result);
    }

    /**
     * Demonstrates different types of loops
     *
     * Loops: for, while, do-while, enhanced for (for-each)
     */
    private static void demonstrateLoops() {
        System.out.println("\n7. LOOPS");
        System.out.println("-".repeat(50));

        // for loop
        System.out.println("For Loop (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        System.out.println("\nWhile Loop (countdown from 5):");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // do-while loop (executes at least once)
        System.out.println("\nDo-While Loop:");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 5);
        System.out.println();

        // Enhanced for loop (for-each)
        System.out.println("\nEnhanced For Loop (array iteration):");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Break and Continue
        System.out.println("\nBreak and Continue:");
        System.out.print("With break (stops at 5): ");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;  // Exit loop when i is 6
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("With continue (skips 5): ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;  // Skip iteration when i is 5
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Demonstrates type conversion and casting
     *
     * Automatic (Widening): smaller to larger type (e.g., int to double)
     * Manual (Narrowing): larger to smaller type (e.g., double to int) - requires casting
     */
    private static void demonstrateTypeConversion() {
        System.out.println("\n8. TYPE CONVERSION AND CASTING");
        System.out.println("-".repeat(50));

        // Automatic type conversion (widening)
        int intValue = 100;
        double doubleValue = intValue;  // int to double (automatic)
        System.out.println("Automatic Conversion (int to double):");
        System.out.println("int: " + intValue + " → double: " + doubleValue);

        // Manual type casting (narrowing)
        double pi = 3.14159;
        int intPi = (int) pi;  // double to int (manual casting, loses decimal part)
        System.out.println("\nManual Casting (double to int):");
        System.out.println("double: " + pi + " → int: " + intPi + " (decimal part lost)");

        // Char and int conversion
        char letter = 'A';
        int asciiValue = letter;  // char to int (gets ASCII value)
        System.out.println("\nChar to int conversion:");
        System.out.println("char: '" + letter + "' → ASCII: " + asciiValue);

        char fromAscii = (char) 66;  // int to char
        System.out.println("int: 66 → char: '" + fromAscii + "'");

        // String to number conversion
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString);
        System.out.println("\nString to int:");
        System.out.println("String: \"" + numberString + "\" → int: " + parsedInt);

        // Number to String conversion
        int value = 456;
        String valueString = String.valueOf(value);
        System.out.println("\nint to String:");
        System.out.println("int: " + value + " → String: \"" + valueString + "\"");
    }
}

