package Exercicios.SwitchCase;

import Exercicios.util.Funcoes;

import java.text.DecimalFormat;
import java.text.Normalizer;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.##########");
        Scanner scan = new Scanner(System.in);
        String menu = """
                1 - Adicao
                2 - Subtracao
                3 - Multiplicacao
                4 - Divisao
                5 - Sair
                
                """;
        int opcao = -1;
        do {
            System.out.println(menu);
            opcao = Funcoes.VerificarInteiroComIntervalo("Digite a opcao desejada: ", 1, 5);
            double numero1 = 0;
            double numero2 = 0;
            if (opcao >= 1 && opcao < 5) {
                numero1 =Funcoes.VerificarNumeroDouble("Digite o primeiro numero: ");
                numero2 = Funcoes.VerificarNumeroDouble("Digite o segundo numero: ");
            }
            String num1 = formatador.format(numero1);
            String num2 = formatador.format(numero2);
            switch (opcao) {


                case 1:
                    System.out.printf("%s + %s = %s %n", num1, num2, formatador.format(numero1 + numero2));
                    break;
                case 2:
                    System.out.printf("%s - %s = %s %n", num1, num2, formatador.format(numero1 - numero2));
                    break;
                case 3:
                    System.out.printf("%s x %s = %s %n", num1, num2, formatador.format(numero1 * numero2));
                    break;
                case 4:
                    System.out.printf("%s / %s = %s %n", num1, num2, formatador.format(numero1 / numero2));
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 5);

    }
}
