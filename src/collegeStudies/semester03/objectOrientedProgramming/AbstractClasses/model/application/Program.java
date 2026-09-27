package collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.application;

import collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.entities.*;
import collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.interfaces.Cashier;

public class Program {
    public static void main(String[] args) {

        Cashier purchase = new Purchase();
        purchase.addProduct(new Pasta(3));
        purchase.addProduct(new Rice(2));
        purchase.addProduct(new Apple(1, 20, 9, 2026));
        purchase.addProduct(new Milk(2, 10, 9, 2026));
        purchase.finalizePurchase();
    }

}

