package Exercicios;

import java.util.Scanner;

public class UtilizandoScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Exercicio 1

        /*System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite sua cidade natal: ");
        String cidade = scan.nextLine();
        System.out.printf("Meu nome é %s e tenho %d anos, sou de %s", nome, idade, cidade);*/

        // Exercicio 2

        /*System.out.print("Digite o 1º numero: ");
        double numero1 = scan.nextDouble();
        System.out.print("Digite o 2º numero: ");
        double numero2 = scan.nextDouble();
        System.out.print("Digite o 3º numero: ");
        double numero3 = scan.nextDouble();
        double soma = numero1 + numero2 + numero3;
        double media = soma / 3;
        double produto = numero1 * numero2 * numero3;
        System.out.printf("Números digitados: %.1f, %.1f, %.1f %n", numero1, numero2, numero3);
        System.out.printf("A soma dos números é igual a %.1f %n", soma);
        System.out.printf("A media dos números é igual a %.1f %n", media);
        System.out.printf("O produto dos números é igual a %.1f", produto);*/

        // Exercicio 3

        /*System.out.println("----------Calculo de IMC----------");
        System.out.print("Digite sua altura em metros: ");
        double altura = scan.nextDouble();
        System.out.print("Digite seu peso em Kg: ");
        double peso = scan.nextDouble();
        double imc = peso / (Math.pow(altura, 2));
        System.out.printf("Seu IMC é igual a %.2f %n", imc);
        String situacao;
        if (imc < 18.5) {
            situacao = "desnutrido";
        } else if (18.5 < imc && imc <= 24.9) {
            situacao = "normal";
        } else if (25 < imc && imc < 29.9) {
            situacao = "sobrepeso";
        } else if (30 <= imc && imc <= 39.9) {
            situacao = "obesidade";
        } else if (imc > 40) {
            situacao = "obesidade Grave";
        } else {
            situacao = "Imc invalido, dados fornecidos invalidos";
        }

        System.out.printf("Sua situação é %s", situacao);*/

        scan.close();
    }
}
