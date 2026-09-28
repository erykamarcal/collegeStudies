package collegeStudies.semester03.dataStructures.ADO01;

public class Exercise08 {
    public static void main(String[] args) {

        int[] numeros = {100, 200, 300, 400, 500};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("Soma = " + soma);
    }
}

