/**
 * Dog.java
 * Subclass demonstrating inheritance in Java
 * This class extends Animal and adds dog-specific behavior
 * Part of the Java Basics and OOP Tutorial
 */
public class Dog extends Animal {
    // Additional fields specific to Dog
    private String breed;
    private boolean isTrained;
    
    // Constructor that calls the superclass constructor
    public Dog(String name, int age, String breed) {
        super(name, age, "Canine"); // Call Animal constructor
        this.breed = breed;
        this.isTrained = false;
        System.out.println("Dog constructor called for: " + name + " (" + breed + ")");
    }
    
    // Constructor with training status
    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, "Canine");
        this.breed = breed;
        this.isTrained = isTrained;
        System.out.println("Dog constructor called for: " + name + " (" + breed + ")");
    }
    
    // Override the makeSound method from Animal
    @Override
    public void makeSound() {
        System.out.println(this.name + " barks: Woof! Woof!");
    }
    
    // Override the move method to be more specific
    @Override
    public void move() {
        System.out.println(this.name + " runs around happily, wagging its tail!");
    }
    
    // Override the eat method with dog-specific behavior
    @Override
    public void eat() {
        System.out.println(this.name + " is happily eating dog food from its bowl.");
    }
    
    // Override getAnimalType for polymorphism
    @Override
    public String getAnimalType() {
        return "Dog (" + this.breed + ")";
    }
    
    // Dog-specific methods (not inherited from Animal)
    public void bark() {
        System.out.println("Woof! Woof!");
    }
    
    public void wagTail() {
        System.out.println(this.name + " is wagging its tail enthusiastically!");
    }
    
    public void fetch() {
        System.out.println(this.name + " is fetching the ball!");
    }
    
    public void sit() {
        if (isTrained) {
            System.out.println(this.name + " sits obediently!");
        } else {
            System.out.println(this.name + " doesn't know how to sit yet. Training needed!");
        }
    }
    
    public void stay() {
        if (isTrained) {
            System.out.println(this.name + " stays in place like a good dog!");
        } else {
            System.out.println(this.name + " gets distracted and wanders off!");
        }
    }
    
    public void rollOver() {
        if (isTrained) {
            System.out.println(this.name + " rolls over! What a smart dog!");
        } else {
            System.out.println(this.name + " looks confused. Maybe some training treats would help!");
        }
    }
    
    // Method to train the dog
    public void train() {
        if (!isTrained) {
            System.out.println("Training " + this.name + "...");
            this.isTrained = true;
            System.out.println(this.name + " is now trained! Good dog!");
        } else {
            System.out.println(this.name + " is already well-trained!");
        }
    }
    
    // Override displayInfo to include dog-specific information
    @Override
    public void displayInfo() {
        System.out.println("=== Dog Information ===");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age + " years");
        System.out.println("Species: " + this.species);
        System.out.println("Breed: " + this.breed);
        System.out.println("Trained: " + (this.isTrained ? "Yes" : "No"));
        System.out.println("=====================");
    }
    
    // Override dailyRoutine with dog-specific activities
    @Override
    public void dailyRoutine() {
        System.out.println(this.name + "'s daily routine:");
        System.out.println("  Early Morning: ");
        wagTail();
        System.out.println("  Morning: ");
        eat();
        System.out.println("  Mid-Morning: ");
        fetch();
        System.out.println("  Afternoon: ");
        move();
        System.out.println("  Evening: ");
        makeSound();
        if (isTrained) {
            sit();
        }
        System.out.println("  Night: ");
        sleep();
    }
    
    // Getter methods for dog-specific fields
    public String getBreed() {
        return this.breed;
    }
    
    public boolean isTrained() {
        return this.isTrained;
    }
    
    // Method that uses super to call parent method
    public void makeAllSounds() {
        System.out.println("All sounds that " + this.name + " can make:");
        super.makeSound(); // Call the parent class method
        this.makeSound();  // Call the overridden method
    }
    
    // Method demonstrating method overloading
    public void play() {
        System.out.println(this.name + " is playing!");
    }
    
    public void play(String toy) {
        System.out.println(this.name + " is playing with a " + toy + "!");
    }
    
    public void play(String toy, int minutes) {
        System.out.println(this.name + " played with a " + toy + " for " + minutes + " minutes!");
    }
}