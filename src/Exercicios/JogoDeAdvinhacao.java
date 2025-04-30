package Exercicios;

import Exercicios.util.Funcoes;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int numeroGerado = random.nextInt(21);
        int palpite;
        int contador = 1;
        System.out.println("Jogo da advinhacao. O sistema gerou um numero inteiro aleatorio entre 1 e 20. Tente " +
                "advinhar");
        System.out.println("=".repeat(50));
        do {
            String texto = String.format("Digite seu %d palpite: ", contador);
            palpite = Funcoes.VerificarNumeroInt(texto);
            if (palpite != numeroGerado) {
                System.out.print("Palpite errado. ");
                if (palpite > numeroGerado) {
                    System.out.println("O numero gerado e menor");
                } else {
                    System.out.println("O numero gerado pelo sistema e maior");
                }
                contador ++;
            }


        } while (palpite != numeroGerado);

        System.out.printf("Parabens, voce acertou com %d tentativas", contador);
    }
}
