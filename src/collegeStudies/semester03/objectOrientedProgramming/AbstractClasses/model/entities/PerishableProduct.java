package collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.entities;

import collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.interfaces.Validator;

public abstract class PerishableProduct extends Product {

    public Validator validator;

    public PerishableProduct(String name, double price, int quantity, int expirationDay, int expirationMonth, int expirationYear) {
        super(name, price, quantity);
        this.validator = new ExpirationDate(expirationDay, expirationMonth, expirationYear);
    }

    @Override
    public boolean isValid(int currentDay, int currentMonth, int currentYear) {
        return this.validator.isValid(currentDay, currentMonth, currentYear);
    }
}

