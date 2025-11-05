package oop.car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Mercedes", 2.5, 50),
                new Car("Toyota", 5, 45),
                new Car("BMW", 5, 50),
        };

        for (Car car : cars) {
            car.calculateEfficiency();
        }
    }
}