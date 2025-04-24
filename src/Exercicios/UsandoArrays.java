package Exercicios;

public class UsandoArrays {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        // Exercicio 1
        System.out.println(numeros[1]);
        System.out.println(numeros[3]);
        System.out.println("=".repeat(30));

        // Exercicio 2
        numeros[2] = 100;
        System.out.println(numeros[2]);
        System.out.println("=".repeat(30));


        //Exercicio 3
        int[] numerosInteiros = {3, 6, 9, 12, 15};
        System.out.println(numerosInteiros[0] + numerosInteiros[4]);
        System.out.println("=".repeat(30));


        // Nao e exercicio

        for(int num : numerosInteiros) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        //Exercicio 4
        if (numerosInteiros[0] == numerosInteiros[4]) {
            System.out.println("O primeiro e ultimo numeros da lista sao iguais");
        } else {
            System.out.println("O primeiro e ultimo numeros da lista sao diferentes");
        }
        System.out.println("=".repeat(30));


        //Exercicio 5
        System.out.println(numerosInteiros[1] - numerosInteiros[2]);
        System.out.println("=".repeat(30));

    }
}
