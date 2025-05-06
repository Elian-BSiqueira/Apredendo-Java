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
                        int quantidade = 0;
                        do {
                            quantidade = Funcoes.VerificarNumeroInt("Digite a quantidade de produtos: ");
                            if (quantidade <= 0) {
                                System.out.println("Quantidade de produtos nao pode ser inferior ou igual a 0");
                            }
                        } while (quantidade < 0);
                        estoque.put(produto, quantidade);
                    }
                    break;
                case 2:
                    if (estoque.size() != 0) {
                        for (String produtos : estoque.keySet()) {
                            System.out.println(produtos + " - " + estoque.get(produtos));
                            System.out.print("Digite o produto que quer remover: ");
                            String removerProduto = scan.nextLine().toLowerCase();
                            boolean removeu = estoque.remove(removerProduto, (estoque.get(removerProduto)));
                            if (removeu) {
                                System.out.printf("Produto %s removido %n", removerProduto);
                            } else {
                                System.out.printf("Produto %s não encontrado na lista %n", removerProduto);
                            }
                        }

                    } else {
                        System.out.println("Não há produtos no estoque");
                    }
                    break;
                case 3:
                    if (estoque.size() != 0) {
                        System.out.print("Digite o produto que quer atualizar a quantidade: ");
                        String atualizarProduto = scan.nextLine();
                        int quantidadeAtualizada = 0;
                        if (estoque.containsKey(atualizarProduto)) {
                            System.out.printf("Quantidade de %s atual: %d ", atualizarProduto, (estoque.get(atualizarProduto)));
                            do {
                                String atualizarquantidade = "Digite a quantidade atualizada do produto: ";
                                quantidadeAtualizada = Funcoes.VerificarNumeroInt(atualizarquantidade);
                                if (quantidadeAtualizada <= 0) {
                                    System.out.println("Quantidade de produtos nao pode ser inferior ou igual a 0");
                                }

                            } while (quantidadeAtualizada <= 0);

                        } else {
                            System.out.printf("Produto %s nao encontrado %n", atualizarProduto);
                        }
                        estoque.put(atualizarProduto, quantidadeAtualizada);
                    } else {
                        System.out.println("Nao ha produtos no estoque");
                    }

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
                    System.out.println("Estoque limpo");
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        }

    }
}
