package reflection.goat;

import reflection.Locomotion;
import reflection.Animal;

public class Goat extends Animal implements Locomotion {



    private Goat(String name) {
        super(name);
    }

    @Override
    public String getSound() {
        System.out.println("bud muzhikom bleat");
        return "bleat";
    }

    @Override
    public String getLocomotion() {
        System.out.println("walks");
        return "walks";
    }

    @Override
    public String eats() {
        System.out.println("grass");
        return "grass";
    }

    private void sayYourSecretName() {
        System.out.println("Mohammad Smith");
    }

    private void sayYourVerySecretName(int password) {

        if (password == 1111) {
            System.out.println("Mohammad Smith++");
        } else {
            System.out.println("Mohammad Smith--");
        }
    }

}
