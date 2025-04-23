package Prof_Samara;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeDecisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Exercicio 1
        /*int numero1 = 0;
        boolean controleDeLoop = true;

        while (controleDeLoop) {
            System.out.print("Digite um numero para saber se impar ou par: ");
            try {
                numero1 = scan.nextInt();
                controleDeLoop = false;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("DIGITE UM NUMERO INTEIRO");
            }
        }

        if (numero % 2 == 0) {
            System.out.printf("O numero %d e par", numero1);
        } else {
            System.out.printf("O numero %d e impar", numero1);
        }*/

        //Exercicio 2
        /*controleDeLoop = true;
        int numero2 = 0;*/
        // Bloco while nao faz parte do exercicio
        /*while (controleDeLoop) {
            System.out.print("Digite um numero para saber se impar ou par: ");
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
        }*/

        //Exercicio 3
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
