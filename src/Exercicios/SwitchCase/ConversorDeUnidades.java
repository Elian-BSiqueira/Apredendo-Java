package Exercicios.SwitchCase;

import Exercicios.util.Funcoes;

import java.util.Scanner;

public class ConversorDeUnidades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = """
                1 - Metros para Quilômetros
                2 - Quilômetros para metros
                3 - Litros para mililitros
                4 - Mililitros para litros
                5 - Sair
                
                """;

        int opcao = -1;
        String textoDeConversao = "";
        double medidaConvertida = 0;
        do {
            System.out.println(menu);
            opcao = Funcoes.VerificarInteiroComIntervalo("Digite a opcao desejada: ", 1, 5);
            double medida = 0;
            if (opcao >= 1 && opcao < 5) {
                do {
                    medida = Funcoes.VerificarNumeroDouble("Digite a medida a ser convertida: ");
                } while (medida < 0);
            }
            switch (opcao) {
                case 1:
                    textoDeConversao = "Metros para Quilômetros";
                    medidaConvertida = medida / 1000;
                    break;
                case 2:
                    textoDeConversao = "Quilômetros para metros";
                    medidaConvertida = medida * 1000;
                    break;
                case 3:
                    textoDeConversao = "Litros para mililitros";
                    medidaConvertida = medida * 1000;
                    break;
                case 4:
                    textoDeConversao = "Mililitros para litros";
                    medidaConvertida = medida / 1000;
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
            if (opcao != 5) {
                System.out.printf("Convertendo %.2f de %s " +
                        "corresponde a %.2f %n", medida, textoDeConversao, medidaConvertida);
            }


        } while (opcao != 5);
    }
}