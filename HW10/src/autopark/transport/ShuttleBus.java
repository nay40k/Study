package autopark.transport;

public class ShuttleBus extends Transport {
    private int passengerCapacity;

    public ShuttleBus(String model, int fuelConsumption, int price, int passengerCapacity) {
        super(model, fuelConsumption, price);
        this.passengerCapacity = passengerCapacity;
    }

}
