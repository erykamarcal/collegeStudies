package collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.entities;

import collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.interfaces.Cashier;

import java.util.ArrayList;
import java.util.List;

public class Purchase implements Cashier {

    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void finalizePurchase() {
        System.out.println("------");

        double total = 0.0;

        for (Product product : products) {
            if (product.isValid(11, 9, 2026)) {
                total += product.getPrice();
                product.showDescription();
                System.out.println(product);
            } else {
                System.out.println(product.getName() + " expired.");
            }
        }

        System.out.println("Total: $" + total);

    }
}
