package carServiceStation.model;

import java.util.Random;

public class Auto extends Car{

    public Auto(String model) {
        super(model);
    }

    public void doTO(){
        System.out.println(ANSI_YELLOW + "Car " + id + " " + model + " started service" + ANSI_RESET);
        try {
            Thread.sleep(new Random().nextInt(1000) + 1000);
        } catch (InterruptedException ignore) {}
        System.out.println(ANSI_RED + "Car " + id + " " + model + " finished service" + ANSI_RESET);
    }
}
