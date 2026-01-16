import java.util.Scanner;

class JavaBasicsDemo {

    //  Static variable (shared across all objects)
    static String instituteName = "Ateion Development Team";

    //  Instance variables (unique for each object)
    int instanceCounter = 1;
    double instanceValue = 99.99;

    public static void main(String[] args) {

        // Local variables (exist only inside this method)
        int localNumber = 10;
        String localMessage = "Learning Java Basics";

        // ===============================
        //  Primitive Data Types
        // ===============================

        byte byteVal = 100;           // 1 byte → small numbers
        short shortVal = 32000;       // 2 bytes → medium range
        int intVal = 100000;          // 4 bytes → default for integers
        long longVal = 1000000000L;   // 8 bytes → very large numbers

        float floatVal = 12.5f;       // 4 bytes → decimal, less precision
        double doubleVal = 123.456;   // 8 bytes → decimal, more precision (preferred)

        char charVal = 'A';           // 2 bytes → stores Unicode characters
        boolean boolVal = true;       // 1 bit → true/false values

        // ===============================
        //  Scanner Input
        // ===============================
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        if (!sc.hasNextInt()) {  //invalid input
            System.out.println(" Invalid input! Please enter a valid integer.");
            return;
        }
        int num1 = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        if (!sc.hasNextDouble()) {
            System.out.println(" Invalid input! Please enter a valid decimal.");
            return;
        }
        double num2 = sc.nextDouble();

        // ===============================
        //  Arithmetic Operations
        // ===============================
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double division = (num2 != 0) ? (num1 / num2) : 0;

        // ===============================
        //  Type Casting
        // ===============================

        int castedInt = (int) num2;    // Explicit casting (double → int)
        double autoCast = num1;        // Implicit casting (int → double)

        // ===============================
        //  Formatted Output
        // ===============================
        System.out.printf("\n Arithmetic Results:\n");
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", diff);
        System.out.printf("Product: %.2f\n", product);
        System.out.printf("Division: %.2f\n", division);

        System.out.printf("\n Type Casting:\n");
        System.out.printf("Double to Int: %d\n", castedInt);
        System.out.printf("Int to Double: %.2f\n", autoCast);

        // ===============================
        //  Variable Scope Difference
        // ===============================
        JavaBasicsDemo obj = new JavaBasicsDemo();

        System.out.println("\n Variable Scope Demo:");
        System.out.println("Local Variable: " + localMessage);
        System.out.println("Instance Variable: " + obj.instanceValue);
        System.out.println("Static Variable: " + instituteName);

        sc.close();
    }
}
