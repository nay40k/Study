package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car();
        car.setId(5);
        car.setEngine("N73");
        car.getId();

        Car car2 = new Car(5, "Red", "B52", 200);

        Car car3 = Car.builder().id(5).color("Red").engine("B53").maxSpeed(150).build();
    }
}