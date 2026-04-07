package Listas.Exercicio01.GerenciadorTarefas;

import javax.swing.text.html.Option;
import java.util.*;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 07/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Tarefa> tarefas = new ArrayList<>();

        int opcao = 0;

        System.out.println("Gerenciador de Tarefas");

        while (opcao != 6) {
            System.out.println("1 - Adicionar Tarefa:");
            System.out.println("2 - Listar Tarefas:");
            System.out.println("3 - Concluir Tarefa:");
            System.out.println("4 - Remove Tarefa:");
            System.out.println("5 - Mostrar Tarefas pendentes:");
            System.out.println("6 - Sair:");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o Id da tarefa: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    while (verificaId(tarefas, id)) {
                        System.out.println(
                            "Esse Id já está cadastrado digite novamente um novo ID da tarefa: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                    }

                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    Tarefa tarefa = new Tarefa(id, descricao);
                    tarefas.add(tarefa);

                    System.out.println(
                        "Tarefa cadatrada com sucesso com a situação: " + tarefa.isConcluida());

                    break;
                case 2:
                    System.out.println("Tarefas: ");
                    for (Tarefa tarefaList : tarefas) {
                        System.out.println(tarefaList.getId() + " - " + tarefaList.getDescricao());
                    }

                    break;
                case 3:
                    System.out.println("Digite o Id da tarefa q deseja concluir: ");
                    id = scanner.nextInt();

                    boolean posicao = marcarComoConcluida(tarefas, id);

                    Tarefa tarefa1 = new Tarefa();

                    if (posicao) {
                        tarefa1.setConcluida(true);
                        System.out.println("Tarefa concluida com sucesso");
                    } else {
                        System.out.println("Id não existe, tente novamente");
                        id = scanner.nextInt();
                        marcarComoConcluida(tarefas, id);
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID da tarefa que deseja remover: ");
                    scanner.nextLine();
                    do {
                        id = scanner.nextInt();
                        scanner.nextLine();
                    } while (removerTarefa(tarefas, id));

                    scanner.nextLine();
                    System.out.println("Tarefa removida com sucesso");

                    break;
                case 5:
                    break;
            }
        }
    }

    private static boolean verificaId(List<Tarefa> tarefas, int id) {
        Tarefa tarefa = tarefas.stream()
            .filter(tarefa1 -> tarefa1.getId() == id)
            .findFirst()
            .orElse(null);

        return tarefa != null;
    }

    private static boolean marcarComoConcluida(List<Tarefa> tarefas, int id) {
        Tarefa tarefa = tarefas.stream()
            .filter(t -> Objects.equals(id, t.getId()))
            .findFirst()
            .orElse(null);

        assert tarefa != null;
        return tarefa.getId() == id;
    }

    private static boolean removerTarefa(List<Tarefa> tarefas, int id) {
        for (Tarefa tarefa : tarefas) {
            if (id != tarefa.getId()) {
                System.out.println("Id não existe, tente novamente");
                return true;
            }
        }

        return tarefas.removeIf(tarefa -> Objects.equals(id, tarefa.getId()));
    }
}
