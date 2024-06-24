package transport;

import transport.Transport;

public class Bus extends Transport {
    private int passengerCapacity;

    public Bus(int fuelConsumption, int price, int passengerCapacity) {
        super(fuelConsumption, price);
        this.passengerCapacity = passengerCapacity;
    }

}
