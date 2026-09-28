package collegeStudies.semester03.dataStructures.ADO01;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise19 {
    public static void main(String[] args) {

        Queue<String> clientes = new LinkedList<>();

        clientes.add("Cliente 1");
        clientes.add("Cliente 2");
        clientes.add("Cliente 3");
        clientes.add("Cliente 4");
        clientes.add("Cliente 5");

        System.out.println("Fila inicial:");
        System.out.println(clientes);

        while (!clientes.isEmpty()) {
            String cliente = clientes.poll();
            System.out.println("Atendendo: " + cliente);
        }

        System.out.println("Fila vazia!");
    }
}

