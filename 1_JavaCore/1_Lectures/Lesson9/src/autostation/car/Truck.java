package autostation.car;

public class Truck extends Car{
    @Override
    public void doWork() {
        System.out.printf("Truck №%d is moving\n", this.id);
    }
    public void load() {
        System.out.println("loaded");
    }

    @Override
    public String getReport() {
        return String.format("Truck №%d\n", this.id);
    }
}
