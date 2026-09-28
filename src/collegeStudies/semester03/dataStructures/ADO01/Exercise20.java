package collegeStudies.semester03.dataStructures.ADO01;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise20 {
    public static void main(String[] args) {

        Queue<Integer> senhas = new LinkedList<>();

        senhas.add(101);
        senhas.add(102);
        senhas.add(103);
        senhas.add(104);
        senhas.add(105);

        while (!senhas.isEmpty()) {

            System.out.println("Próxima senha: " + senhas.peek());

            System.out.println("Atendendo senha: " + senhas.poll());

            if (!senhas.isEmpty()){
                System.out.println("Fila restante: " + senhas);
                System.out.println();
            }
        }

        System.out.println("Não existem mais senhas.");
    }
}
