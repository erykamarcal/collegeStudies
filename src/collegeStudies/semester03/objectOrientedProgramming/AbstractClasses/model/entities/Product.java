package collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.entities;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return this.price * this.quantity;
    }

    public abstract void showDescription();

    public abstract boolean isValid(int currentDay, int currentMonth, int currentYear);

    @Override
    public String toString() {
        return this.name +
                " - " +
                this.quantity +
                " x R$" + this.price;
    }
}
