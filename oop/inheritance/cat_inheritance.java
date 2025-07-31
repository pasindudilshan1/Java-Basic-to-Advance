/**
 * Cat.java
 * Subclass demonstrating inheritance in Java
 * This class extends Animal and adds cat-specific behavior
 * Part of the Java Basics and OOP Tutorial
 */
public class Cat extends Animal {
    // Additional fields specific to Cat
    private String furColor;
    private boolean isIndoor;
    private int livesRemaining;
    
    // Constructor that calls the superclass constructor
    public Cat(String name, int age, String furColor) {
        super(name, age, "Feline"); // Call Animal constructor
        this.furColor = furColor;
        this.isIndoor = true; // Default to indoor cat
        this.livesRemaining = 9; // Cats have 9 lives!
        System.out.println("Cat constructor called for: " + name + " (" + furColor + " fur)");
    }
    
    // Constructor with indoor/outdoor specification
    public Cat(String name, int age, String furColor, boolean isIndoor) {
        super(name, age, "Feline");
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.livesRemaining = 9;
        System.out.println("Cat constructor called for: " + name + " (" + furColor + " fur)");
    }
    
    // Override the makeSound method from Animal
    @Override
    public void makeSound() {
        System.out.println(this.name + " meows: Meow... Meow...");
    }
    
    // Override the move method to be more specific
    @Override
    public void move() {
        System.out.println(this.name + " gracefully prowls around with silent paws.");
    }
    
    // Override the eat method with cat-specific behavior
    @Override
    public void eat() {
        System.out.println(this.name + " is delicately eating from its food bowl.");
    }
    
    // Override the sleep method - cats sleep a lot!
    @Override
    public void sleep() {
        System.out.println(this.name + " is taking a long, peaceful nap in a sunny spot.");
    }
    
    // Override getAnimalType for polymorphism
    @Override
    public String getAnimalType() {
        return "Cat (" + this.furColor + " fur)";
    }
    
    // Cat-specific methods (not inherited from Animal)
    public void meow() {
        System.out.println("Meow! Meow!");
    }
    
    public void purr() {
        System.out.println(this.name + " is purring contentedly: Purr... Purr...");
    }
    
    public void scratch() {
        if (isIndoor) {
            System.out.println(this.name + " is scratching the scratching post.");
        } else {
            System.out.println(this.name + " is scratching a tree outside.");
        }
    }
    
    public void climb() {
        System.out.println(this.name + " climbs up high with amazing agility!");
    }
    
    public void hunt() {
        if (isIndoor) {
            System.out.println(this.name + " stalks a toy mouse around the house.");
        } else {
            System.out.println(this.name + " hunts for small creatures in the garden.");
        }
    }
    
    public void groom() {
        System.out.println(this.name + " is meticulously grooming its " + this.furColor + " fur.");
    }
    
    public void knockThingsOver() {
        System.out.println(this.name + " knocks something off the table... because it's there!");
    }
    
    public void stareIntently() {
        System.out.println(this.name + " stares intensely at something only cats can see...");
    }
    
    // Method to lose a life (and hopefully gain it back!)
    public void loseLife() {
        if (livesRemaining > 1) {
            livesRemaining--;
            System.out.println(this.name + " lost a life but still has " + livesRemaining + " lives remaining!");
        } else {
            System.out.println(this.name + " needs to be extra careful - only 1 life left!");
        }
    }
    
    // Override displayInfo to include cat-specific information
    @Override
    public void displayInfo() {
        System.out.println("=== Cat Information ===");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age + " years");
        System.out.println("Species: " + this.species);
        System.out.println("Fur Color: " + this.furColor);
        System.out.println("Lives Remaining: " + this.livesRemaining);
        System.out.println("Environment: " + (this.isIndoor ? "Indoor" : "Outdoor"));
        System.out.println("=====================");
    }
    
    // Override dailyRoutine with cat-specific activities
    @Override
    public void dailyRoutine() {
        System.out.println(this.name + "'s daily routine:");
        System.out.println("  Early Morning (5 AM): ");
        makeSound(); // Wake up the humans!
        System.out.println("  Morning: ");
        eat();
        groom();
        System.out.println("  Late Morning: ");
        sleep(); // First nap of the day
        System.out.println("  Afternoon: ");
        hunt();
        knockThingsOver();
        System.out.println("  Evening: ");
        scratch();
        purr();
        System.out.println("  Night: ");
        stareIntently();
        sleep(); // Long night sleep
    }
    
    // Getter methods for cat-specific fields
    public String getFurColor() {
        return this.furColor;
    }
    
    public boolean isIndoor() {
        return this.isIndoor;
    }
    
    public int getLivesRemaining() {
        return this.livesRemaining;
    }
    
    // Setter for indoor/outdoor status
    public void setIndoor(boolean isIndoor) {
        this.isIndoor = isIndoor;
        if (isIndoor) {
            System.out.println(this.name + " is now an indoor cat.");
        } else {
            System.out.println(this.name + " is now allowed outdoors.");
        }
    }
    
    // Method that uses super to call parent method
    public void makeAllSounds() {
        System.out.println("All sounds that " + this.name + " can make:");
        super.makeSound(); // Call the parent class method
        this.makeSound();  // Call the overridden method
        purr();           // Cat-specific sound
    }
    
    // Method demonstrating method overloading
    public void play() {
        System.out.println(this.name + " is playing independently!");
    }
    
    public void play(String toy) {
        System.out.println(this.name + " is batting at a " + toy + "!");
    }
    
    public void play(String toy, boolean isInterested) {
        if (isInterested) {
            System.out.println(this.name + " is very interested in the " + toy + " and plays enthusiastically!");
        } else {
            System.out.println(this.name + " looks at the " + toy + " with disdain and walks away.");
        }
    }
    
    // Special cat behavior - being finicky
    public void beFinicky() {
        System.out.println(this.name + " sniffs the food, looks unimpressed, and walks away.");
        System.out.println("\"This is not acceptable,\" " + this.name + " seems to say.");
    }
}