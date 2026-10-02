package collegeStudies.semester03.objectOrientedProgramming.staticMethods.entities;

public abstract class Ciencias {
    private String area;

    public Ciencias(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public abstract void descricao();
}
