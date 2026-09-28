package collegeStudies.semester03.dataStructures.ADO01;

public class Exercise21_Fila {

    private int[] elementos;
    private int inicio;
    private int fim;

    public Exercise21_Fila(int tamanho) {
        elementos = new int[tamanho];
        inicio = 0;
        fim = 0;
    }

    public void enfileirar(int valor) {
        elementos[fim] = valor;
        fim++;
    }

    public int desenfileirar() {
        int valor = elementos[inicio];
        inicio++;
        return valor;
    }

    public boolean estaVazia() {
        return inicio == fim;
    }
}