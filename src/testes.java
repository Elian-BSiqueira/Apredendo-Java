public class testes {
    static double calculoDeMedia(double... notas) {
        double soma = 0;
        double media = 0;
        int tamanho = notas.length;
        for (double nota : notas) {
            soma += nota;
        }
        media = soma / tamanho;
        return media;
    }



    public static void main(String[] args) {
        double resultado = calculoDeMedia(3, 3, 3, 3, 3);
        System.out.println(resultado);

    }
}
