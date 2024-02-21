package autostation.car;

import java.util.Random;

public abstract class Car {

    protected int id;

    protected int serviceInterval = 5000;

    public Car() {
        id = new Random().nextInt(8999) + 1000;
    }


    public abstract void doWork();

    public abstract String getReport();

    public void moveToService() {
        System.out.println("Moving to service");
    }

}
