package org.equipmentmanager.model;


public class Office {
    int id;
    String address;
    String department;

    public Office(String address, String department) {
        this.address = address;
        this.department = department;
    }

    public Office(int id, String address, String department) {
        this.id = id;
        this.address = address;
        this.department = department;
    }

    public Office() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
