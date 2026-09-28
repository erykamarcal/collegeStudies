package collegeStudies.semester03.dataStructures.ADO01;

import java.util.Locale;

public class Exercise10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double[] notas = {7.5, 8.0, 6.5, 9.0, 8.5};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("Média da turma: %.1f%n", media);
    }
}

