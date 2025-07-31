/**
 * OperatorsDemo.java
 * Demonstrates the different types of operators in Java
 * Part of the Java Basics and OOP Tutorial
 */
public class OperatorsDemo {
    
    // Method to demonstrate short-circuiting behavior
    public static boolean checkStatus() {
        System.out.println("    checkStatus() method was called!");
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Java Operators Demo ===\n");
        
        // Sample variables for demonstrations
        int x = 10;
        int y = 4;
        boolean a = true;
        boolean b = false;
        
        // Arithmetic Operators
        System.out.println("--- Arithmetic Operators ---");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x + y = " + (x + y));    // Addition: 14
        System.out.println("x - y = " + (x - y));    // Subtraction: 6
        System.out.println("x * y = " + (x * y));    // Multiplication: 40
        System.out.println("x / y = " + (x / y));    // Integer Division: 2
        System.out.println("x % y = " + (x % y));    // Modulo: 2
        
        // Demonstrating integer division vs floating-point division
        System.out.println("\n--- Integer vs Floating-Point Division ---");
        System.out.println("15 / 2 (integer division) = " + (15 / 2));           // 7
        System.out.println("15 / 2.0 (floating-point) = " + (15 / 2.0));         // 7.5
        System.out.println("(double) 15 / 2 (cast) = " + ((double) 15 / 2));     // 7.5
        System.out.println("15 % 2 (remainder) = " + (15 % 2));                  // 1
        
        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x == 10: " + (x == 10));     // Equal to: true
        System.out.println("x != y: " + (x != y));       // Not equal to: true
        System.out.println("x > y: " + (x > y));         // Greater than: true
        System.out.println("x < y: " + (x < y));         // Less than: false
        System.out.println("y >= 4: " + (y >= 4));       // Greater than or equal: true
        System.out.println("x <= y: " + (x <= y));       // Less than or equal: false
        
        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("(x > 5) && (y < 5): " + ((x > 5) && (y < 5)));     // Logical AND: true
        System.out.println("(x > 15) || (y > 5): " + ((x > 15) || (y > 5)));   // Logical OR: false
        System.out.println("!a: " + (!a));                                      // Logical NOT: false
        
        // Short-Circuiting Demonstration
        System.out.println("\n--- Short-Circuiting Behavior ---");
        boolean isReady = true;
        
        System.out.println("Testing: isReady || checkStatus()");
        System.out.println("Result: " + (isReady || checkStatus()));
        System.out.println("Notice: checkStatus() was NOT called due to short-circuiting!\n");
        
        isReady = false;
        System.out.println("Testing: isReady || checkStatus()");
        System.out.println("Result: " + (isReady || checkStatus()));
        System.out.println("Notice: checkStatus() WAS called because isReady is false\n");
        
        System.out.println("Testing: false && checkStatus()");
        System.out.println("Result: " + (false && checkStatus()));
        System.out.println("Notice: checkStatus() was NOT called due to short-circuiting!");
        
        // Assignment Operators
        System.out.println("\n--- Assignment Operators ---");
        int z = 20;
        System.out.println("Initial z = " + z);
        
        z += 5;  // Equivalent to: z = z + 5
        System.out.println("After z += 5: " + z);
        
        z -= 3;  // Equivalent to: z = z - 3
        System.out.println("After z -= 3: " + z);
        
        z *= 2;  // Equivalent to: z = z * 2
        System.out.println("After z *= 2: " + z);
        
        z /= 4;  // Equivalent to: z = z / 4
        System.out.println("After z /= 4: " + z);
        
        z %= 3;  // Equivalent to: z = z % 3
        System.out.println("After z %= 3: " + z);
        
        // Increment and Decrement Operators
        System.out.println("\n--- Increment and Decrement Operators ---");
        int count = 5;
        System.out.println("Initial count = " + count);
        
        System.out.println("Pre-increment (++count): " + (++count));   // Increment first, then use
        System.out.println("Post-increment (count++): " + (count++));  // Use first, then increment
        System.out.println("Final count = " + count);
        
        System.out.println("Pre-decrement (--count): " + (--count));   // Decrement first, then use
        System.out.println("Post-decrement (count--): " + (count--));  // Use first, then decrement
        System.out.println("Final count = " + count);
        
        // Ternary Operator
        System.out.println("\n--- Ternary Operator ---");
        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age + ", Status: " + status);
        
        int max = (x > y) ? x : y;
        System.out.println("Maximum of " + x + " and " + y + " is: " + max);
        
        // Operator Precedence Example
        System.out.println("\n--- Operator Precedence ---");
        int result1 = 2 + 3 * 4;        // Multiplication has higher precedence
        int result2 = (2 + 3) * 4;      // Parentheses override precedence
        System.out.println("2 + 3 * 4 = " + result1);        // 14
        System.out.println("(2 + 3) * 4 = " + result2);      // 20
        
        boolean complex = x > 5 && y < 10 || a && !b;
        System.out.println("Complex expression result: " + complex);
        
        System.out.println("\n=== End of Operators Demo ===");
    }
}