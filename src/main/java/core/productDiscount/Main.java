package core.productDiscount;

public class Main {
    public static void main(String[] args) {

        Product[] products = new Product[3];
        products[0] = new Product("book", 1200);
        products[1] = new Product("notebook", 600);
        products[2] = new Product("pen", 300);

        double totalBefore = 0;
        for (int i = 0; i < products.length; i++) {
            totalBefore += products[i].getPrice();
        }
        System.out.println(totalBefore);

        double totalAfter = 0;

        for (int i = 0; i < products.length; i++) {
            products[i].applyDiscount();
            totalAfter += products[i].getPrice();
        }
        System.out.println(totalAfter);
    }
}