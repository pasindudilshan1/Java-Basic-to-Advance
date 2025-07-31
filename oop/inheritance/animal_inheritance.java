/**
 * Animal.java
 * Base class demonstrating inheritance in Java
 * This is the superclass (parent class) for the inheritance hierarchy
 * Part of the Java Basics and OOP Tutorial
 */
public class Animal {
    // Protected fields - accessible by subclasses but not by external classes
    protected String name;
    protected int age;
    protected String species;
    
    // Constructor for the Animal class
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        System.out.println("Animal constructor called for: " + name);
    }
    
    // Default constructor
    public Animal() {
        this("Unknown", 0, "Unknown");
    }
    
    // Public methods that will be inherited by subclasses
    public void eat() {
        System.out.println(this.name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(this.name + " is sleeping peacefully.");
    }
    
    public void move() {
        System.out.println(this.name + " is moving around.");
    }
    
    // Method that can be overridden by subclasses
    public void makeSound() {
        System.out.println(this.name + " makes a generic animal sound.");
    }
    
    // Method to display basic animal information
    public void displayInfo() {
        System.out.println("=== Animal Information ===");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age + " years");
        System.out.println("Species: " + this.species);
        System.out.println("========================");
    }
    
    // Getter methods
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getSpecies() {
        return this.species;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }
    
    // Method to simulate aging
    public void haveBirthday() {
        this.age++;
        System.out.println("Happy birthday " + this.name + "! Now " + this.age + " years old.");
    }
    
    // Method that demonstrates polymorphism preparation
    public String getAnimalType() {
        return "Generic Animal";
    }
    
    // Method to show animal's daily routine
    public void dailyRoutine() {
        System.out.println(this.name + "'s daily routine:");
        System.out.println("  Morning: ");
        eat();
        System.out.println("  Afternoon: ");
        move();
        System.out.println("  Evening: ");
        makeSound();
        System.out.println("  Night: ");
        sleep();
    }
}