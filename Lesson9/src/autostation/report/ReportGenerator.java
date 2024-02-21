package autostation.report;

import autostation.car.Car;

public class ReportGenerator {

    StringBuilder report = new StringBuilder();

    public void addToReport(Car car) {
        report.append(car.getReport());
    }

    public String getReport() { return report.toString();{
        for (Car car : carPark) {

        }
    }
}
