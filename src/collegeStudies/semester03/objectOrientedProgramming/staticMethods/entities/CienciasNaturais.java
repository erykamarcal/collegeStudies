package collegeStudies.semester03.objectOrientedProgramming.staticMethods.entities;

import collegeStudies.semester03.objectOrientedProgramming.staticMethods.enums.AreasNatureza;

public class CienciasNaturais extends Ciencias {
    private AreasNatureza areasNatureza;

    public CienciasNaturais(AreasNatureza areasNatureza) {
        super(areasNatureza.toString());
        this.areasNatureza = areasNatureza;
    }

    @Override
    public void descricao() {

    }
}
