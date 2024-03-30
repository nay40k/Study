package carServiceStation.model;

import java.util.Random;

public class Truck extends Car {


    public Truck(String model) {
        super(model);
    }

    public void doTO(){
        System.out.println(ANSI_GREEN + "Truck " + id + " " + model + " started service" + ANSI_RESET);
        try {
            Thread.sleep(new Random().nextInt(1000) + 3000);
        } catch (InterruptedException ignore) {}
        System.out.println(ANSI_RED + "Truck " + id + " " + model + " finished service "+ ANSI_RESET);
    }
}
