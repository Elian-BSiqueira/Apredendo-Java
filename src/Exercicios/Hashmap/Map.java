package Exercicios.Hashmap;

import Exercicios.util.Funcoes;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = """
                1) Adicionar produto
                2) Remover produto
                3) Atualizar quantidade de um produto
                4) Listar estoque
                5) Limpar tudo
                """;
        System.out.println("Estoque de produtos");
        System.out.println("=".repeat(30));

        HashMap<String, Integer> estoque = new HashMap<String, Integer>();

        int opcao = -1;
        while (true) {
            System.out.println(menu);

            opcao = Funcoes.VerificarInteiroComIntervalo("Digite sua opcao: ", 1, 5);
            switch (opcao) {
                case 1:
                    System.out.print("Digite o produto: ");
                    String produto = scan.nextLine().toLowerCase();

                    if (estoque.containsKey(produto)) {
                        System.out.println("Produto ja esta no estoque");
                    } else {
                        int quantidade = Funcoes.VerificarNumeroInt("Digite a quantidade de produtos: ");
                        estoque.put(produto, quantidade);
                    }
                    break;
                case 2:
                    if (estoque.size() == 0) {
                        System.out.println("Não há produtos no estoque");
                    } else {
                        for (String produtos : estoque.keySet()) {
                            System.out.println(produtos + " - " + estoque.get(produtos));
                        }
                    }

                    System.out.print("Digite o produto que quer remover: ");
                    String removerProduto = scan.nextLine().toLowerCase();
                    boolean removeu = estoque.remove(removerProduto, (estoque.get(removerProduto)));
                    if (removeu) {
                        System.out.printf("Produto %s removido %n", removerProduto);
                    } else {
                        System.out.printf("Produto %s não encontrado na lista %n", removerProduto);
                    }
                    break;
                case 3:
                    System.out.print("Digite o produto que quer atualizar a quantidade: ");
                    String atualizarProduto = scan.nextLine();
                    System.out.printf("Quantidade de %s atual: %d ",atualizarProduto, (estoque.get(atualizarProduto)));
                    String atualizarquantidade = "Digite a quantidade atualizada do produto: ";
                    int quantidadeAtualizada = Funcoes.VerificarNumeroInt(atualizarquantidade);
                    estoque.put(atualizarProduto, quantidadeAtualizada);

                case 4:
                    if (estoque.size() == 0) {
                        System.out.println("Não há produtos na lista");
                    } else {
                        for (String produtos : estoque.keySet()) {
                            System.out.println(produtos + " " + estoque.get(produtos));
                        }
                    }
                    break;

                case 5:
                    estoque.clear();
                    System.out.println("Lista de compras limpa");
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        }

    }
}
