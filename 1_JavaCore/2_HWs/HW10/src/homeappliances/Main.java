package homeappliances;

public class Main {
    public static void main(String[] args) {
        ApplianceManager flat = new ApplianceManager(10);

        KitchenAppliance mixer = new KitchenAppliance("Миксер \"Вихрь\"", 300);
        KitchenAppliance microwave = new KitchenAppliance("Микроволновка \"LG\"", 1200);
        EntertainmentAppliance tv = new EntertainmentAppliance("Телевизор \"Samsung\"", 150);
        EntertainmentAppliance gameConsole = new EntertainmentAppliance("Приставка \"Sony PS4 pro\"", 310);
        CleaningAppliances vacuumCleaner = new CleaningAppliances("Пылесос \"LG\"", 1800);

        flat.addAppliance(mixer);
        flat.addAppliance(microwave);
        flat.addAppliance(tv);
        flat.addAppliance(gameConsole);
        flat.addAppliance(vacuumCleaner);

        mixer.plugIn();
        microwave.plugIn();
        tv.plugIn();
        gameConsole.plugIn();

        System.out.println("Суммарное потребление мощности подключенными приборами:\n" + flat.calculateTotalPowerConsumption() + "Вт");

        flat.sortAppliancesByPower();
        System.out.println("Приборы отсортированы по номинальной мощности:");
        for (int i = 0; i < flat.getCount(); i++) {
            HomeAppliance appliance = flat.appliances[i];
            System.out.println(appliance.getName() + ": " + appliance.getPower() + "Вт");
        }

        HomeAppliance foundAppliance = flat.findKitchenApplianceInRange(300, 500);
        if (foundAppliance != null) {
            System.out.println("Кухонные приборы в заданном диапазоне мощности: " + foundAppliance.getName());
        } else {
            System.out.println("Кухонные приборы в заданном диапазоне мощности отсутствуют.");
        }
    }
}