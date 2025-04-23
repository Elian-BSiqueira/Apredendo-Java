package Prof_Samara;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeDecisao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        int media = 0;
        boolean entregouTodosTrabalhos = false;

        int resposta = JOptionPane.showConfirmDialog(null,"O aluno entregou todos os trabalhos? ");
        if (resposta == 0) {
            entregouTodosTrabalhos = true;
        } else {
            {}
        }


        while (controleDeLoop) {
            System.out.print("Digite a media final: ");
            try {
                media = scan.nextInt();
                if (media > 0) {
                    controleDeLoop = false;
                } else {
                    System.out.println("Media nao pode ser menor que 0");
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Media invalida. Digite um numero inteiro");
            }
        }
        if (entregouTodosTrabalhos && media >= 90) {
            System.out.println("Desempeno excelente");
        } else if (entregouTodosTrabalhos && media >= 70 && media <= 89) {
            System.out.println("Desempenho Bom");
        } else if (!entregouTodosTrabalhos && media >= 50 && media <= 69) {
            System.out.println("Desempenho satisfatorio");
        } else {
            System.out.println("Desempenho insuficiente");
        }
    }
}
