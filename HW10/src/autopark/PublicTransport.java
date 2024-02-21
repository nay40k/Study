package autopark;

abstract class PublicTransport {
    private String model;
    private double fuelConsumption;
    private double cost;


    // конструктор абстрактного класса
    public PublicTransport(String model, double fuelConsumption, double cost) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getCost() {
        return cost;
    }
}