package car;

public class Bus extends Car{

    private int capacity = 20;

    @Override
    public void doWork() {
        System.out.printf("Bus №%d is moving\n", this.id);

    }
}
