/**
 * Rectangle.java
 * Concrete class that extends the abstract Shape class
 * Demonstrates how abstract methods must be implemented in subclasses
 * Part of the Java Basics and OOP Tutorial
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled); // Call the abstract class constructor
        
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            this.length = 1.0; // Default dimensions
            this.width = 1.0;
            System.out.println("Invalid dimensions provided. Setting to default: 1.0 x 1.0");
        }
        System.out.println("Rectangle created with dimensions: " + this.length + " x " + this.width);
    }
    
    // Constructor with default color and fill
    public Rectangle(double length, double width) {
        this(length, width, "Blue", false);
    }
    
    // Constructor for a square (equal length and width)
    public Rectangle(double side) {
        this(side, side, "Blue", false);
        System.out.println("Square created with side: " + side);
    }
    
    // Default constructor
    public Rectangle() {
        this(1.0, 1.0);
    }
    
    // Implementation of the abstract calculateArea method
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    // Implementation of the abstract calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    // Implementation of the abstract getShapeInfo method
    @Override
    public String getShapeInfo() {
        if (isSquare()) {
            return "Square with side: " + length + " units";
        } else {
            return "Rectangle with dimensions: " + length + " x " + width + " units";
        }
    }
    
    // Rectangle-specific methods
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setLength(double length) {
        if (length > 0) {
            System.out.println("Changing length from " + this.length + " to " + length);
            this.length = length;
        } else {
            System.out.println("Invalid length. Length must be positive.");
        }
    }
    
    public void setWidth(double width) {
        if (width > 0) {
            System.out.println("Changing width from " + this.width + " to " + width);
            this.width = width;
        } else {
            System.out.println("Invalid width. Width must be positive.");
        }
    }
    
    public void setDimensions(double length, double width) {
        if (length > 0 && width > 0) {
            System.out.printf("Changing dimensions from %.2f x %.2f to %.2f x %.2f%n", 
                            this.length, this.width, length, width);
            this.length = length;
            this.width = width;
        } else {
            System.out.println("Invalid dimensions. Both length and width must be positive.");
        }
    }
    
    // Check if this rectangle is actually a square
    public boolean isSquare() {
        return Math.abs(length - width) < 0.001; // Using small epsilon for floating-point comparison
    }
    
    // Get the diagonal length
    public double getDiagonal() {
        return Math.sqrt(length * length + width * width);
    }
    
    // Check if a point is inside the rectangle (assuming rectangle starts at origin)
    public boolean containsPoint(double x, double y) {
        return x >= 0 && x <= length && y >= 0 && y <= width;
    }
    
    // Override display to include rectangle-specific information
    @Override
    public void display() {
        String shapeType = isSquare() ? "square" : "rectangle";
        System.out.println("This is a " + color + " " + shapeType + " with dimensions " + 
                          length + " x " + width + " that is " + (filled ? "filled" : "not filled"));
    }
    
    // Method to scale the rectangle
    public void scale(double factor) {
        if (factor > 0) {
            double oldLength = this.length;
            double oldWidth = this.width;
            this.length *= factor;
            this.width *= factor;
            System.out.printf("Rectangle scaled by factor %.2f: dimensions changed from %.2f x %.2f to %.2f x %.2f%n", 
                            factor, oldLength, oldWidth, this.length, this.width);
        } else {
            System.out.println("Scale factor must be positive!");
        }
    }
    
    // Method to scale only length
    public void scaleLength(double factor) {
        if (factor > 0) {
            double oldLength = this.length;
            this.length *= factor;
            System.out.printf("Length scaled by factor %.2f: changed from %.2f to %.2f%n", 
                            factor, oldLength, this.length);
        } else {
            System.out.println("Scale factor must be positive!");
        }
    }
    
    // Method to scale only width
    public void scaleWidth(double factor) {
        if (factor > 0) {
            double oldWidth = this.width;
            this.width *= factor;
            System.out.printf("Width scaled by factor %.2f: changed from %.2f to %.2f%n", 
                            factor, oldWidth, this.width);
        } else {
            System.out.println("Scale factor must be positive!");
        }
    }
    
    // Method to compare rectangles by area
    public boolean isLargerThan(Rectangle other) {
        return this.calculateArea() > other.calculateArea();
    }
    
    // Method to check if two rectangles are equal
    public boolean equals(Rectangle other) {
        return Math.abs(this.length - other.length) < 0.001 && 
               Math.abs(this.width - other.width) < 0.001 &&
               this.color.equals(other.color) && 
               this.filled == other.filled;
    }
    
    // Method to create a copy of the rectangle
    public Rectangle copy() {
        return new Rectangle(this.length, this.width, this.color, this.filled);
    }
    
    // Method to rotate the rectangle (swap length and width)
    public void rotate() {
        double temp = this.length;
        this.length = this.width;
        this.width = temp;
        System.out.printf("Rectangle rotated. New dimensions: %.2f x %.2f%n", length, width);
    }
    
    // toString method for easy printing
    @Override
    public String toString() {
        return String.format("Rectangle[length=%.2f, width=%.2f, color=%s, filled=%s, area=%.2f]", 
                           length, width, color, filled, calculateArea());
    }
}