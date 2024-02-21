package HW10;

// Абстрактный класс для кухонной техники
abstract class KitchenAppliances implements HomeAppliances {
    private String name;
    private int power;

    public KitchenAppliances(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void plugIn() {
        System.out.println(name + " включен в розетку.");
    }

    @Override
    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
}