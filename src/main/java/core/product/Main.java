package core.product;

public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Product("Egg", 50, "Food"),
                new Product("Laptop", 300, "Electronics"),
                new Product("Jacket", 400, "Clothes"),
        };
        double totalDiscount = 0;
        double totalAfterDiscount = 0;

        for (Product product : products) {
            double discount = product.applyDiscount();
            totalDiscount += discount;
            totalAfterDiscount += (product.getPrice() - discount);
        }
        System.out.println("Total discount " + totalDiscount);
        System.out.println("Total price after discount: " + totalAfterDiscount);
    }
}