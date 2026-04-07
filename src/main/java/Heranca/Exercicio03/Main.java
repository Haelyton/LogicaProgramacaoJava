package Heranca.Exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 29/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Qual tipo de funcionario deseja cadastrar? (CLT), (PJ) ou (TER)");
            String tipoFuncionario = scanner.nextLine();

            if (tipoFuncionario.equals("CLT")) {
                System.out.println("Qual nome do funcionario?");
                String nomeFuncionarioCLT = scanner.nextLine();

                System.out.println("Qual o salário?");
                double salario = scanner.nextDouble();

                FuncionarioCLT funcionarioCLT = new FuncionarioCLT(nomeFuncionarioCLT, salario);

                funcionarios.add(funcionarioCLT);

                funcionarioCLT.etiquetaSalario();
            }

            if (tipoFuncionario.equals("PJ")) {
                System.out.println("Qual nome do funcionario?");
                String nomeFuncionarioPJ = scanner.nextLine();

                System.out.println("Qual o salário?");
                double salario = scanner.nextDouble();

                FuncionarioPJ funcionarioPJ = new FuncionarioPJ(nomeFuncionarioPJ, salario);

                funcionarios.add(funcionarioPJ);

                funcionarioPJ.etiquetaSalario();
            }

            if (tipoFuncionario.equals("TER")) {
                System.out.println("Qual nome do funcionario?");
                String nomeFuncionarioTER = scanner.nextLine();

                System.out.println("Qual o salário?");
                double salario = scanner.nextDouble();

                FuncionarioTercerizado funcionarioPJ = new FuncionarioTercerizado(nomeFuncionarioTER,
                    salario);

                funcionarios.add(funcionarioPJ);

                funcionarioPJ.etiquetaSalario();
            }
        }
    }
}
