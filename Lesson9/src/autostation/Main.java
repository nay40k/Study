package autostation;


import autostation.car.Bus;
import autostation.car.Truck;

public class Main {

    public static void main(String[] args) {
        Autostation autostation = new Autostation();



        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();

        Bus bus1 = new Bus(12);
        Bus bus2 = new Bus(13);

        autostation.addCar(truck1);
        autostation.addCar(truck2);
        autostation.addCar(truck3);
        autostation.addCar(bus1);
        autostation.addCar(bus2);

        autostation.startStationWork();

    }
}