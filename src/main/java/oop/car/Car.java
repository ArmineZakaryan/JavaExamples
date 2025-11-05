package oop.car;

import java.util.Objects;

public class Car {
    private String model;
    private double fuelConsumed;
    private double distance;

    public Car(String model, double fuelConsumed, double distance) {
        this.model = model;
        this.fuelConsumed = fuelConsumed;
        this.distance = distance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public void setFuelConsumed(double fuelConsumed) {
        this.fuelConsumed = fuelConsumed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return Double.compare(fuelConsumed, car.fuelConsumed) == 0 && Double.compare(distance, car.distance) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(model);
        result = 31 * result + Double.hashCode(fuelConsumed);
        result = 31 * result + Double.hashCode(distance);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuelConsumed=" + fuelConsumed +
                ", distance=" + distance +
                '}';
    }

    public void calculateEfficiency() {
        double efficiency = distance / fuelConsumed;
        System.out.println(model + " efficiency: " + efficiency);

        if (efficiency > 15) {
            System.out.println("Very efficient");
        } else if (efficiency >= 10) {
            System.out.println("Average");
        } else {
            System.out.println("Needs maintenance");
        }
    }
}