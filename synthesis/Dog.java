/**
 * Dog.java - Synthesis Project
 * Concrete class that extends Animal for the Digital Pet Shelter
 * Demonstrates Inheritance and Polymorphism
 * Part of the Java Basics and OOP Tutorial - Synthesis Project
 */
public class Dog extends Animal {
    // Dog-specific attributes (Encapsulation)
    private boolean isTrained;
    private String temperament;
    private boolean goodWithKids;
    private boolean goodWithOtherDogs;
    
    // Constructor - uses Inheritance to call parent constructor
    public Dog(String name, int age, String breed, String arrivalDate) {
        super(name, age, breed, arrivalDate); // Call Animal constructor
        this.isTrained = false; // Default values
        this.temperament = "Friendly";
        this.goodWithKids = true;
        this.goodWithOtherDogs = true;
    }
    
    // Constructor with additional dog-specific parameters
    public Dog(String name, int age, String breed, String arrivalDate, 
               boolean isTrained, String temperament, boolean goodWithKids, boolean goodWithOtherDogs) {
        super(name, age, breed, arrivalDate);
        this.isTrained = isTrained;
        this.temperament = temperament;
        this.goodWithKids = goodWithKids;
        this.goodWithOtherDogs = goodWithOtherDogs;
    }
    
    // Implementation of abstract method from Animal (Polymorphism)
    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }
    
    // Implementation of abstract method from Animal
    @Override
    public String getCareInstructions() {
        StringBuilder instructions = new StringBuilder();
        instructions.append("Daily brushing, regular vet checkups");
        
        if (!isTrained) {
            instructions.append(", needs obedience training");
        }
        
        if (!goodWithKids) {
            instructions.append(", requires adult supervision around children");
        }
        
        if (!goodWithOtherDogs) {
            instructions.append(", should be the only dog in household");
        }
        
        return instructions.toString();
    }
    
    // Implementation of abstract method from Animal
    @Override
    public String getExerciseNeeds() {
        String baseExercise = "Daily walks and playtime";
        
        // Adjust based on age
        if (getAge() < 2) {
            return baseExercise + " (puppy - shorter, more frequent sessions)";
        } else if (getAge() > 8) {
            return baseExercise + " (senior - gentle exercise)";
        } else {
            return baseExercise + " (adult - 1-2 hours daily)";
        }
    }
    
    // Implementation of abstract method from Animal
    @Override
    public String getDietaryNeeds() {
        StringBuilder diet = new StringBuilder("High-quality dog food");
        
        if (getAge() < 1) {
            diet.append(" (puppy formula)");
        } else if (getAge() > 7) {
            diet.append(" (senior formula)");
        } else {
            diet.append(" (adult formula)");
        }
        
        diet.append(", fresh water always available");
        return diet.toString();
    }
    
    // Dog-specific methods
    public boolean isTrained() {
        return isTrained;
    }
    
    public void setTrained(boolean trained) {
        this.isTrained = trained;
        if (trained) {
            System.out.println("🎓 " + getName() + " is now marked as trained!");
        } else {
            System.out.println("📚 " + getName() + " needs training.");
        }
    }
    
    public String getTemperament() {
        return temperament;
    }
    
    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }
    
    public boolean isGoodWithKids() {
        return goodWithKids;
    }
    
    public void setGoodWithKids(boolean goodWithKids) {
        this.goodWithKids = goodWithKids;
    }
    
    public boolean isGoodWithOtherDogs() {
        return goodWithOtherDogs;
    }
    
    public void setGoodWithOtherDogs(boolean goodWithOtherDogs) {
        this.goodWithOtherDogs = goodWithOtherDogs;
    }
    
    // Dog-specific behaviors
    public void bark() {
        System.out.println(getName() + " barks: " + makeSound());
    }
    
    public void wagTail() {
        System.out.println(getName() + " is wagging its tail happily! 🐕");
    }
    
    public void fetch() {
        System.out.println(getName() + " is playing fetch! 🎾");
    }
    
    public void sit() {
        if (isTrained) {
            System.out.println(getName() + " sits obediently! Good dog! 🐕");
        } else {
            System.out.println(getName() + " doesn't know the sit command yet. Training needed! 📚");
        }
    }
    
    public void shake() {
        if (isTrained) {
            System.out.println(getName() + " gives you a paw shake! 🐾");
        } else {
            System.out.println(getName() + " tilts head in confusion. Training needed! 🤔");
        }
    }
    
    // Override adoption fee calculation with dog-specific logic
    @Override
    public double calculateAdoptionFee() {
        double fee = super.calculateAdoptionFee(); // Get base fee
        
        // Trained dogs have higher adoption fees
        if (isTrained) {
            fee += 25.0;
        }
        
        // Dogs good with kids are more desirable
        if (goodWithKids) {
            fee += 15.0;
        }
        
        return fee;
    }
    
    // Override suitability for children
    @Override
    public boolean isSuitableForChildren() {
        return goodWithKids && getAge() >= 1 && getAge() <= 10;
    }
    
    // Enhanced display method with dog-specific information
    @Override
    public void displayFullProfile() {
        System.out.println("🐕 === Dog Profile === 🐕");
        displayBasicInfo();
        System.out.println("Temperament: " + temperament);
        System.out.println("Training Status: " + (isTrained ? "Trained ✅" : "Needs Training 📚"));
        System.out.println("Good with Kids: " + (goodWithKids ? "Yes ✅" : "No ❌"));
        System.out.println("Good with Other Dogs: " + (goodWithOtherDogs ? "Yes ✅" : "No ❌"));
        System.out.println("Sound: " + makeSound());
        System.out.println("Care Instructions: " + getCareInstructions());
        System.out.println("Exercise Needs: " + getExerciseNeeds());
        System.out.println("Dietary Needs: " + getDietaryNeeds());
        System.out.printf("Adoption Fee: $%.2f%n", calculateAdoptionFee());
        System.out.println("=======================");
    }
    
    // Dog-specific daily routine
    @Override
    public void performDailyCare() {
        System.out.println("🐕 Daily care routine for " + getName() + ":");
        System.out.println("  - Morning walk and bathroom break");
        System.out.println("  - Feeding: " + getDietaryNeeds());
        System.out.println("  - Playtime and exercise: " + getExerciseNeeds());
        
        if (isTrained) {
            System.out.println("  - Training reinforcement: practicing commands");
            sit();
            shake();
        } else {
            System.out.println("  - Basic training session");
        }
        
        System.out.println("  - Grooming and health check");
        System.out.println("  - Evening walk");
        bark(); // Dogs often bark during care
        wagTail(); // Happy dog!
        System.out.println("  ✅ Daily care completed for " + getName());
    }
    
    // Method to simulate a training session
    public void conductTrainingSession() {
        System.out.println("🎓 Training session with " + getName() + ":");
        
        if (!isTrained) {
            System.out.println("  Teaching basic commands...");
            System.out.println("  Practicing sit, stay, and shake...");
            System.out.println("  Using positive reinforcement with treats!");
            
            // Simulate successful training
            if (Math.random() > 0.3) { // 70% chance of learning
                setTrained(true);
                System.out.println("  🎉 Training successful! " + getName() + " learned the commands!");
            } else {
                System.out.println("  📚 " + getName() + " needs more practice. Keep training!");
            }
        } else {
            System.out.println("  Reinforcing existing commands...");
            sit();
            shake();
            System.out.println("  🌟 " + getName() + " is a well-trained dog!");
        }
    }
    
    // Method to get compatibility score with potential adopters
    public int getCompatibilityScore(boolean hasKids, boolean hasOtherDogs, boolean wantsTrainedDog) {
        int score = 100;
        
        if (hasKids && !goodWithKids) score -= 50;
        if (hasOtherDogs && !goodWithOtherDogs) score -= 30;
        if (wantsTrainedDog && !isTrained) score -= 20;
        
        return Math.max(score, 0);
    }
}