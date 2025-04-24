package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeDecisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Exercicio 1
        int numero = 0;
        boolean controleDeLoop = true;

        while (controleDeLoop) {
            System.out.print("Digite um numero para saber se é impar ou par: ");
            try {
                numero = scan.nextInt();
                controleDeLoop = false;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("DIGITE UM NUMERO INTEIRO");
            }
        }

        if (numero % 2 == 0) {
            System.out.printf("O numero %d e par", numero);
        } else {
            System.out.printf("O numero %d e impar", numero);
        }

    }
}
