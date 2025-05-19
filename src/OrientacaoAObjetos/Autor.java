import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private ArrayList<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (!livros.contains(livro)) {
            livros.add(livro);
        }
    }

}
