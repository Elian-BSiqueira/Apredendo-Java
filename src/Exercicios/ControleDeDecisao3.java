package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeDecisao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double media = 0;
        boolean controleDeLoop = true;

        while (controleDeLoop) {
            System.out.print("Digite sua media para saber se esta aprovado: ");
            try {
                media = scan.nextInt();
                if (media > 0) {
                    controleDeLoop = false;
                } else {
                    System.out.println("Media nao pode ser menor que 0");
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("DIGITE UM NUMERO INTEIRO");
            }
        }

        if (media >= 60) {
            System.out.println("Parabens, voce esta aprovado");
        } else {
            System.out.println("Voce esta Reprovado");
        }
    }
}
