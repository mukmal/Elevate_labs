class Calculator {

    /* ========= 1. BASIC CALCULATOR METHODS ========= */

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        validateDivision(b);
        return a / b;
    }

    /* ========= 2. METHOD OVERLOADING ========= */

    // Overloaded add method using String inputs
    public static int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    /* ========= 3. REUSABLE UTILITY METHOD ========= */

    private static void validateDivision(double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
    }

    /* ========= 4. PASS-BY-VALUE DEMONSTRATION ========= */

    public static void modifyValue(int x) {
        x = x + 10; // Change does not affect original variable
        System.out.println("Inside method x = " + x);
    }

    /* ========= 5. TESTING EACH METHOD ========= */

    public static void main(String[] args) {

        // Testing addition
        System.out.println("Add int: " + add(10, 20));
        System.out.println("Add double: " + add(5.5, 2.5));
        System.out.println("Add String: " + add("30", "40"));

        // Testing subtraction
        System.out.println("Subtract: " + subtract(20, 5));

        // Testing multiplication
        System.out.println("Multiply: " + multiply(4, 5));

        // Testing division with exception handling
        try {
            System.out.println("Divide: " + divide(10, 2));
            System.out.println("Divide: " + divide(10, 0)); // Exception case
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Pass-by-value test
        int num = 50;
        modifyValue(num);
        System.out.println("Outside method num = " + num);
    }
}
