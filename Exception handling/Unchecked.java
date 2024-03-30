public class Main {
    public static void main(String[] args) {
        UncheckedExceptionsDemo demo = new UncheckedExceptionsDemo();
        demo.run();
    }
}

class UncheckedExceptionsDemo {
    public void run() {
        // 1. ArithmeticException
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int element = arr[6]; // Index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        }

        // 3. IllegalArgumentException
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception: " + e.getMessage());
        }

        // 4. NullPointerException
        try {
            String str = null;
            int length = str.length(); // Accessing method on null reference
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }

        // 5. StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            char ch = str.charAt(10); // Index out of bounds
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out of Bounds Exception: " + e.getMessage());
        }

        // 6. NumberFormatException
        try {
            String str = "abc";
            int num = Integer.parseInt(str); // Parsing non-numeric string
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
        }
    }
}
