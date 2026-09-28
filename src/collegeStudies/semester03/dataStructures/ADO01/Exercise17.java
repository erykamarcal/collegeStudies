package collegeStudies.semester03.dataStructures.ADO01;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise17 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");
        fila.add("Daniel");

        System.out.println("Primeiro elemento: " + fila.peek());
        System.out.println("Fila: " + fila);

    }
}

