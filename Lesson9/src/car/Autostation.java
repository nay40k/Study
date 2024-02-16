package car;

public class Autostation {

    private Car[] carPark = new Car[5];
    private int carCounter = 0;


    public void addCar(Car car) {
        if (carCounter < carPark.length) {
            carPark[carCounter] = car;
            carCounter++;
        } else {
            System.out.println("No more places");
        }
    }

    public void startStationWork() {
        for (Car car : carPark) {
            car.doWork();
        }
    }
}
