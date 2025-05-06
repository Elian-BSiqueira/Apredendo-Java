package Exercicios.SwitchCase;

import java.util.Scanner;

public class NivelDeEscolaridade {
    public static void main(String[] args) {
        // Crie um programa Java que receba um código de nível de escolaridade e imprima o nível correspondente
        Scanner scan = new Scanner(System.in);
        String menu = """
                a - Ensino Fundamental
                b - Ensino Médio
                c - Graduação
                d - Pós-Graduação
                e - Doutorado
                
                """;
        String grauDeEscolaridade;
        String nivel = "a";
        do {
            System.out.println(menu);
            System.out.print("Digite o codigo do seu grau de escolaridade: ");
            nivel = scan.nextLine();

            switch (nivel) {
                case "a":
                    grauDeEscolaridade = "Ensino Fundamental";
                    break;
                case "b":
                    grauDeEscolaridade = "Ensino Médio";
                    break;
                case "c":
                    grauDeEscolaridade = "Graduação";
                    break;
                case "d":
                    grauDeEscolaridade = "Pós-Graduação";
                    break;
                case "e":
                    grauDeEscolaridade = "Doutorado";
                    break;
                default:
                    grauDeEscolaridade = "Codigo invalido";
                    System.out.println("Codigo invalido");
            }
        } while (grauDeEscolaridade.equals("Codigo invalido"));

        System.out.printf("Seu grau de escolaridade e %s ",grauDeEscolaridade);
    }
}
