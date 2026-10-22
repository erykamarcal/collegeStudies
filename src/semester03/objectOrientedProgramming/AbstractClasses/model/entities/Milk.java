package semester03.objectOrientedProgramming.AbstractClasses.model.entities;

public class Milk extends PerishableProduct {


    public Milk(int quantity, int expirationDay, int expirationMonth, int expirationYear) {
        super("Leite", 4.90, quantity, expirationDay, expirationMonth, expirationYear);
    }

    @Override
    public void showDescription() {
        System.out.println("Leite Pirajusara 1L - R$ " + getPrice());
    }

}
