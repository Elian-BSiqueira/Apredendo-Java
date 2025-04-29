package Exercicios.ControleDeDecisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeDecisao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        int numero2 = 0;
        int numero1 = 0;

        // Bloco while nao faz parte do exercicio
        while (controleDeLoop) {
            System.out.print("Digite o primeiro numero: ");
            try {
                numero1 = scan.nextInt();
                controleDeLoop = false;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("DIGITE UM NUMERO INTEIRO");
            }
        }

        controleDeLoop = true;
        while (controleDeLoop) {
            System.out.print("Digite o segundo numero: ");
            try {
                numero2 = scan.nextInt();
                controleDeLoop = false;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("DIGITE UM NUMERO INTEIRO");
            }
        }

        if (numero1 > numero2) {
            System.out.printf("O numero %d e maior que %d", numero1, numero2);
        } else if (numero1 == numero2) {
            System.out.printf("Os numeros sao iguais, %d e %d", numero1, numero2);
        } else {
            System.out.printf("O numero %d e menor que %d", numero1, numero2);
        }

        scan.close();
    }
}
