package collegeStudies.semester03.objectOrientedProgramming.staticMethods.entities;

import collegeStudies.semester03.objectOrientedProgramming.staticMethods.enums.AreasNatureza;

public class CienciasNaturais extends Ciencias {
    private final AreasNatureza areasNatureza;

    public CienciasNaturais(AreasNatureza areasNatureza) {
        super(areasNatureza.toString());
        this.areasNatureza = areasNatureza;
    }

    @Override
    public void descricao() {
        switch (this.areasNatureza){
            case FISICA -> System.out.println("Estudo fundamental da natureza. ");
            case QUIMICA -> System.out.println("Estudo da materia. ");
            case BIOLOGIA -> System.out.println("Estudo da Vida.");
            default -> System.out.println("Erro!");
        }
    }
}
