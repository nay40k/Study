package carServiceStation.model;

import java.util.Random;

public abstract class Car {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    protected int id;
    protected String model;

    public Car(String model) {
        id = new Random().nextInt(9000) + 1000;
        this.model = model;
    }

    public abstract int doService();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
