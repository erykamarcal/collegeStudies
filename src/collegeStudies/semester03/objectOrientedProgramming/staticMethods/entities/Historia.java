package collegeStudies.semester03.objectOrientedProgramming.staticMethods.entities;

public class Historia extends CienciasHumanas {

    public Historia() {
        super("História");
    }

    @Override
    public void descricao (){
        System.out.println("Estudo da humanidade ao longo do tempo.");
    }
}
