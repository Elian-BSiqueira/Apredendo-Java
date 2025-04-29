package Exercicios.ControleDeDecisao;

import javax.swing.*;
import java.util.Scanner;

public class ControleDeDecisao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        int media = -1;
        boolean alunoBolsista = false;
        int resposta = JOptionPane.showConfirmDialog(null, "Aluno é bolsista? ");
        if (resposta == 0) {
            alunoBolsista = true;
        } else if (resposta == 1){
            {};
        } else {
            JOptionPane.showMessageDialog(null, "Programa cancelado");
        }

        if (resposta != 2) {
            while (controleDeLoop) {
                String mediaTexto = JOptionPane.showInputDialog("Digite a media final: ");
                if (mediaTexto == null) {
                    break;
                } else {
                    try {
                        media = Integer.parseInt(mediaTexto);
                        if (media > 0) {
                            controleDeLoop = false;
                        } else {
                            JOptionPane.showMessageDialog(null, "Media não pode ser menor que 0");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Media invalida. Digite um numero inteiro");
                        continue;
                    }
                }

            }
            if (media == -1) {
                JOptionPane.showMessageDialog(null, "Programa encerrado");
            } else {
                if (alunoBolsista && media >= 70) {
                    JOptionPane.showMessageDialog(null, "Aprovado com bolsa mantida");
                } else if (alunoBolsista && media < 70) {
                    JOptionPane.showMessageDialog(null, "Reprovado e bolsa cancelada");
                } else if (!alunoBolsista && media >= 60) {
                    JOptionPane.showMessageDialog(null, "Aprovado");
                } else if (!alunoBolsista && media < 60){
                    JOptionPane.showMessageDialog(null, "Reprovado");
            }

            }
            }

        }


    }
