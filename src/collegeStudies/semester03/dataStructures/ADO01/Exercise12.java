package collegeStudies.semester03.dataStructures.ADO01;

public class Exercise12 {
    public static void main(String[] args) {

        double[] precos = {29.90, 45.50, 12.99, 89.90, 35.00};
        double total = 0;
        double maior = precos[0];

        System.out.println("Preços dos produtos: ");

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%.2f%n", precos[i]);

            total += precos[i];

            if (precos[i] > maior) {
                maior = precos[i];
            }
        }

        double media = total / precos.length;

        System.out.printf("%nValor total: %.2f%n", total);
        System.out.printf("Preço médio: %.2f%n", media);
        System.out.printf("Maior preço: %.2f%n", maior);
    }
}
