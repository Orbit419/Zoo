package aviaries;

import java.util.ArrayList;
import java.util.List;

public abstract class Aviary <T> {
    List<T> animals = new ArrayList<>();

    public List<T> getAnimals() {
        return animals;
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }
}
