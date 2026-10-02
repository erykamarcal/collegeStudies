package collegeStudies.semester03.objectOrientedProgramming.staticMethods.entities;

public class Historia extends CienciasHumanas {

    public Historia(String area) {
        super("História");
    }

    @Override
    public void descricao (){
        System.out.print("Estudo da humanidade ao longo do tempo.");
    }
}
