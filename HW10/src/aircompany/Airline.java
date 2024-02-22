package aircompany;

import aircompany.aircraft.Aircraft;

class Airline {
    Aircraft[] fleet;
    private int size;

    public Airline(int capacity) {
        fleet = new Aircraft[capacity];
        size = 0;
    }

    public void addAircraft(Aircraft aircraft) {
        if (size < fleet.length) {
            fleet[size] = aircraft;
            size++;
        } else {
            System.out.println("Fleet is full. Cannot add more aircraft.");
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
                    Aircraft temp = fleet[j];
                    fleet[j] = fleet[j + 1];
                    fleet[j + 1] = temp;
                }
            }
        }
    }

    public Aircraft[] findAircraftInRange(int minRange, int maxRange) {
        Aircraft[] result = new Aircraft[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (fleet[i].getFlightRange() >= minRange && fleet[i].getFlightRange() <= maxRange) {
                result[count] = fleet[i];
                count++;
            }
        }
        return trimAircraftArray(result, count);
    }

    private Aircraft[] trimAircraftArray(Aircraft[] aircrafts, int count) {
        Aircraft[] trimmedArray = new Aircraft[count];
        System.arraycopy(aircrafts, 0, trimmedArray, 0, count);
        return trimmedArray;
    }
}