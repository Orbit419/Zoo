import animals.Animal;
import animals.Fish;
import animals.Pinguin;
import animals.Shark;
import animals.Sparrow;
import animals.Tiger;
import aviaries.Aquarium;
import aviaries.AviaryForAll;
import aviaries.CageForBirds;

public class Main {
    public static void main(String[] args) {
        Animal pinguin = new Pinguin();
        Pinguin pinguin2 = new Pinguin();
        Fish pinguin3 = new Pinguin();
        Animal tiger = new Tiger();
        Fish shark = new Shark();
        Sparrow sparrow = new Sparrow();

        AviaryForAll aviaryForAll = new AviaryForAll();
        Aquarium aquarium = new Aquarium();
        CageForBirds cageForBirds = new CageForBirds();

        aviaryForAll.addAnimal(pinguin);
        aviaryForAll.addAnimal(pinguin2);
        aviaryForAll.addAnimal(pinguin3);
        aquarium.addAnimal(pinguin2);
        aquarium.addAnimal(pinguin3);
        cageForBirds.addAnimal(pinguin2);

        aviaryForAll.addAnimal(sparrow);
        cageForBirds.addAnimal(sparrow);

        aviaryForAll.addAnimal(shark);
        aquarium.addAnimal(shark);

        aviaryForAll.addAnimal(tiger);
    }
}
