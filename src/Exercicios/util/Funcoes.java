package Exercicios.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcoes {
    public static int VerificarNumero(String texto) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        int numero = 0;

        while (controleDeLoop) {
            System.out.print(texto);
            try {
                numero = scan.nextInt();
                controleDeLoop = false;

            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Entrada invalida. Digite um numero");
            }

        }
        return numero;
    }

    public static double Verificarnumero(String texto) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        double numero = 0;

        while (controleDeLoop) {
            System.out.print(texto);
            try {
                numero = scan.nextDouble();
                controleDeLoop = false;

            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Entrada invalida. Digite um numero");
            }

        }
        return numero;
    }
}
