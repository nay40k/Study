package autostation.car;

public class Bus extends Car {

    private int capacity;

    public Bus(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.printf("Bus №%d is moving\n", this.id);

    }

    @Override
    public String getReport() {
        return String.format("Bus №%d, capacity: %d\n", this.id, this.capacity);
    }
}
