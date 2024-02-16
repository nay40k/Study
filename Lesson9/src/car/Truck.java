package car;

public class Truck extends Car{
    @Override
    public void doWork() {
        System.out.printf("Truck №%d is moving\n", this.id);
    }
    public void load() {
        System.out.println("loaded");
    }
}
