package oop;

public abstract class Shape {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.println("I am a " + this.getClass().getSimpleName());
    }
}
