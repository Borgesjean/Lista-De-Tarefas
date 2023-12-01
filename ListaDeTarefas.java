import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tarefa> listaDeTarefas = new ArrayList<>();

        int escolha;
        do {
            System.out.println("____Lista de tarefas____");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Exibir tarefas");
            System.out.println("0. para sair");
            System.out.println("_----------------_");

            escolha = sc.nextInt();

            if (escolha == 1) {
                adicionarTarefa(listaDeTarefas);
            } else if (escolha == 2) {
                exibirTarefas(listaDeTarefas);
            } else if (escolha == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Comando Invalido");
            }
        } while (escolha != 0);
        sc.close();
    }
    private static void adicionarTarefa(List<Tarefa> listaDeTarefas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o responsável pela tarefa:");
        String responsavel = scanner.nextLine();

        System.out.println("Informe o status da tarefa:");
        String status = scanner.nextLine();

        System.out.println("Informe a descrição da tarefa:");
        String descricao = scanner.nextLine();

        Tarefa novaTarefa = new Tarefa(responsavel, status, descricao);
        listaDeTarefas.add(novaTarefa);

        System.out.println("Tarefa adicionada com sucesso!\n");
    }

    private static void exibirTarefas(List<Tarefa> listaDeTarefas) {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Lista de tarefas vazia.\n");
        } else {
            System.out.println("Lista de Tarefas:");
            for (Tarefa tarefa : listaDeTarefas) {
                System.out.println("Responsável: " + tarefa.getResponsavel());
                System.out.println("Status: " + tarefa.getStatus());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println();
            }
        }
    }
}