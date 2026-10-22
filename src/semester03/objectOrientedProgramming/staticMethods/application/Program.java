package semester03.objectOrientedProgramming.staticMethods.application;

import semester03.objectOrientedProgramming.staticMethods.entities.Ciencias;
import semester03.objectOrientedProgramming.staticMethods.entities.CienciasNaturais;
import semester03.objectOrientedProgramming.staticMethods.entities.Geografia;
import semester03.objectOrientedProgramming.staticMethods.entities.Historia;
import semester03.objectOrientedProgramming.staticMethods.enums.AreasNatureza;

public class Program {

    public static void main(String[] args) {


        Ciencias historia = new Historia();
        historia.descricao();
        Ciencias geografia = new Geografia();
        geografia.descricao();

        Ciencias fisica = new CienciasNaturais(AreasNatureza.FISICA);
        fisica.descricao();

        Ciencias quimica = new CienciasNaturais(AreasNatureza.QUIMICA);
        quimica.descricao();

        Ciencias biologia = new CienciasNaturais(AreasNatureza.BIOLOGIA);
        biologia.descricao();

    }
}
