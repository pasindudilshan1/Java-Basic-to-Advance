/*
 * synthesis_shelter.java - Synthesis Project
 * Represents the Digital Pet Shelter holding Animal objects
 */
import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> animals;

    public Shelter() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAllProfiles() {
        for (Animal animal : animals) {
            animal.displayFullProfile();
            System.out.println();
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
