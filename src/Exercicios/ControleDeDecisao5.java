package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeDecisao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double preco = 0;
        boolean controleDeLoop = true;
        double desconto;

        while (controleDeLoop) {
            System.out.print("Digite o preco do produto para saber seu desconto: ");
            try {
                preco = scan.nextDouble();
                if (preco > 0) {
                    controleDeLoop = false;
                } else {
                    System.out.println("Preco nao pode ser negativo");
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Entrada invalida. Digite um preco valido");
            }
        }

        if (preco >= 1000) {
            desconto = 20;
        } else if (500 < preco && preco < 999) {
            desconto = 10;
        } else if (100 < preco && preco < 499) {
            desconto = 5;
        } else {
            desconto = 0;
        }

        double precoFinal = preco;


        if (desconto > 0) {
            System.out.printf("Produto de R$%.2f recebe o desconto de %.1f%% %n", preco, desconto);
            desconto /= 100;
            precoFinal = preco * (1-desconto);
            System.out.printf("E fica por R$%.2f", precoFinal);
        } else {
            System.out.printf("O produto de R$%.2f nao tem desconto", precoFinal);
        }



    }
}
