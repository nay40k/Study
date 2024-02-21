package autopark;

public class Main {
    public static void main(String[] args) {
        TransportPark park = new TransportPark(5);

        park.addVehicle(new Bus("Икарус", 15.0, 100000, 50));
        park.addVehicle(new Bus("ЗиЛ", 12.5, 120000, 60));

        System.out.println("Общая стоимость транспортных средств: " + park.calculateTotalCost());

        park.sortVehiclesByFuelConsumption();
        System.out.println("Сортировка по расходу топлива:");
        for (PublicTransport vehicle : park.vehicles) {
            if (vehicle != null) {
                System.out.println(vehicle.getModel() + ": " + vehicle.getFuelConsumption() + "л/100км");
            }
        }

        double minFuelConsumption = 10.0;
        double maxFuelConsumption = 16.0;
        Bus[] busesInRange = park.findBusesInRange(minFuelConsumption, maxFuelConsumption);
        System.out.println("Автобусы с расходом от " + minFuelConsumption + " до " + maxFuelConsumption + "л/100км:");
        for (Bus bus : busesInRange) {
            if (bus != null) {
                System.out.println(bus.getModel() + ": " + bus.getFuelConsumption() + "L/100km");
            }
        }
    }
}
