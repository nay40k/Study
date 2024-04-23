package org.equipmentmanager.model;


public class OfficeEquipment {

    private int id;
    private String type;
    private String serialNumber;
    private double cost;
    private String status;
    private String user;
    private String location;

    public OfficeEquipment(int id, String type, String serialNumber, double cost, String status, String user, String location) {
        this.id = id;
        this.type = type;
        this.serialNumber = serialNumber;
        this.cost = cost;
        this.status = status;
        this.user = user;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
