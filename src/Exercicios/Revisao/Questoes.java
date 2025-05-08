package Exercicios.Revisao;

import java.util.Scanner;

public class Questoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1. Desenvolva um programa que imprima todos os números pares de 1 a 100 utilizando um loop for.
        // Em seguida, faça o mesmo usando um loop while.
        /*for (int i = 0; i <= 100; i+=2) {
            System.out.println(i);

        }*/

        /*int numero = 0;
        while (numero <= 100) {
            System.out.println(numero);
            numero += 2;
        }*/

        // 2. Crie um programa que solicite ao usuário três números e imprima o maior e o menor deles.
        // Se todos forem iguais, o programa deve informar que os números são iguais.
        /*System.out.print("Digite um numero inteiro: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite mais um numero inteiro: ");
        int numero2 = scan.nextInt();
        System.out.print("Digite mais um numero inteiro: ");
        int numero3 = scan.nextInt();
        int maiorNumero = numero1;
        int menorNumero = numero1;

        if (numero2 < menorNumero) {
            menorNumero = numero2;
        }
        if (numero3 < menorNumero) {
            menorNumero = numero3;
        }

        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }
        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Todos os numeros informados sao iguais");
        }

        System.out.printf("O maior numero digitado e %d e o menor e %d ", maiorNumero, menorNumero);*/

        //3. Escreva um programa que leia 5 números inteiros do usuário e armazene-os em um array.
        // Em seguida, exiba o array na ordem inversa.
        /*int numero = 0;
        int[] numeros = new int[5];
        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite o %d numero: ", i);
            numero = scan.nextInt();
            numeros[i-1] = numero;
        }
        for (int i = numeros.length - 1 ; i >= 0; i--) {
            System.out.println(numeros[i]);
        }*/

        //4. Crie um programa que leia 10 números inteiros e os armazene em um array.
        // Depois, percorra o array e exiba apenas os números que são maiores que a média dos valores inseridos.
        /*int numero = 0;
        int soma = 0;
        int[] numeros = new int[10];
        for (int i = 1; i < 11; i++) {
            System.out.printf("Digite o %d numero: ", i);
            numero = scan.nextInt();
            soma += numero;
            numeros[i-1] = numero;
        }


        float media = soma / numeros.length;
        System.out.printf("Media dos numeros digitados: %.1f %n", media);
        System.out.println("Numeros maiores que a media: ");
        for (int num : numeros) {
            if (num > media) {
                System.out.println(num);
            }
        }*/

        /*5. Crie um programa que leia 5 números inteiros e armazene-os em um array.
         * Em seguida, copie os elementos desse array para um segundo array, mas na ordem inversa,
         * e exiba os elementos do segundo array.
         */









    }
}
