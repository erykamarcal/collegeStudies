package collegeStudies.semester03.dataStructures.ADO01;

public class Exercise21_Program {

    public static void main(String[] args) {

        Exercise21_Fila fila = new Exercise21_Fila(5);

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
    }
}

