package model;

public class Car {
    // поля класса
    private String manufacturer;
    private String color;
    private Integer engineVolume;

    // конструктор
//    public Car (String manufacturer, String color, Integer engineVolume) {
//        this.manufacturer = manufacturer;
//        this.color = color;
//        this.engineVolume = engineVolume;
//    }

//    public Car() {
//
//    }

    // методы
    public void paint () {
        color = "white";
    }

    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public int sum(int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        return result;
    }

    public void move() { /* ... */ }


    public Integer getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Integer engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
