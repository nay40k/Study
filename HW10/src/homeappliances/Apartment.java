package homeappliances;

class Apartment {
    private Pluggable[] appliances;

    public Apartment(Pluggable[] appliances) {
        this.appliances = appliances;
    }

    // Расчет общей потребляемой мощности
    public int calculateTotalPower() {
        int totalPower = 0;
        for (Pluggable appliance : appliances) {
            if (appliance.isPluggedIn()) {
                totalPower += appliance.getPower();
            }
        }
        return totalPower;
    }

    // Сортировка приборов по мощности
    public void sortByPower() {
        java.util.Arrays.sort(appliances, (a1, a2) -> a1.getPower() - a2.getPower());
    }

    // Поиск кухонного прибора в заданном диапазоне мощности
    public KitchenAppliance findKitchenApplianceInRange(int minPower, int maxPower) {
        for (Pluggable appliance : appliances) {
            if (appliance instanceof KitchenAppliance && appliance.getPower() >= minPower && appliance.getPower() <= maxPower) {
                return (KitchenAppliance) appliance;
            }
        }
        return null;
    }
}