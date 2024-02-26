package autopark.transport;

public class ShuttleBus extends AbstractTransport {
    private int passengerCapacity;

    private boolean isYellow;

    public ShuttleBus(String model, int fuelConsumption, int price, int passengerCapacity, boolean isYellow) {
        super(model, fuelConsumption, price);
        this.passengerCapacity = passengerCapacity;
        this.isYellow = isYellow;
    }

}
