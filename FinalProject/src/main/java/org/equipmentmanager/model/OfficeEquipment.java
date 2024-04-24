package org.equipmentmanager.model;


public class OfficeEquipment {

    private int id;
    private String type;
    private String serialNumber;
    private double cost;
    private String status;
    private String user;
    private String firstname;
    private String lastname;
    private String location;
    private String address;
    private String department;

    public OfficeEquipment(int id, String type, String serialNumber, double cost, String status, String firstname, String lastname, String address, String department) {
        this.id = id;
        this.type = type;
        this.serialNumber = serialNumber;
        this.cost = cost;
        this.status = status;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.department = department;
    }

    public OfficeEquipment(int id, String type, String serialNumber, double cost, String status, String user, String location) {
        this.id = id;
        this.type = type;
        this.serialNumber = serialNumber;
        this.cost = cost;
        this.status = status;
        this.user = user;
        this.location = location;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", cost=" + cost +
                ", status='" + status + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ']';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
