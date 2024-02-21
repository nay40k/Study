package HW10;

// Абстрактный класс для кухонной техники
abstract class KitchenAppliance implements HomeAppliance {
    private String name;
    private double power;

    public KitchenAppliance(String name, double power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void plugIn() {
        System.out.println(name + " включен в розетку.");
    }

    @Override
    public double getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
}