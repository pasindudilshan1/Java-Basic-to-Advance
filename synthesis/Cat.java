/*
 * synthesis_cat.java - Synthesis Project
 * Concrete class that extends Animal for the Digital Pet Shelter
 * Demonstrates Inheritance and Polymorphism
 * Part of the Java Basics and OOP Tutorial - Synthesis Project
 */
public class Cat extends Animal {
    // Cat-specific attributes (Encapsulation)
    private boolean isIndoor;
    private String temperament;
    private boolean goodWithKids;
    private boolean goodWithOtherCats;

    // Constructor - uses Inheritance to call parent constructor
    public Cat(String name, int age, String breed, String arrivalDate) {
        super(name, age, breed, arrivalDate);
        this.isIndoor = true;
        this.temperament = "Calm";
        this.goodWithKids = true;
        this.goodWithOtherCats = true;
    }

    // Constructor with additional cat-specific parameters
    public Cat(String name, int age, String breed, String arrivalDate,
               boolean isIndoor, String temperament, boolean goodWithKids, boolean goodWithOtherCats) {
        super(name, age, breed, arrivalDate);
        this.isIndoor = isIndoor;
        this.temperament = temperament;
        this.goodWithKids = goodWithKids;
        this.goodWithOtherCats = goodWithOtherCats;
    }

    // Implementation of abstract method from Animal (Polymorphism)
    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String getCareInstructions() {
        StringBuilder instructions = new StringBuilder();
        instructions.append("Regular grooming, clean litter box");
        if (!isIndoor) {
            instructions.append(", monitor outdoor activity");
        }
        if (!goodWithKids) {
            instructions.append(", requires adult supervision around children");
        }
        if (!goodWithOtherCats) {
            instructions.append(", should be the only cat in household");
        }
        return instructions.toString();
    }

    @Override
    public String getExerciseNeeds() {
        String baseExercise = "Interactive play and climbing";
        if (getAge() < 2) {
            return baseExercise + " (kitten - short, frequent sessions)";
        } else if (getAge() > 10) {
            return baseExercise + " (senior - gentle play)";
        } else {
            return baseExercise + " (adult - daily play recommended)";
        }
    }

    @Override
    public String getDietaryNeeds() {
        StringBuilder diet = new StringBuilder("High-quality cat food");
        if (getAge() < 1) {
            diet.append(" (kitten formula)");
        } else if (getAge() > 8) {
            diet.append(" (senior formula)");
        } else {
            diet.append(" (adult formula)");
        }
        diet.append(", fresh water always available");
        return diet.toString();
    }

    // Cat-specific methods
    public boolean isIndoor() {
        return isIndoor;
    }
    public void setIndoor(boolean indoor) {
        this.isIndoor = indoor;
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
    public boolean isGoodWithOtherCats() {
        return goodWithOtherCats;
    }
    public void setGoodWithOtherCats(boolean goodWithOtherCats) {
        this.goodWithOtherCats = goodWithOtherCats;
    }

    // Cat-specific behaviors
    public void purr() {
        System.out.println(getName() + " purrs softly. 63B");
    }
    public void scratch() {
        System.out.println(getName() + " is scratching the post! 408");
    }
    public void nap() {
        System.out.println(getName() + " is taking a cozy nap. 431");
    }
    public void play() {
        System.out.println(getName() + " is playing with a toy! 638");
    }

    // Override adoption fee calculation with cat-specific logic
    @Override
    public double calculateAdoptionFee() {
        double fee = super.calculateAdoptionFee();
        if (isIndoor) fee += 10.0;
        if (goodWithKids) fee += 10.0;
        return fee;
    }

    @Override
    public boolean isSuitableForChildren() {
        return goodWithKids && getAge() >= 1 && getAge() <= 15;
    }

    @Override
    public void displayFullProfile() {
        System.out.println("408 === Cat Profile === 408");
        displayBasicInfo();
        System.out.println("Temperament: " + temperament);
        System.out.println("Indoor Cat: " + (isIndoor ? "Yes 3E0" : "No 30D"));
        System.out.println("Good with Kids: " + (goodWithKids ? "Yes 44D" : "No 44E"));
        System.out.println("Good with Other Cats: " + (goodWithOtherCats ? "Yes 408" : "No 63F"));
        System.out.println("Sound: " + makeSound());
        System.out.println("Care Instructions: " + getCareInstructions());
        System.out.println("Exercise Needs: " + getExerciseNeeds());
        System.out.println("Dietary Needs: " + getDietaryNeeds());
        System.out.printf("Adoption Fee: $%.2f%n", calculateAdoptionFee());
        System.out.println("=======================");
    }

    @Override
    public void performDailyCare() {
        System.out.println("\u001F408 Daily care routine for " + getName() + ":");
        System.out.println("  - Morning feeding: " + getDietaryNeeds());
        System.out.println("  - Litter box cleaning");
        System.out.println("  - Playtime: " + getExerciseNeeds());
        nap();
        purr();
        System.out.println("  - Grooming and health check");
        System.out.println("  - Evening feeding");
        play();
        System.out.println("  ✅ Daily care completed for " + getName());
    }

    // Method to get compatibility score with potential adopters
    public int getCompatibilityScore(boolean hasKids, boolean hasOtherCats, boolean wantsIndoorCat) {
        int score = 100;
        if (hasKids && !goodWithKids) score -= 40;
        if (hasOtherCats && !goodWithOtherCats) score -= 30;
        if (wantsIndoorCat && !isIndoor) score -= 20;
        return Math.max(score, 0);
    }
}
