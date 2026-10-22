package semester03.objectOrientedProgramming.AbstractClasses.model.entities;

public class Apple extends PerishableProduct {

    public Apple(int quantity, int expirationDay, int expirationMonth, int expirationYear) {
        super("Maçã", 12.0, quantity, expirationDay, expirationMonth, expirationYear);
    }

    @Override
    public void showDescription() {
        System.out.println("Maça Gala 1kg - R$" + getPrice());
    }
}
