package Exercicios.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Media {
    public static void main(String[] args) {
        ArrayList<Float> media = new ArrayList<>();
        int quantidadeDeNotas = 0;
        boolean controleDeLoop = true;

        do {
            String resposta = JOptionPane.showInputDialog("Calculo de media, quantas notas para calcular? ");
            if (resposta == null) {
                break;
            } else {
                try {
                    quantidadeDeNotas = Integer.parseInt(resposta);

                    if (quantidadeDeNotas < 0) {
                        JOptionPane.showMessageDialog(null, "Quantidade de notas não pode ser menor que 0");
                    } else {
                        controleDeLoop = false;
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um numero");
                }
            }
        } while (controleDeLoop);

        float nota = 0;
        controleDeLoop = true;
        for (int i = 1; i <= quantidadeDeNotas ; i++) {

            while (controleDeLoop) {
                String perguntaNota = String.format("Digite a %dº nota", i);
                String resposta = JOptionPane.showInputDialog(perguntaNota);
                if (resposta == null) {
                    break;
                } else {
                    try {
                        nota = Float.parseFloat(resposta);

                        if (nota < 0) {
                            JOptionPane.showMessageDialog(null, "Nota não pode ser menor que 0");
                        } else if (nota >= 0) {
                            controleDeLoop = false;
                        }

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Digite um numero");
                    }
                }
            }
            controleDeLoop = true;

            media.add(nota);
        }

        float somaDasNotas = 0;

        for (float notas : media) {
            somaDasNotas += notas;
        }

        float mediaTotal = somaDasNotas / media.size();
        mediaTotal = (Math.round((mediaTotal * 100))) / 100;
        String mensagemDeMedia = "Notas digitadas \n" + media + "\n" + mediaTotal;
        JOptionPane.showMessageDialog(null, mensagemDeMedia);



    }
}
