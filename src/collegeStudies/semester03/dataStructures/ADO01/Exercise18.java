package collegeStudies.semester03.dataStructures.ADO01;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise18 {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");

        System.out.println("A fila está vazia? " + fila.isEmpty());

        fila.clear();

        System.out.println("A fila está vazia? " + fila.isEmpty());
    }
}
