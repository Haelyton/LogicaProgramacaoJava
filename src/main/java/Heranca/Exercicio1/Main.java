package Heranca.Exercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 29/03/26
 */
public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Maria", 5000));
        funcionarios.add(new Desenvolvedor("Carlos", 4000));
        funcionarios.add(new Funcionario("João", 3000));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Salário com bônus: " + funcionario.calcularBonus());
            System.out.println();
        }
    }
}
