package collegeStudies.semester03.dataStructures.ADO01;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise16 {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("João");
        fila.add("Pedro");
        fila.add("Lucas");
        fila.add("Marcos");

        System.out.println("Fila: " + fila);

        fila.remove();
        fila.remove();

        System.out.println("Fila após remoção: " + fila);
    }
}