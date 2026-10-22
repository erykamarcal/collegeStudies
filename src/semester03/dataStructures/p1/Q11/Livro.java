package semester03.dataStructures.p1.Q11;

public class Livro {
    int codigo;
    String titulo;
    String autor;
    boolean emprestado = false;

    Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }
}
