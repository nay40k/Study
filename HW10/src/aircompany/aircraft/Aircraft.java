package aircompany.aircraft;

public abstract class Aircraft {
    private String model;
    private int capacity;
    private double cargoCapacity;
    private int flightRange;

    // конструктор
    public Aircraft(String model, int capacity, double cargoCapacity, int flightRange) {
        this.model = model;
        this.capacity = capacity;
        this.cargoCapacity = cargoCapacity;
        this.flightRange = flightRange;
    }

    // геттеры
    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }
}