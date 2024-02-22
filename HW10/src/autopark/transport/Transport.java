package autopark.transport;

public abstract class Transport {
    private String model;
    private int fuelConsumption;
    private int cost;


    // конструктор абстрактного класса
    public Transport(String model, int fuelConsumption, int cost) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getCost() {
        return cost;
    }
}