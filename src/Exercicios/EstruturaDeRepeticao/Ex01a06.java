package Exercicios.EstruturaDeRepeticao;

import Exercicios.util.Funcoes;

public class Ex01a06 {
    public static void main(String[] args) {
        // Exercicio 1

        /*for (int i = 1; i < 6 ; i++) {
            System.out.println(" " + i);
        }*/

        // Exercicio 2
        /*int soma = 0;
        for (int i = 0; i < 11; i++) {
            soma += i;
        }
        System.out.println("A soma de 1 a 10 é " + soma);*/

        //Exercicio 3
        /*int[] numeros = {1, 2, 3};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/

        /*for (int num : numeros) {
            System.out.println(num);
        }*/

        //Exercicio 4
        /*for (int i = 5; i >= 0 ; i--) {
            System.out.println(i);
        }*/

        //Exercicio 5 - tabuada

        /*int numero = Funcoes.VerificarNumero("Digite um numero inteiro para ver sua tabuada: ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d %n", numero, i, numero * i);
        }*/

        //Exercicio 6
        /*for (int i = 2; i <= 10 ; i+=2) {
            System.out.println(i);
        }*/

        //Exercicio 7 - fatorial
        /*int numero = Funcoes.VerificarNumero("Digite um numero inteiro para ver seu fatorial: ");
        int fatorial = 1;
        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;
        }
        System.out.printf("%d! = %d", numero, fatorial);*/

        //Exercicio 8 - maior numero
        int[] numeros = {3, 7, 3, 43, 6, 100, 2, 5};
        int maiorNumero = numeros[0];
        for (int num : numeros) {
            if (num > maiorNumero) {
                maiorNumero = num;
            } else {
                {};
            }
        }
        System.out.println("Maior numero " + maiorNumero);

        // Exercicio 9 -



    }
}
