package OrientacaoAObjetos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FuncoesGereciamentoComPOO {
    static HashMap<Autor, ArrayList<Livro>> biblioteca = new HashMap<>();

    private static boolean contemAutor(String nome) {
        return biblioteca.stream().anyMatch(autor -> autor.getNome().equalsIgnoreCase(nome));
    }

    public static void AdicionarLivro(String nome, Autor autor, int anoDePublicacao) {
        autor.adicionarLivro(new Livro(nome, autor, anoDePublicacao));
    }

    public static void CriarAutor(String nome) {
        if (contemAutor(nome)) {
            System.out.println("Autor ja esta na biblioteca");
        } else {
            Autor autor = new Autor(nome);
        }
    }


}
