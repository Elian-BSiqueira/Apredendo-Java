package Exercicios.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d %n", numero, i, numero * i);
        }
    }
}
