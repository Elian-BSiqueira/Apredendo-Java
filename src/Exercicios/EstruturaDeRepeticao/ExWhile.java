package Exercicios.EstruturaDeRepeticao;

import Exercicios.util.Funcoes;

import java.util.Scanner;

public class ExWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        //Exercicio 1 - Escreva um programa que imprima todos os números pares de 2 a 20.
        /*int contador = 0;
        while (contador <= 20){
            contador ++;
            if (contador % 2 == 0) {
                System.out.println(contador);
            }

        }*/

        //Exercicio 2 - Escreva um programa que some todos os números ímpares de 1 a 50 e exiba o resultado.
        /*int contador = 1;
        int acumulador = 0;
        while (contador < 50) {
            acumulador += contador;
            System.out.println(contador);
            contador += 2;
        }*/

        //Exercicio 3 - Escreva um programa que faça uma contagem regressiva de 10 até 1, exibindo cada número na tela.
        /*int contador = 10;
        while (contador != -1) {
            System.out.println(contador);
            contador --;
        }*/

        /*Exercicio 4 - Escreva um programa que peça ao usuário para inserir números positivos.
        O programa deve somar esses números e continuar pedindo até que o usuário insira um número negativo.
        No final, exiba a soma total dos números positivos inseridos.*/

        /*int acumulador = 0;
        int numero = 0;
        do {
            System.out.print("Digite numeros positivos para somar: ");
            numero = scan.nextInt();
            if (numero >= 0) {
                acumulador += numero;
            }

        } while (numero >= 0);
        System.out.println(acumulador);*/

        /*Exercicio 5 - Crie um programa que peça ao usuário para inserir um número inteiro.
        O programa deve gerar e exibir a tabuada (de 1 a 10) desse número.
        O programa deve continuar pedindo números até que o usuário insira um número zero para sair.*/

        /*int numero;
        do {
            System.out.print("Digite um numero para ver sua tabuada. Digite 0 para sair: ");
            numero = scan.nextInt();
            if (numero > 0){

                for (int i = 1; i <= numero; i++) {
                    System.out.printf("%d x %d = %d %n", numero, i, numero * i);
                }
            }

        } while (numero > 0);*/

        //Exercicio 6 - Escreva um programa que imprime "Olá, Mundo!"
        // uma vez e continua a perguntar ao usuário se deseja imprimir novamente

        /*int opcao;
        do {
            System.out.println("Ola, mundo");
            System.out.println("""
                    1) Continuar imprimindo a mensagem
                    2) Parar de imprimir a mensagem
                    """);
            System.out.print("Digite sua opção: ");
            opcao = scan.nextInt();

        } while (opcao != 2);*/

        // Exercicio 7 - Solicite ao usuário um número e multiplique-o por 2. Pergunte se o usuário deseja repetir
        // a operação com o resultado obtido até que o usuário escolha parar.

        /*int opcao;
        int numero = 0;
        int dobrado = 0;
        System.out.println("Dobrar numero");
        numero = Funcoes.VerificarNumeroInt("Digite um numero para dobrar: ");
        do {
            dobrado = numero * 2;
            numero = dobrado;
            System.out.printf("%d x 2 = %d %n", numero, dobrado);

            System.out.println("""
                    1) Continuar dobrando
                    2) Sair
                    """);
            System.out.print("Digite sua opção: ");
            opcao = Funcoes.VerificarInteiroComIntervalo("Digite sua opcao: ", 1, 2);

        } while (opcao != 2);*/

        /* Exercicio 8 -Peça ao usuário para digitar um nome e exiba-o.
        Pergunte se o usuário deseja digitar outro nome até que ele escolha parar.
        */
        /*int opcao = 0;
        String nome;
        do {
            System.out.print("Digite um nome: ");
            nome = scan.nextLine();
            System.out.printf("Ola %s %n", nome);
            System.out.println("""
                    1) Digitar outro nome
                    2) Sair
                    """);
            System.out.print("Digite sua opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

        } while (opcao != 2);*/



        /* Exercicio 9 - Escreva um programa que peça ao usuário um número inteiro positivo N e use um laço do-while
        para imprimir todos os números de 1 até N. */
        int numero = -1;
        do {
            System.out.print("\nDigite um numero para contagem. Digite 0 para encerrar: ");
            numero = scan.nextInt();
            if (numero > 0) {
                for (int i = 1; i <= numero ; i++) {
                    System.out.print(" " + i);
                }
            } else if (numero < 0) {
                for (int i = numero; i < 0 ; i++) {
                    System.out.print(" " + i);
                }
            }


        } while (numero != 0);


    }
}
