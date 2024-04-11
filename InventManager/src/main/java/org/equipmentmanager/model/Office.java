package org.equipmentmanager.model;

public class Office {
    String address;
    String department;

    public Office(String address, String department) {
        this.address = address;
        this.department = department;
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
