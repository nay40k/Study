package aircompany;

import aircompany.aircraft.Aircraft;
import aircompany.aircraft.Airplane;
import aircompany.aircraft.Helicopter;
import aircompany.aircraft.Quadcopter;
import autopark.transport.Bus;
import autopark.transport.Transport;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline(5);

        airline.addAircraft(new Airplane("Ту-154", 158, 18000, 4000));
        airline.addAircraft(new Airplane("Boeing 727", 131, 14183, 3700 ));
        airline.addAircraft(new Helicopter("Ка-226Т", 12, 785 , 475));
        airline.addAircraft(new Quadcopter("DJI Phantom 4", 0, 0.1, 2));

        System.out.println("Общая вместимость пассажиров: " + airline.calculateTotalCapacity());
        System.out.println("Общая грузоподъёмность: " + airline.calculateTotalCargoCapacity());

        airline.sortAircraftByFlightRange();
        System.out.println("Воздушные суда по дальности полёта:");
        for (Aircraft aircraft : airline.fleet) {
            if (aircraft != null) {
                System.out.println(aircraft.getModel() + ": " + aircraft.getFlightRange() + "км");
            }
        }

        int minRange = 500;
        int maxRange = 6000;
        Aircraft[] aircraftInRange = airline.findAircraftInRange(minRange, maxRange);
        System.out.println("Воздушные суда с дальностью полёта от " + minRange + " до " + maxRange + "км:");
        for (Aircraft aircraft : aircraftInRange) {
            if (aircraft != null) {
                System.out.println(aircraft.getModel() + ": " + aircraft.getFlightRange() + "км");
            }
        }
    }
}