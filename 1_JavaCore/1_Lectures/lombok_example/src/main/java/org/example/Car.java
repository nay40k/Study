package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {

    private int id;
    private String color;
    private String engine;
    private int maxSpeed;
//
//    public Car(int id, String color, String engine, int maxSpeed) {
//        this.id = id;
//        this.color = color;
//        this.engine = engine;
//        this.maxSpeed = maxSpeed;
//    }
//
//    public Car() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getEngine() {
//        return engine;
//    }
//
//    public void setEngine(String engine) {
//        this.engine = engine;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", color='" + color + '\'' +
//                ", engine='" + engine + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }
}
