class Computer extends OfficeEquipment {
    private String processor;

    public Computer(String name, double price, String processor) {
        super(name, price);
        this.processor = processor;
    }

    @Override
    public void displayInfo() {
        System.out.println("Computer: " + name + ", Price: $" + price + ", Processor: " + processor);
    }
}