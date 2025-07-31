/**
 * ControlFlowDemo.java
 * Demonstrates control flow statements in Java
 * Part of the Java Basics and OOP Tutorial
 */


public class ControlFlowDemo {
    public static void main(String[] args) {
        System.out.println("=== Java Control Flow Demo ===\n");
        
        // Decision-Making Statements
        demonstrateIfStatements();
        demonstrateSwitchStatement();
        
        // Looping Statements
        demonstrateForLoop();
        demonstrateWhileLoop();
        demonstrateDoWhileLoop();
        
        // Jump Statements
        demonstrateBreakAndContinue();
        
        System.out.println("=== End of Control Flow Demo ===");
    }
    
    /**
     * Demonstrates if, if-else, and if-else-if statements
     */
    public static void demonstrateIfStatements() {
        System.out.println("--- Decision-Making Statements ---");
        
        // Simple if statement
        boolean isRaining = true;
        System.out.println("Weather check:");
        if (isRaining) {
            System.out.println("  Taking an umbrella!");
        }
        
        // if-else statement
        int hourOfDay = 6;
        System.out.println("\nMorning routine (Hour: " + hourOfDay + "):");
        if (hourOfDay < 7) {
            System.out.println("  Time for a big breakfast!");
        } else {
            System.out.println("  Just grabbing coffee!");
        }
        
        // if-else-if ladder
        String weather = "cloudy";
        System.out.println("\nAfternoon activity (Weather: " + weather + "):");
        if (weather.equals("sunny")) {
            System.out.println("  Going to the park!");
        } else if (weather.equals("cloudy")) {
            System.out.println("  Going for a walk!");
        } else {
            System.out.println("  Staying inside to read!");
        }
        
        // Nested if statements
        int temperature = 75;
        boolean hasUmbrella = true;
        System.out.println("\nDecision matrix (Temp: " + temperature + "°F, Has umbrella: " + hasUmbrella + "):");
        if (temperature > 70) {
            if (hasUmbrella) {
                System.out.println("  Perfect day for a walk with protection!");
            } else {
                System.out.println("  Good day, but should get an umbrella!");
            }
        } else {
            System.out.println("  Too cold for outdoor activities!");
        }
        
        System.out.println();
    }
    
    /**
     * Demonstrates switch statement
     */
    public static void demonstrateSwitchStatement() {
        System.out.println("--- Switch Statement ---");
        
        // Traditional switch with break statements
        int dayOfWeek = 3;
        String dayName;
        
        System.out.println("Day " + dayOfWeek + " of the week:");
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
        System.out.println("  It's " + dayName + "!");
        
        // Switch with multiple cases
        char grade = 'B';
        System.out.println("\nGrade evaluation (Grade: " + grade + "):");
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("  Excellent work!");
                break;
            case 'B':
            case 'b':
                System.out.println("  Good job!");
                break;
            case 'C':
            case 'c':
                System.out.println("  Satisfactory work!");
                break;
            case 'D':
            case 'd':
                System.out.println("  Needs improvement!");
                break;
            case 'F':
            case 'f':
                System.out.println("  Failed. Please try again!");
                break;
            default:
                System.out.println("  Invalid grade!");
        }
        
        System.out.println();
    }
    
    /**
     * Demonstrates for loop variations
     */
    public static void demonstrateForLoop() {
        System.out.println("--- For Loop Examples ---");
        
        // Basic for loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  Count: " + i);
        }
        
        // For loop with different increments
        System.out.println("\nEven numbers from 2 to 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("  Even: " + i);
        }
        
        // Countdown for loop
        System.out.println("\nCountdown from 5:");
        for (int i = 5; i >= 1; i--) {
            System.out.println("  " + i + "...");
        }
        System.out.println("  Blast off! 🚀");
        
        // Enhanced for loop (for-each) with arrays
        System.out.println("\nFruits in basket:");
        String[] fruits = {"Apple", "Banana", "Orange", "Grape"};
        for (String fruit : fruits) {
            System.out.println("  " + fruit);
        }
        
        // Nested for loops
        System.out.println("\nMultiplication table (3x3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("  " + (i * j));
            }
            System.out.println();
        }
        
        System.out.println();
    }
    
    /**
     * Demonstrates while loop
     */
    public static void demonstrateWhileLoop() {
        System.out.println("--- While Loop Examples ---");
        
        // Basic while loop
        int count = 1;
        System.out.println("Processing items:");
        while (count <= 3) {
            System.out.println("  Processing item " + count);
            count++;
        }
        
        // While loop with user input simulation
        String userInput = "yes";
        int gameRound = 1;
        System.out.println("\nGame simulation:");
        while (userInput.equals("yes") && gameRound <= 3) {
            System.out.println("  Playing round " + gameRound);
            gameRound++;
            // Simulate changing user input after round 2
            if (gameRound > 3) {
                userInput = "no";
            }
        }
        System.out.println("  Game ended!");
        
        // While loop for finding a target
        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;
        int index = 0;
        boolean found = false;
        
        System.out.println("\nSearching for " + target + " in array:");
        while (index < numbers.length && !found) {
            System.out.println("  Checking index " + index + ": " + numbers[index]);
            if (numbers[index] == target) {
                found = true;
                System.out.println("  Found " + target + " at index " + index + "!");
            }
            index++;
        }
        
        if (!found) {
            System.out.println("  Target not found!");
        }
        
        System.out.println();
    }
    
    /**
     * Demonstrates do-while loop
     */
    public static void demonstrateDoWhileLoop() {
        System.out.println("--- Do-While Loop Examples ---");
        
        // Basic do-while loop
        int attempts = 0;
        boolean passwordCorrect = false;
        
        System.out.println("Password verification simulation:");
        do {
            attempts++;
            System.out.println("  Attempt " + attempts + ": Checking password...");
            
            // Simulate correct password on attempt 2
            if (attempts == 2) {
                passwordCorrect = true;
                System.out.println("  Password accepted!");
            } else {
                System.out.println("  Password incorrect!");
            }
        } while (!passwordCorrect && attempts < 3);
        
        if (!passwordCorrect) {
            System.out.println("  Account locked after " + attempts + " attempts!");
        }
        
        // Menu simulation with do-while
        System.out.println("\nMenu simulation:");
        int choice;
        int menuIteration = 0;
        
        do {
            menuIteration++;
            System.out.println("  === Menu (Iteration " + menuIteration + ") ===");
            System.out.println("  1. View Profile");
            System.out.println("  2. Settings");
            System.out.println("  3. Exit");
            
            // Simulate user choices
            if (menuIteration == 1) {
                choice = 1;
                System.out.println("  User selected: View Profile");
            } else if (menuIteration == 2) {
                choice = 2;
                System.out.println("  User selected: Settings");
            } else {
                choice = 3;
                System.out.println("  User selected: Exit");
            }
            
        } while (choice != 3);
        
        System.out.println("  Goodbye!");
        System.out.println();
    }
    
    /**
     * Demonstrates break and continue statements
     */
    public static void demonstrateBreakAndContinue() {
        System.out.println("--- Jump Statements (break and continue) ---");
        
        // Break statement example
        System.out.println("Searching for key in drawers:");
        String[] drawers = {"socks", "keys", "documents", "photos"};
        
        for (int i = 0; i < drawers.length; i++) {
            System.out.println("  Checking drawer " + (i + 1) + ": " + drawers[i]);
            if (drawers[i].equals("keys")) {
                System.out.println("  Found keys! Stopping search.");
                break; // Exit the loop immediately
            }
        }
        
        // Continue statement example
        System.out.println("\nProcessing invoices (skipping paid ones):");
        String[] invoices = {"unpaid", "paid", "unpaid", "paid", "unpaid"};
        
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i].equals("paid")) {
                System.out.println("  Invoice " + (i + 1) + " is already paid - skipping");
                continue; // Skip the rest of this iteration
            }
            System.out.println("  Processing invoice " + (i + 1) + " - " + invoices[i]);
            System.out.println("  Payment processed for invoice " + (i + 1));
        }
        
        // Nested loops with labeled break
        System.out.println("\nMatrix search with labeled break:");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int searchFor = 5;
        boolean foundInMatrix = false;
        
        outerLoop: // Label for the outer loop
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("  Checking [" + row + "][" + col + "]: " + matrix[row][col]);
                if (matrix[row][col] == searchFor) {
                    System.out.println("  Found " + searchFor + " at position [" + row + "][" + col + "]!");
                    foundInMatrix = true;
                    break outerLoop; // Break out of both loops
                }
            }
        }
        
        if (!foundInMatrix) {
            System.out.println("  Value not found in matrix!");
        }
        
        System.out.println();
    }
}