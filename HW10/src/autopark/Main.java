package autopark;

import autopark.transport.Bus;
import autopark.transport.ShuttleBus;
import autopark.transport.Taxi;
import autopark.transport.Transport;

public class Main {
    public static void main(String[] args) {

        AutoPark park = new AutoPark(5);

        park.addVehicle(new Bus("Икарус", 24, 100000, 50));
        park.addVehicle(new Bus("ЗиЛ", 36, 120000, 35));
        park.addVehicle(new Bus("ПАЗ", 18, 96000, 32));
        park.addVehicle(new Taxi("Лада Веста", 12, 12000, "B"));
        park.addVehicle(new ShuttleBus("Газель", 16, 20000, 18));

        System.out.println("Общая стоимость транспортных средств: " + park.calculateTotalCost());

        park.sortVehiclesByFuelConsumption();
        System.out.println("Сортировка по расходу топлива:");
        for (Transport vehicle : park.vehicles) {
            if (vehicle != null) {
                System.out.println(vehicle.getModel() + ": " + vehicle.getFuelConsumption() + " л/100км");
            }
        }

        int minFuelConsumption = 15;
        int maxFuelConsumption = 25;
        Bus[] busesInRange = park.findBusesInRange(minFuelConsumption, maxFuelConsumption);
        System.out.println("Автобусы с расходом от " + minFuelConsumption + " до " + maxFuelConsumption + " л/100км:");
        for (Bus bus : busesInRange) {
            if (bus != null) {
                System.out.println(bus.getModel() + ": " + bus.getFuelConsumption() + " л/100км");
            }
        }
    }
}
