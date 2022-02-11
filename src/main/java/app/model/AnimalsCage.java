package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal animalDog;
    private final Animal animalCat;
    private final Timer timer;

//    private Animal animal;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animalDog,
                       @Qualifier("cat") Animal animalCat,
                       @Qualifier("timer") Timer timer) {
        this.animalDog = animalDog;
        this.animalCat = animalCat;
        this.timer = timer;

    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animalDog.toString() + ", " + animalCat.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
