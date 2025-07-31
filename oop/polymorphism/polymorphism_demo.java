/**
 * PolymorphismDemo.java
 * Demonstrates polymorphism in Java - one interface, many forms
 * Shows how different objects can be treated uniformly through a common interface
 * Part of the Java Basics and OOP Tutorial
 */
public class PolymorphismDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Java Polymorphism Demo ===\n");
        
        // Demonstrate basic polymorphism
        demonstrateBasicPolymorphism();
        
        // Demonstrate polymorphism with arrays
        demonstratePolymorphismWithArrays();
        
        // Demonstrate polymorphism with method parameters
        demonstratePolymorphismWithMethods();
        
        // Demonstrate runtime type checking
        demonstrateRuntimeTypeChecking();
        
        System.out.println("=== End of Polymorphism Demo ===");
    }
    
    /**
     * Demonstrates basic polymorphism concepts
     */
    public static void demonstrateBasicPolymorphism() {
        System.out.println("--- Basic Polymorphism ---");
        
        // Here, the reference type is Animal, but the actual object type is Dog
        Animal animal1 = new Dog("Buddy", 3, "Golden Retriever");
        
        // Here, the reference type is Animal, but the actual object type is Cat
        Animal animal2 = new Cat("Whiskers", 5, "Orange");
        
        // The JVM looks at the actual object at runtime to decide which method to call
        System.out.println("\nCalling makeSound() on Animal references:");
        animal1.makeSound(); // Calls Dog's overridden makeSound()
        animal2.makeSound(); // Calls Cat's overridden makeSound()
        
        System.out.println("\nCalling move() on Animal references:");
        animal1.move(); // Calls Dog's overridden move()
        animal2.move(); // Calls Cat's overridden move()
        
        System.out.println("\nCalling getAnimalType() on Animal references:");
        System.out.println("Animal 1 type: " + animal1.getAnimalType());
        System.out.println("Animal 2 type: " + animal2.getAnimalType());
        
        // All Animal methods are available
        System.out.println("\nCalling inherited Animal methods:");
        animal1.eat();   // Each will call their overridden version
        animal2.sleep(); // Each will call their overridden version
        
        System.out.println();
    }
    
    /**
     * Demonstrates polymorphism with arrays and collections
     */
    public static void demonstratePolymorphismWithArrays() {
        System.out.println("--- Polymorphism with Arrays ---");
        
        // Create an array of Animal references that holds different types of animals
        Animal[] zooAnimals = {
            new Dog("Rex", 4, "German Shepherd", true),
            new Cat("Mittens", 2, "White", true),
            new Dog("Luna", 6, "Labrador", false),
            new Cat("Shadow", 8, "Black", false),
            new Animal("Generic", 1, "Unknown") // A generic animal
        };
        
        System.out.println("Zoo roll call - each animal makes their sound:");
        // The same loop handles all different types of animals
        for (int i = 0; i < zooAnimals.length; i++) {
            Animal currentAnimal = zooAnimals[i];
            System.out.print((i + 1) + ". ");
            currentAnimal.makeSound(); // Polymorphic method call
        }
        
        System.out.println("\nZoo information display:");
        for (Animal animal : zooAnimals) {
            System.out.println("- " + animal.getName() + " is a " + animal.getAnimalType());
        }
        
        System.out.println("\nFeeding time at the zoo:");
        for (Animal animal : zooAnimals) {
            System.out.print("Feeding " + animal.getName() + ": ");
            animal.eat(); // Each animal eats in their own way
        }
        
        System.out.println();
    }
    
    /**
     * Demonstrates polymorphism with method parameters
     */
    public static void demonstratePolymorphismWithMethods() {
        System.out.println("--- Polymorphism with Method Parameters ---");
        
        // Create different types of animals
        Dog serviceDog = new Dog("Guide", 5, "Labrador", true);
        Cat houseCat = new Cat("Fluffy", 3, "Gray", true);
        Animal wildAnimal = new Animal("Wild One", 7, "Unknown");
        
        // The same method can work with any Animal type
        System.out.println("Veterinary checkups:");
        performVetCheckup(serviceDog);  // Accepts Dog as Animal
        performVetCheckup(houseCat);    // Accepts Cat as Animal
        performVetCheckup(wildAnimal);  // Accepts Animal
        
        System.out.println("\nAnimal training session:");
        conductTrainingSession(serviceDog); // Dog-specific behavior will be called
        conductTrainingSession(houseCat);   // Cat-specific behavior will be called
        conductTrainingSession(wildAnimal); // Generic behavior will be called
        
        System.out.println();
    }
    
    /**
     * A method that accepts any Animal type (polymorphism)
     */
    public static void performVetCheckup(Animal animal) {
        System.out.println("🏥 Veterinary checkup for " + animal.getName() + ":");
        System.out.println("   Type: " + animal.getAnimalType());
        System.out.println("   Age: " + animal.getAge() + " years");
        animal.makeSound(); // Polymorphic call - each animal sounds different
        System.out.println("   Checkup complete!");
        System.out.println();
    }
    
    /**
     * Another method demonstrating polymorphism
     */
    public static void conductTrainingSession(Animal animal) {
        System.out.println("🎓 Training session with " + animal.getName() + ":");
        
        // All animals can do basic activities
        animal.makeSound();
        animal.move();
        
        // The specific implementation depends on the actual object type
        System.out.println("   Training assessment: " + animal.getAnimalType() + " responded appropriately");
        System.out.println();
    }
    
    /**
     * Demonstrates runtime type checking and casting
     */
    public static void demonstrateRuntimeTypeChecking() {
        System.out.println("--- Runtime Type Checking and Casting ---");
        
        // Array with mixed animal types
        Animal[] pets = {
            new Dog("Buddy", 4, "Beagle", true),
            new Cat("Whiskers", 6, "Tabby", true),
            new Dog("Max", 2, "Poodle", false)
        };
        
        System.out.println("Specialized care based on actual animal type:");
        
        for (Animal pet : pets) {
            System.out.println("\nCaring for " + pet.getName() + " (" + pet.getAnimalType() + "):");
            
            // Basic care that all animals receive
            pet.eat();
            
            // Specialized care based on actual type
            if (pet instanceof Dog) {
                // Safe to cast to Dog
                Dog dog = (Dog) pet;
                System.out.println("  Dog-specific care:");
                dog.fetch();
                if (dog.isTrained()) {
                    dog.sit();
                    dog.stay();
                } else {
                    System.out.println("  This dog needs training!");
                    dog.train();
                }
            } else if (pet instanceof Cat) {
                // Safe to cast to Cat
                Cat cat = (Cat) pet;
                System.out.println("  Cat-specific care:");
                cat.groom();
                cat.purr();
                if (cat.isIndoor()) {
                    cat.scratch(); // Use scratching post
                } else {
                    System.out.println("  Outdoor cat - checking for ticks and fleas");
                }
            }
        }
        
        // Demonstrate the power of polymorphism in a real-world scenario
        System.out.println("\n--- Pet Shelter Scenario ---");
        System.out.println("A volunteer visits all animals with the same routine:");
        
        for (Animal pet : pets) {
            visitAnimal(pet); // Same method call, different behavior for each animal
        }
        
        System.out.println();
    }
    
    /**
     * Method that demonstrates how polymorphism enables uniform treatment
     * while still allowing for specialized behavior
     */
    public static void visitAnimal(Animal animal) {
        System.out.println("\n👋 Visiting " + animal.getName() + ":");
        
        // Standard interaction - works the same for all animals
        System.out.println("  Greeting: ");
        animal.makeSound();
        
        // Feeding - each animal eats differently
        System.out.println("  Feeding time: ");
        animal.eat();
        
        // Exercise - each animal moves differently
        System.out.println("  Exercise time: ");
        animal.move();
        
        // The visitor doesn't need to know the specific type
        // but each animal responds in its own unique way!
        System.out.println("  Visit complete for this " + animal.getAnimalType());
    }
}