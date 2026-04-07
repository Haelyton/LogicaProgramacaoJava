package ContaBancaria;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 28/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Lista de contas");
            System.out.println("2 - Criar conta");
            System.out.println("3 - Buscar conta");
            System.out.println("4 - Transferir dinheiro");
            System.out.println("5 - Depositar dinheiro");
            System.out.println("6 - Sacar dinheiro");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Listagem de Contas");
                    Banco.listarConta();
                    break;
                case 2:
                    System.out.println("Inicie criando sua conta: ");
                    scanner.nextLine();

                    System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();

                    Conta conta = Conta.builder()
                        .nome(nome)
                        .build();

                    Banco.create(conta);
                    break;
                case 3:
                    System.out.println("Digite o identificador ");
                    int id = scanner.nextInt();
                    Banco.findByIdAccount(id);
                    break;
                case 4:

                    break;
            }
        } while (opcao != 0);
    }
}
