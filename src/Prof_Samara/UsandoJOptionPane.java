package Prof_Samara;

import javax.swing.*;

public class UsandoJOptionPane {
    public static void main(String[] args) {
        /*int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
        switch (resposta) {
            case 0:
                System.out.println("Voce deu permissão para vender sua alma. Obrigado por confia-la em nós");
                break;
            case 1:
                System.out.println("Voce perdeu a oportunidade de uma vida. Mas tudo bem");
                break;
            case 2:
                System.out.println("Voce cancelou");
                break;

        }*/

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        String perguntaNumero;

        while (true) {
            perguntaNumero = JOptionPane.showInputDialog("Digite um numero: ");
            try {
                numero1 = Integer.parseInt(perguntaNumero);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, digite um numero inteiro");
            }
        }
        while (true) {
            perguntaNumero = JOptionPane.showInputDialog("Digite um numero: ");

            try {
                numero2 = Integer.parseInt(perguntaNumero);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, digite um numero inteiro");
            }
        }
        while (true) {
            perguntaNumero = JOptionPane.showInputDialog("Digite um numero: ");

            try {
                numero3 = Integer.parseInt(perguntaNumero);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, digite um numero inteiro");
            }
        }
        int soma = numero1 + numero2 + numero3;
        double media = soma / 3;
        int produto = numero1 * numero2 * numero3;
        String mensagem = String.format("""
                Numeros digitados: %d, %d e %d %n
                Soma    = %d %n
                Media   = %.1f %n
                Produto = %d
                """, numero1, numero2, numero3, soma, media, produto);


        JOptionPane.showMessageDialog(null, mensagem);

        /*JOptionPane.showMessageDialog(null, "Calculo de imc");
        String perguntar = JOptionPane.showInputDialog("Digite sua altura: ");
        double altura = Double.parseDouble(perguntar);
        perguntar = JOptionPane.showInputDialog("Digite seu peso em Kg: ");
        double peso = Double.parseDouble(perguntar);
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, imc);*/
    }
}
