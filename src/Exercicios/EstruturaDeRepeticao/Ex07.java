package Exercicios.EstruturaDeRepeticao;

import Exercicios.util.Funcoes;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Exercicio 1
        /*int[] numeros = {10, 20, 30, 40, 50};
        for (int num : numeros) {
            System.out.print(" " + num);
        }*/

        //Exercicio 2
        /*String[] palavras = {"casa", "carro", "avião", "ônibus", "barco"};
        int contador = 0;
        for (String palavra : palavras) {
            if (palavra.length() > 4) {
                contador ++;
            }
        }

        System.out.println("Palavras com mais de 4 letras é " + contador);*/

        //Exercicio 3
        int verificarNumero = Funcoes.VerificarNumero("Digite um numero para verificar se ele esta na lista: ");
        int[] numeros = {3, 7, 11, 12, 25};
        int contador = 0;
        for (int num : numeros) {
            if (num == verificarNumero) {
                contador ++;
            }
        }
        System.out.printf("O numero %d foi encontrado %d vez", verificarNumero, contador);


        //Exercicio 4
        /*String[] palavras = {"Java", "python", "Ruby"};
        for (String palavra : palavras) {
            System.out.println(palavra.toUpperCase());
        }*/

    }

}
