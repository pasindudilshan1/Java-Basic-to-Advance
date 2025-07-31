/**
 * Circle.java
 * Concrete class that extends the abstract Shape class
 * Demonstrates how abstract methods must be implemented in subclasses
 * Part of the Java Basics and OOP Tutorial
 */
public class Circle extends Shape {
    private double radius;
    
    // Constructor
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Call the abstract class constructor
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1.0; // Default radius
            System.out.println("Invalid radius provided. Setting to default: 1.0");
        }
        System.out.println("Circle created with radius: " + this.radius);
    }
    
    // Constructor with default color and fill
    public Circle(double radius) {
        this(radius, "Red", true);
    }
    
    // Default constructor
    public Circle() {
        this(1.0);
    }
    
    // Implementation of the abstract calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Implementation of the abstract calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // Implementation of the abstract getShapeInfo method
    @Override
    public String getShapeInfo() {
        return "Circle with radius: " + radius + " units";
    }
    
    // Circle-specific methods
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        if (radius > 0) {
            System.out.println("Changing radius from " + this.radius + " to " + radius);
            this.radius = radius;
        } else {
            System.out.println("Invalid radius. Radius must be positive.");
        }
    }
    
    public double getDiameter() {
        return 2 * radius;
    }
    
    // Method to check if a point is inside the circle
    public boolean containsPoint(double x, double y, double centerX, double centerY) {
        double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
        return distance <= radius;
    }
    
    // Override display to include circle-specific information
    @Override
    public void display() {
        System.out.println("This is a " + color + " circle with radius " + radius + 
                          " that is " + (filled ? "filled" : "not filled"));
    }
    
    // Method to scale the circle
    public void scale(double factor) {
        if (factor > 0) {
            double oldRadius = this.radius;
            this.radius *= factor;
            System.out.printf("Circle scaled by factor %.2f: radius changed from %.2f to %.2f%n", 
                            factor, oldRadius, this.radius);
        } else {
            System.out.println("Scale factor must be positive!");
        }
    }
    
    // Method to compare circles
    public boolean isLargerThan(Circle other) {
        return this.radius > other.radius;
    }
    
    // Method to check if two circles are equal
    public boolean equals(Circle other) {
        return Math.abs(this.radius - other.radius) < 0.001 && 
               this.color.equals(other.color) && 
               this.filled == other.filled;
    }
    
    // Method to create a copy of the circle
    public Circle copy() {
        return new Circle(this.radius, this.color, this.filled);
    }
    
    // toString method for easy printing
    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f, color=%s, filled=%s, area=%.2f]", 
                           radius, color, filled, calculateArea());
    }
}