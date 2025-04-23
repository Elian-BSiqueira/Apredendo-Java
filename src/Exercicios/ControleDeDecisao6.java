package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeDecisao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        float temperatura = 0;

        while (controleDeLoop) {
            System.out.print("Digite a temperatura em celsius: ");
            try {
                temperatura = scan.nextFloat();
                controleDeLoop = false;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Entrada invalida. Digite numeros.");
            }
        }

        if (temperatura >= 40) {
            System.out.println("Extremamente quente");
        } else if (temperatura >= 30 && temperatura <= 39) {
            System.out.println("Quente");
        } else if (temperatura >= 20 && temperatura <= 29) {
            System.out.println("Agradavel");
        } else if (temperatura >= 10 && temperatura <= 19) {
            System.out.println("Frio");
        } else {
            System.out.println("Muito frio");
        }


    }
}
