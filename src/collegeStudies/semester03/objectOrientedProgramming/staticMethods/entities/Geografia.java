package collegeStudies.semester03.objectOrientedProgramming.staticMethods.entities;

public class Geografia extends CienciasHumanas {
    public Geografia(String area) {
        super("Geografia");
    }

    @Override
    public void descricao (){
        System.out.print("Estudo da humanidade ao longo do tempo.");
    }
}
