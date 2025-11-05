package oop.productDiscount;

import java.util.Objects;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Double.hashCode(price);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void applyDiscount() {
        double percent;
        double newPrice;
        if (price > 1000) {
            percent = 20;
            newPrice = price - (price * percent / 100);
            System.out.println("Product " + name + " new price: " + newPrice);
        } else if (price >= 500) {
            percent = 10;
            newPrice = price - (price * percent / 100);
            System.out.println("Product " + name + " new price: " + newPrice);
            price = newPrice;
        } else {
            System.out.println("Product " + name + " has no discount");
        }
    }
}