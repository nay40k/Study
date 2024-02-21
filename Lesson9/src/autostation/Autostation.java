package autostation;

import autostation.car.Car;
import autostation.report.ReportGenerator;

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

    public String getReport() {
        ReportGenerator generator = new ReportGenerator();
        for (Car car : carPark) {
            generator.addToReport(car);
        }
        return generator.getReport();
    }
}

