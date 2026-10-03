package collegeStudies.semester03.objectOrientedProgramming.staticMethods.entities;

public class Geografia extends CienciasHumanas {
    public Geografia() {
        super("Geografia");
    }

    @Override
    public void descricao (){
        System.out.println("Estudo da humanidade ao longo do tempo.");
    }
}
