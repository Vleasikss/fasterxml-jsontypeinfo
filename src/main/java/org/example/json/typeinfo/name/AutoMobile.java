package org.example.json.typeinfo.name;

public class AutoMobile {

    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "AutoMobile{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
