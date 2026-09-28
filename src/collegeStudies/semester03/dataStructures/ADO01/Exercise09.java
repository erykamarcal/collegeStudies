package collegeStudies.semester03.dataStructures.ADO01;

public class Exercise09 {
    public static void main(String[] args) {

        int[] numeros = {15, 8, 32, 4, 27};
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior valor: " + maior);
    }
}


