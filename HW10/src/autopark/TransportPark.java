package autopark;

class TransportPark {
    PublicTransport[] vehicles;
    private int size;

    public TransportPark(int capacity) {
        vehicles = new PublicTransport[capacity];
        size = 0;
    }

    public void addVehicle(PublicTransport vehicle) {
        if (size < vehicles.length) {
            vehicles[size] = vehicle;
            size++;
        } else {
            System.out.println("Transport park is full. Cannot add more vehicles.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += vehicles[i].getCost();
        }
        return totalCost;
    }

    public void sortVehiclesByFuelConsumption() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (vehicles[j].getFuelConsumption() > vehicles[j + 1].getFuelConsumption()) {
                    PublicTransport temp = vehicles[j];
                    vehicles[j] = vehicles[j + 1];
                    vehicles[j + 1] = temp;
                }
            }
        }
    }

    public Bus[] findBusesInRange(double minFuelConsumption, double maxFuelConsumption) {
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