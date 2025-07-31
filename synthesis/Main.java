/*
 * synthesis_main.java - Synthesis Project
 * Entry point for the Digital Pet Shelter application
 */
public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        Dog dog = new Dog("Buddy", 3, "Labrador", "2025-07-01", true, "Playful", true, true);
        Cat cat = new Cat("Whiskers", 2, "Siamese", "2025-07-15", true, "Calm", true, true);
        shelter.addAnimal(dog);
        shelter.addAnimal(cat);
        shelter.displayAllProfiles();
    }
}
