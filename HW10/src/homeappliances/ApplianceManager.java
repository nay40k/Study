package homeappliances;

class ApplianceManager {
    HomeAppliance[] appliances;
    private int count;

    public ApplianceManager(int size) {
        appliances = new HomeAppliance[size];
        count = 0;
    }

    public void addAppliance(HomeAppliance appliance) {
        if (count < appliances.length) {
            appliances[count++] = appliance;
        }
    }

    public int getCount() {
        return count;
    }

    public int calculateTotalPowerConsumption() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += appliances[i].getPowerConsumption();
        }
        return total;
    }

    public void sortAppliancesByPower() {
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < count - 1; i++) {
                if (appliances[i].getPower() > appliances[i + 1].getPower()) {
                    HomeAppliance temp = appliances[i];
                    appliances[i] = appliances[i + 1];
                    appliances[i + 1] = temp;
                    sorted = false;
                }
            }
        } while (!sorted);
    }

    public HomeAppliance findKitchenApplianceInRange(int minPower, int maxPower) {
        for (int i = 0; i < count; i++) {
            if (appliances[i] instanceof KitchenAppliance &&
                    appliances[i].getPower() >= minPower &&
                    appliances[i].getPower() <= maxPower) {
                return appliances[i];
            }
        }
        return null;
    }
}
