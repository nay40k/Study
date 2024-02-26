package aircompany;

import aircompany.aircraft.AbstractAircraft;

class Airline {
    AbstractAircraft[] fleet;
    private int size;

    public Airline(int capacity) {
        fleet = new AbstractAircraft[capacity];
        size = 0;
    }

    public void addAircraft(AbstractAircraft aircraft) {
        if (size < fleet.length) {
            fleet[size] = aircraft;
            size++;
        } else {
            System.out.println("Флот полон. Добавление новых судов невозможно.");
        }
    }

    public int calculateTotalCapacity() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += fleet[i].getCapacity();
        }
        return total;
    }

    public double calculateTotalCargoCapacity() {
        double totalCargoCapacity = 0;
        for (int i = 0; i < size; i++) {
            totalCargoCapacity += fleet[i].getCargoCapacity();
        }
        return totalCargoCapacity;
    }

    public void sortAircraftByFlightRange() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (fleet[j].getFlightRange() > fleet[j + 1].getFlightRange()) {
                    AbstractAircraft temp = fleet[j];
                    fleet[j] = fleet[j + 1];
                    fleet[j + 1] = temp;
                }
            }
        }
    }

    public AbstractAircraft[] findAircraftInRange(int minRange, int maxRange) {
        AbstractAircraft[] result = new AbstractAircraft[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (fleet[i].getFlightRange() >= minRange && fleet[i].getFlightRange() <= maxRange) {
                result[count] = fleet[i];
                count++;
            }
        }
        return trimAircraftArray(result, count);
    }

    private AbstractAircraft[] trimAircraftArray(AbstractAircraft[] aircraft, int count) {
        AbstractAircraft[] trimmedArray = new AbstractAircraft[count];
        System.arraycopy(aircraft, 0, trimmedArray, 0, count);
        return trimmedArray;
    }
}