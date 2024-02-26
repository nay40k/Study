package autopark;

import autopark.transport.Bus;
import autopark.transport.AbstractTransport;

public class AutoPark {
    public AbstractTransport[] vehicles;
    private int size;

    public AutoPark(int capacity) {
        vehicles = new AbstractTransport[capacity];
        size = 0;
    }

    public void addVehicle(AbstractTransport vehicle) {
        if (size < vehicles.length) {
            vehicles[size] = vehicle;
            size++;
        } else {
            System.out.println("Автопарк заполнен. Добавление транспорта невозможно.");
        }
    }

    public int calculateTotalCost() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += vehicles[i].getCost();
        }
        return total;
    }

    public void sortVehiclesByFuelConsumption() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (vehicles[j].getFuelConsumption() > vehicles[j + 1].getFuelConsumption()) {
                    AbstractTransport temp = vehicles[j];
                    vehicles[j] = vehicles[j + 1];
                    vehicles[j + 1] = temp;
                }
            }
        }
    }

    public Bus[] findBusesInRange(int minFuelConsumption, int maxFuelConsumption) {
        Bus[] result = new Bus[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (vehicles[i] instanceof Bus) {
                Bus bus = (Bus) vehicles[i];
                if (bus.getFuelConsumption() >= minFuelConsumption && bus.getFuelConsumption() <= maxFuelConsumption) {
                    result[count] = bus;
                    count++;
                }
            }
        }
        return trimBusArray(result, count);
    }

    private Bus[] trimBusArray(Bus[] buses, int count) {
        Bus[] trimmedArray = new Bus[count];
        System.arraycopy(buses, 0, trimmedArray, 0, count);
        return trimmedArray;
    }
}