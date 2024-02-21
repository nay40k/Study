package autopark;

class Bus extends PublicTransport {
    private int passengerCapacity;

    public Bus(String model, double fuelConsumption, double cost, int passengerCapacity) {
        super(model, fuelConsumption, cost);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}