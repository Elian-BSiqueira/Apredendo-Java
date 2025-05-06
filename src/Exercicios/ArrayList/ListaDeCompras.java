package Exercicios.ArrayList;

import Exercicios.util.Funcoes;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = """
                1) Adicionar item
                2) Remover item
                3) Exibir itens
                4) Limpar lista
                """;
        System.out.println("Lista de compras");
        System.out.println("=".repeat(30));

        ArrayList<String> compras = new ArrayList<>();
        int opcao = -1;
        while (true) {
            System.out.println(menu);
            opcao = Funcoes.VerificarInteiroComIntervalo("Digite sua opcao: ", 1, 4);
            scan.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o produto: ");
                    String produto = scan.nextLine().toLowerCase();
                    boolean adicionado = compras.add(produto);
                    if (adicionado) {
                        System.out.printf("%s adicionado a lista %n", produto);
                    } else {
                        System.out.printf("Erro ao tentar adicionar %s %n", produto);
                    }
                    break;
                case 2:
                    if (compras.size() == 0) {
                        System.out.println("Não há produtos na lista");
                    } else {
                        for (String compra : compras) {
                            System.out.println(compra);
                        }
                    }

                    System.out.print("Digite o produto que quer remover: ");
                    String removerProduto = scan.nextLine().toLowerCase();
                    compras.remove(removerProduto);
                    if (compras.remove(removerProduto)) {
                        System.out.printf("Produto %s removido %n", removerProduto);
                    } else {
                        System.out.printf("Produto %s não encontrado na lista %n", removerProduto);
                    }
                    break;
                case 3:
                    if (compras.size() == 0) {
                        System.out.println("Não há produtos na lista");
                    } else {
                        for (String compra : compras) {
                            System.out.println(compra);
                        }
                    }
                    break;
                case 4:
                    compras.clear();
                    System.out.println("Lista de compras limpa");
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        }
    }
}
