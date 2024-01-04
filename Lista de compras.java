Lista de compras para praticar comandos em Java
Louyse Macedo

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("----- Aplicativo de Lista de Compras -----");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção (1-4): ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item a ser adicionado: ");
                    String novoItem = scanner.nextLine();
                    adicionarItem(listaDeCompras, novoItem);
                    break;
                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    String itemRemover = scanner.nextLine();
                    removerItem(listaDeCompras, itemRemover);
                    break;
                case 3:
                    exibirLista(listaDeCompras);
                    break;
                case 4:
                    System.out.println("Saindo do aplicativo de Lista de Compras. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 4);
    }

    private static void adicionarItem(ArrayList<String> lista, String item) {
        lista.add(item);
        System.out.println(item + " foi adicionado à lista de compras.");
    }

    private static void removerItem(ArrayList<String> lista, String item) {
        if (lista.remove(item)) {
            System.out.println(item + " foi removido da lista de compras.");
        } else {
            System.out.println(item + " não encontrado na lista de compras.");
        }
    }

    private static void exibirLista(ArrayList<String> lista) {
        System.out.println("----- Lista de Compras -----");
        if (lista.isEmpty()) {
            System.out.println("A lista de compras está vazia.");
        } else {
            for (String item : lista) {
                System.out.println("- " + item);
            }
        }
        System.out.println("-----------------------------");
    }
}