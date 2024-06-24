package Movable;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");

        Drone drone1 = new Drone();
        Movable drone2 = new Drone();

        drone1.move(50);
        drone1.recharge();

        drone2.move();

    }
}