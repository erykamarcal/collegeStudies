package collegeStudies.semester03.objectOrientedProgramming.AbstractClasses.model.entities;

public class Pasta extends NonPerishableProduct {

    public Pasta(int quantidade) {
        super("Macarrão", 7.0, quantidade);
    }

    @Override
    public void showDescription() {
        System.out.println("Macarrão Dona Berenice 500g");
    }

}

