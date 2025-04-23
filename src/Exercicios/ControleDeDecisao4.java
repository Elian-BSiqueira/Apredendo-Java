package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeDecisao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        int media = 0;

        boolean alunoBolsista = false;

        while (controleDeLoop) {
            System.out.print("Digite a media final: ");
            try {
                media = scan.nextInt();
                if (media > 0) {
                    controleDeLoop = false;
                } else {
                    System.out.println("Media nao pode ser menor que 0");
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Media invalida. Digite um numero inteiro");
            }
        }
        if (alunoBolsista && media >= 70) {
            System.out.println("Aprovado com bolsa mantida");
        } else if (alunoBolsista && media < 70) {
            System.out.println("Reprovado e bolsa cancelada");
        } else if (!alunoBolsista && media >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
