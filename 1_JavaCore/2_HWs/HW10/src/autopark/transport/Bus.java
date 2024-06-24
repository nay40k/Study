package autopark.transport;

public class Bus extends AbstractTransport {
    private int passengerCapacity;

    public Bus(String model, int fuelConsumption, int cost, int passengerCapacity) {
        super(model, fuelConsumption, cost);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}