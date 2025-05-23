package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe principal do sistema de gerenciamento de biblioteca.
 * Permite adicionar, remover, listar e pesquisar livros através de uma interface de console.
 */


public class Main {
    private static boolean VerificarBilioteca(HashMap<Autor, ArrayList<Livro>> hashMap, String texto) {
        if (hashMap.isEmpty()) {
            System.out.println(texto);
            return false;
        }
        return true;

    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "=".repeat(30) +
                "\nSistema De Biblioteca\n" +
                "=".repeat(30) +
                """
                
                1) Adicionar autor e livro
                2) Adicionar livro
                3) Remover livro
                4) Pesquisar livro por titulo
                5) Pesquisar livros por autor
                6) Listar livros
                7) Sair
                """;

        HashMap<Autor, ArrayList<Livro>> biblioteca = new HashMap<>();

        int opcao = -1;
        boolean verificarBiblioteca = false;
        while (opcao != 7) {
            System.out.println(menu);

            opcao = GerenciamentoPOO.VerificarInteiroComIntervalo("Digite sua opcao: ", 1, 7);

            switch (opcao) {
                case 1:
                    GerenciamentoPOO.adicionarAutorELivro(scan, biblioteca);
                    break;
                case 2:
                    verificarBiblioteca = VerificarBilioteca(biblioteca, "Nao ha autores na bilioteca. Use a opcao 1 " +
                            "primeiro");
                    if (verificarBiblioteca) {
                        GerenciamentoPOO.adicionarLivro(scan, biblioteca);

                    } else {
                        break;
                    }

                    break;

                case 3:
                    verificarBiblioteca = VerificarBilioteca(biblioteca, "Nao ha livros na biblioteca");
                    if (verificarBiblioteca) {
                        //FuncoesGerenciamento.RemoverLivro(biblioteca, scan);
                    } else {
                        break;

                    }

                    break;

                case 4:
                    verificarBiblioteca = VerificarBilioteca(biblioteca, "Nao ha livros na biblioteca");
                    if (verificarBiblioteca) {
                        //FuncoesGerenciamento.PesquisarLivroPorTitulo(biblioteca, scan);
                    } else {
                        break;

                    }

                    break;

                case 5:
                    verificarBiblioteca = VerificarBilioteca(biblioteca, "Nao ha autores na biblioteca");
                    if (verificarBiblioteca) {
                        //FuncoesGerenciamento.PesquisarLivroPorAutor(biblioteca, scan);
                    } else {
                        break;
                    }

                    break;

                case 6:
                    verificarBiblioteca = VerificarBilioteca(biblioteca, "Nao ha autores ou livros na biblioteca");
                    if (verificarBiblioteca) {
                        //FuncoesGerenciamento.ListarLivros(biblioteca, scan);
                    } else {
                        break;
                    }

                    break;

                case 7:
                    System.out.println("Saindo do programa...");
                    scan.close();
                    break;

                default:
                    System.out.println("Opcao invalida");

            }
        }


    }
}
