package collections.sortProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("pen", 100));
        products.add(new Product("book", 400));
        products.add(new Product("laptop", 300));
        products.add(new Product("notebook", 200));

        Collections.sort(products);
        for (Product p : products) {
            System.out.println(p);
        }


        Collections.sort(products, new PriceComparator());
        System.out.println("\nSorted by price:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}