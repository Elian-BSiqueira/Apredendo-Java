package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciamentoPOO {

    /**
     * Solicita um número inteiro dentro de um intervalo específico.
     *
     * @param texto  Mensagem de entrada a ser exibida.
     * @param minimo Valor mínimo permitido (inclusive).
     * @param maximo Valor máximo permitido (inclusive).
     * @return Um número inteiro dentro do intervalo definido.
     */
    public static int VerificarInteiroComIntervalo(String texto, int minimo, int maximo) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        int numero = 0;
        do {
            System.out.print(texto);
            try {
                numero = scan.nextInt();
                if (numero >= minimo && numero <= maximo) {
                    controleDeLoop = false;
                } else {
                    System.out.printf("Opcao Invalida. Digite um numero entre %d e %d %n", minimo, maximo);
                }

            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Entrada invalida. Digite um numero");
            }
        } while (controleDeLoop);

        return numero;
    }

    public static int VerificarNumeroInt(String texto) {
        Scanner scan = new Scanner(System.in);
        boolean controleDeLoop = true;
        int numero = 0;

        while (controleDeLoop) {
            System.out.print(texto);
            try {
                numero = scan.nextInt();
                controleDeLoop = false;

            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Entrada invalida. Digite um numero");
            }

        }
        return numero;
    }

    public static void adicionarAutor(Scanner scanner, HashMap<Autor, ArrayList<Livro>> hashMap) {
        String nome = null;
        boolean controleDeLoop = true;

        while (controleDeLoop) {
            System.out.print("Digite o nome do autor que deseja adicionar, deixe em branco para cancelar: ");
            nome = scanner.nextLine().strip();
            if (nome.isEmpty()) {
                return;
            } else {
                String nomeverificar = nome;
                boolean verificarAutor =
                        hashMap.keySet().stream().anyMatch(autor -> autor.getNome().equalsIgnoreCase(nomeverificar));
                if (verificarAutor) {
                    System.out.println("Autor ja esta na biblioteca");
                    continue;
                } else {
                    controleDeLoop = false;

            }

        }
        Autor autor = new Autor(nome.toLowerCase());
        hashMap.put(autor, new ArrayList<>());
        System.out.printf("Autor %s adicionado a biblioteca %n", nome);

        }


    }

    public static void adicionarLivro(Scanner scanner, Autor autor, HashMap<Autor, ArrayList<Livro>> hashMap) {
            String nome = null;
            boolean controleDeLoop = true;

            while (controleDeLoop) {
                System.out.print("Digite o nome do livro que deseja adicionar, deixe em branco para cancelar: ");
                nome = scanner.nextLine().strip();
                if (nome.isEmpty()) {
                    return;
                } else {
                    String nomeverificar = nome;
                    boolean verificarLivro =
                            hashMap.get(autor).stream().anyMatch(titulo -> titulo.getTitulo().equalsIgnoreCase(nomeverificar));

                    if (verificarLivro) {
                        System.out.println("Livro ja esta na biblioteca");
                        controleDeLoop = false;
                    } else {
                        int anoDeLancamento = VerificarNumeroInt("Digite o ano de publicacao do livro: ");
                        Livro livro = new Livro(nome, autor, anoDeLancamento);
                        hashMap.get(autor).add(livro);
                        System.out.printf("Livro %s adicionado com sucesso ao autor %s %n", nome, autor.getNome());
                    }

                }
            }


        }

    public static void adicionarAutorELivro(Scanner scanner, HashMap<Autor, ArrayList<Livro>> hashMap) {
        String nome = null;
        boolean controleDeLoop = true;
        Autor autor = null;

        while (controleDeLoop) {
            System.out.print("Digite o nome do autor que deseja adicionar, deixe em branco para cancelar: ");
            nome = scanner.nextLine().strip();
            if (nome.isEmpty()) {
                return;
            } else {
                String nomeverificar = nome;
                boolean verificarAutor =
                        hashMap.keySet().stream().anyMatch(nomeAutor -> nomeAutor.getNome().equalsIgnoreCase(nomeverificar));
                if (verificarAutor) {
                    System.out.println("Autor ja esta na biblioteca.");
                    return;
                } else {
                    autor = new Autor(nome.toLowerCase());
                    hashMap.put(autor, new ArrayList<>());
                    System.out.printf("Autor %s adicionado a biblioteca %n", nome);

                }

            }
        }
        String nomeLivro = null;
        controleDeLoop = true;

        while (controleDeLoop) {
            System.out.print("Digite o nome do livro que deseja adicionar, deixe em branco para cancelar: ");
            nome = scanner.nextLine().strip();
            if (nome.isEmpty()) {
                return;
            } else {
                String nomeverificar = nome;
                boolean verificarLivro =
                        hashMap.get(autor).stream().anyMatch(titulo -> titulo.getTitulo().equalsIgnoreCase(nomeverificar));

                if (verificarLivro) {
                    System.out.println("Livro ja esta na biblioteca");
                    controleDeLoop = false;
                } else {
                    int anoDeLancamento = VerificarNumeroInt("Digite o ano de publicacao do livro: ");
                    Livro livro = new Livro(nome, autor, anoDeLancamento);
                    hashMap.get(autor).add(livro);
                    System.out.printf("Livro %s adicionado com sucesso ao autor %s %n", nome, autor.getNome());
                }

            }
        }


    }


}
