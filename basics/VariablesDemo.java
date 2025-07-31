/**
 * VariablesDemo.java
 * Demonstrates the different data types and variable usage in Java
 * Part of the Java Basics and OOP Tutorial
 */
public class VariablesDemo {
    public static void main(String[] args) {
        System.out.println("=== Java Variables and Data Types Demo ===\n");
        
        // Primitive Data Types Examples
        System.out.println("--- Primitive Data Types ---");
        
        // Boolean - true or false
        boolean isLightOn = true;
        System.out.println("Light switch status: " + isLightOn);
        
        // Byte - small integers (-128 to 127)
        byte personAge = 25;
        System.out.println("Person's age: " + personAge);
        
        // Short - medium integers (-32,768 to 32,767)
        short studentsInSchool = 1250;
        System.out.println("Students in school: " + studentsInSchool);
        
        // Int - default choice for whole numbers
        int bankBalance = 150000;
        System.out.println("Bank balance: $" + bankBalance);
        
        // Long - very large numbers
        long worldPopulation = 8000000000L; // Note the 'L' suffix
        System.out.println("World population: " + worldPopulation);
        
        // Float - single precision decimal numbers
        float gamePhysics = 3.14159f; // Note the 'f' suffix
        System.out.println("Game physics calculation: " + gamePhysics);
        
        // Double - default choice for decimal numbers
        double scientificCalculation = 299792458.0; // Speed of light
        System.out.println("Speed of light (m/s): " + scientificCalculation);
        
        // Char - single character
        char grade = 'A';
        char symbol = '$';
        char numberChar = '7';
        System.out.println("Grade: " + grade + ", Symbol: " + symbol + ", Number character: " + numberChar);
        
        // Reference Types Examples
        System.out.println("\n--- Reference Data Types ---");
        
        // String - sequence of characters
        String welcomeMessage = "Welcome to Java Programming!";
        System.out.println("Message: " + welcomeMessage);
        
        // Demonstrating the difference between primitive and reference types
        System.out.println("\n--- Primitive vs Reference Comparison ---");
        
        // Primitive comparison with ==
        int num1 = 100;
        int num2 = 100;
        System.out.println("num1 == num2 (primitives): " + (num1 == num2)); // true
        
        // Reference comparison with ==
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1 == str2 (references): " + (str1 == str2)); // false - different objects
        System.out.println("str1.equals(str2) (content): " + str1.equals(str2)); // true - same content
        
        // Variable declaration and initialization examples
        System.out.println("\n--- Variable Declaration and Initialization ---");
        
        // Declaration first, then initialization
        int score;
        score = 100;
        System.out.println("Score after initialization: " + score);
        
        // Combined declaration and initialization
        int totalPoints = 500;
        System.out.println("Total points: " + totalPoints);
        
        // Multiple variable declarations
        int x = 10, y = 20, z = 30;
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
        
        // Demonstrating type safety (static typing)
        System.out.println("\n--- Static Typing Examples ---");
        
        // This would cause a compile error:
        // int invalidAssignment = "This is a string"; // ERROR!
        
        // Correct type assignments
        int validInt = 42;
        String validString = "This is correct";
        double validDouble = 3.14159;
        
        System.out.println("Static typing ensures: int=" + validInt + 
                          ", String=" + validString + 
                          ", double=" + validDouble);
        
        // Constants (final variables)
        System.out.println("\n--- Constants ---");
        final double PI = 3.14159265359;
        final int DAYS_IN_WEEK = 7;
        System.out.println("PI = " + PI);
        System.out.println("Days in a week = " + DAYS_IN_WEEK);
        
        // This would cause a compile error:
        // PI = 3.14; // ERROR! Cannot reassign final variable
        
        System.out.println("\n=== End of Variables Demo ===");
    }
}