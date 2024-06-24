abstract class OfficeEquipment {
    protected String name;
    protected double price;

    public OfficeEquipment(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();
}