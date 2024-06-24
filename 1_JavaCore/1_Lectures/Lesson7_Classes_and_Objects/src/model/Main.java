package model;

import model.Car;

public class Main {
    public static void main(String[] args) {

        Car myFirstCar = new Car();
        int sumResult = myFirstCar.sum(5, 7);

        System.out.println(sumResult);

        int sum = myFirstCar.sum(5, 6, 7, 2, 9, 44);
        System.out.println(sum);

//        Car mySecondCar = new Car("Mercedes", "Red", 3);
//
//        System.out.println(mySecondCar.getEngineVolume());
//        System.out.println(mySecondCar.getColor());
//        System.out.println(mySecondCar.getManufacturer());
//
//        mySecondCar.setEngineVolume(6);
//        mySecondCar.setColor("Black");
//
//        System.out.println(mySecondCar.getEngineVolume());
//        System.out.println(mySecondCar.getColor());
//        System.out.println(mySecondCar.getManufacturer());


    }
}