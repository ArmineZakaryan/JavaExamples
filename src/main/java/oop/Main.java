package oop;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.displayInfo();
        System.out.println("Մակերես։ " + circle.calculateArea());
        System.out.println("Պարագիծ։ " + circle.calculatePerimeter());

        System.out.println();

        rectangle.displayInfo();
        System.out.println("Մակերես։ " + rectangle.calculateArea());
        System.out.println("Պարագիծ: " + rectangle.calculatePerimeter());
    }
}