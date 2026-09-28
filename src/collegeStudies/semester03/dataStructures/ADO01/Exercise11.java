package collegeStudies.semester03.dataStructures.ADO01;

public class Exercise11 {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 15, 16, 23, 42};
        int procurado = 16;

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == procurado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado!");
        }
    }
}