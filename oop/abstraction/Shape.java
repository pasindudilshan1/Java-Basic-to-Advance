/**
 * Shape.java
 * Abstract class demonstrating abstraction in Java
 * This class cannot be instantiated directly but provides a blueprint for specific shapes
 * Part of the Java Basics and OOP Tutorial
 */
public abstract class Shape {
    // Protected fields that subclasses can access
    protected String color;
    protected boolean filled;
    
    // Constructor for the abstract class
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("Shape constructor called - Color: " + color + ", Filled: " + filled);
    }
    
    // Default constructor
    public Shape() {
        this("Unknown", false);
    }
    
    // Concrete method - shared by all subclasses
    public void display() {
        System.out.println("This is a " + color + " shape that is " + 
                          (filled ? "filled" : "not filled"));
    }

    // Abstract method - must be implemented by subclasses
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
    public abstract String getShapeInfo();

}