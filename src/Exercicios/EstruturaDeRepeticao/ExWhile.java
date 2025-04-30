package Exercicios.EstruturaDeRepeticao;

import java.util.Scanner;

public class ExWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        //Exercicio 1
        /*int contador = 0;
        while (contador <= 20){
            contador ++;
            if (contador % 2 == 0) {
                System.out.println(contador);
            }

        }*/

        //Exercicio 2
        /*int contador = 1;
        int acumulador = 0;
        while (contador < 50) {
            acumulador += contador;
            System.out.println(contador);
            contador += 2;
        }*/

        //Exercicio 3
        /*int contador = 10;
        while (contador != -1) {
            System.out.println(contador);
            contador --;
        }*/

        //Exercicio 4
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

        //Exercicio 5
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

        //Exercicio 6
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

        // Exercicio 7
        int opcao;
        do {
            System.out.println("Ola, mundo");
            System.out.println("""
                    1) Continuar dobrando
                    2) Parar de imprimir a mensagem
                    """);
            System.out.print("Digite sua opção: ");
            opcao = scan.nextInt();

        } while (opcao != 2);



    }
}
