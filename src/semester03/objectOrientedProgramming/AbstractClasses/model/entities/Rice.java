package semester03.objectOrientedProgramming.AbstractClasses.model.entities;

public class Rice extends NonPerishableProduct{


    public Rice(int quantity) {
        super("Rice", 15.99, quantity);
    }

    @Override
    public void showDescription() {
        System.out.println("Arroz Camil 5kg - R$ " + getPrice());
    }
}
