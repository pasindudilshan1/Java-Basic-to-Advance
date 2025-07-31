/**
 * Animal.java - Synthesis Project
 * Abstract class for the Digital Pet Shelter application
 * Demonstrates the integration of all four OOP pillars
 * Part of the Java Basics and OOP Tutorial - Synthesis Project
 */
public abstract class Animal {
    // Encapsulation: Fields are private to protect data
    private String name;
    private int age;
    private String breed;
    private boolean isAdopted;
    private String arrivalDate;
    
    // Constructor to initialize the common state
    public Animal(String name, int age, String breed, String arrivalDate) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isAdopted = false; // New animals start as not adopted
        this.arrivalDate = arrivalDate;
    }
    
    // Getter methods for controlled access (Encapsulation)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public boolean isAdopted() {
        return isAdopted;
    }
    
    public String getArrivalDate() {
        return arrivalDate;
    }
    
    // Setter methods with validation (Encapsulation)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty.");
        }
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative.");
        }
    }
    
    // Method to mark animal as adopted
    public void adopt() {
        if (!isAdopted) {
            this.isAdopted = true;
            System.out.println("🎉 " + name + " has been adopted! Congratulations!");
        } else {
            System.out.println(name + " has already been adopted.");
        }
    }
    
    // Method to return animal to shelter (unadopt)
    public void returnToShelter() {
        if (isAdopted) {
            this.isAdopted = false;
            System.out.println("😢 " + name + " has been returned to the shelter.");
        } else {
            System.out.println(name + " is already in the shelter.");
        }
    }
    
    // Concrete method shared by all animals
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Breed: " + breed);
        System.out.println("Arrival Date: " + arrivalDate);
        System.out.println("Status: " + (isAdopted ? "Adopted ✅" : "Available for adoption ❤️"));
    }
    
    // Abstract method: A contract forcing subclasses to provide their own implementation
    // This enables Polymorphism - each animal type will sound different
    public abstract String makeSound();
    
    // Abstract method for animal-specific care instructions
    public abstract String getCareInstructions();
    
    // Abstract method for exercise requirements
    public abstract String getExerciseNeeds();
    
    // Abstract method for dietary requirements
    public abstract String getDietaryNeeds();
    
    // Concrete method that uses abstract methods (Template Method pattern)
    public void displayFullProfile() {
        System.out.println("🐾 === Animal Profile === 🐾");
        displayBasicInfo();
        System.out.println("Sound: " + makeSound());
        System.out.println("Care Instructions: " + getCareInstructions());
        System.out.println("Exercise Needs: " + getExerciseNeeds());
        System.out.println("Dietary Needs: " + getDietaryNeeds());
        System.out.println("========================");
    }
    
    // Method to simulate daily care routine
    public void performDailyCare() {
        System.out.println("🏥 Daily care for " + name + ":");
        System.out.println("  - Feeding: " + getDietaryNeeds());
        System.out.println("  - Exercise: " + getExerciseNeeds());
        System.out.println("  - Special care: " + getCareInstructions());
        System.out.println("  - Health check: " + name + " says " + makeSound());
        System.out.println("  ✅ Daily care completed for " + name);
    }
    
    // Method to calculate adoption fee based on age and other factors
    public double calculateAdoptionFee() {
        double baseFee = 50.0;
        
        // Younger animals have higher adoption fees
        if (age < 1) {
            baseFee += 100.0; // Puppies/kittens
        } else if (age < 3) {
            baseFee += 50.0;  // Young adults
        } else if (age > 8) {
            baseFee -= 25.0;  // Senior discount
        }
        
        return Math.max(baseFee, 25.0); // Minimum fee of $25
    }
    
    // Method to check if animal is suitable for a family with children
    public boolean isSuitableForChildren() {
        // Default implementation - subclasses can override
        return age >= 2 && age <= 10; // Generally, not too young or too old
    }
    
    // Method to get a brief description for adoption listings
    public String getAdoptionListing() {
        return String.format("%s - %d year old %s. %s Adoption fee: $%.2f. %s", 
                           name, 
                           age, 
                           breed,
                           isAdopted ? "ADOPTED" : "AVAILABLE", 
                           calculateAdoptionFee(),
                           isAdopted ? "" : "Contact shelter for more info!");
    }
}