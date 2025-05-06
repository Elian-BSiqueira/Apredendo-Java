package Exercicios.SwitchCase;

import java.util.Scanner;
import Exercicios.util.Funcoes;

public class DiaDaSemana {
    public static void main(String[] args) {
        // Programa Java que receba um número de 1 a 7 e imprima o nome do dia da semana correspondente.

        Scanner scan = new Scanner(System.in);
        int dia = Funcoes.VerificarNumeroInt("Digte um numero para ver o dia: ");
        double ciclosSemanais = dia / 7;
        ciclosSemanais = Math.floor(ciclosSemanais);
        dia %= 7;


        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terca-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-Feira";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = "Dia invalido";
                break;
        }
        String mensagem = String.format("Comecando a semana com domingo. Se passaram %.0f semanas e esta no dia %d," +
                        " que corresponde a %s", ciclosSemanais, dia, nomeDia);
        System.out.println(mensagem);
    }
}
