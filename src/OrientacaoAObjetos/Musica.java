package OrientacaoAObjetos;
// Alt + insert para adicionar getter e setter
public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    int avaliacao;
    int numeroDeAvaliacoes;

    String fichaTecnica() {
        String ficha = String.format("""
                Musica:      %s
                Artista:     %s
                Lancada em:  %d
                """, titulo, artista, anoDeLancamento);

        return ficha;
    }

    String avaliar(double... notas) {
        double somaDasNotas = 0;
        for (double nota : notas) {
            somaDasNotas += nota;
            numeroDeAvaliacoes++;
        }
        double mediaDasAvaliacoes = somaDasNotas / numeroDeAvaliacoes;
        return String.format("Media das avaliacoes: %.1f", mediaDasAvaliacoes);
    }



}

