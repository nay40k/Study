package car;

import java.util.Random;

public abstract class Car {

    protected int id;

    protected int serviceInterval = 5000;

    public Car() {
        id = new Random().nextInt(10000);
    }

    public abstract void doWork();

    public void moveToService() {
        System.out.println("Moving to service");
    }

}
