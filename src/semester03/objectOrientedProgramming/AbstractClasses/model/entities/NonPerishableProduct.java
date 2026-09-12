package semester03.objectOrientedProgramming.AbstractClasses.model.entities;

public abstract class NonPerishableProduct extends Product{
    public NonPerishableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public boolean isValid(int currentDay, int currentMonth, int currentYear) {
        return true;
    }
}
