package transport;

import transport.Transport;

public class ShuttleBus extends Transport {
    private int passengerCapacity;

    public ShuttleBus(int fuelConsumption, int price, int passengerCapacity) {
        super(fuelConsumption, price);
        this.passengerCapacity = passengerCapacity;
    }

}
