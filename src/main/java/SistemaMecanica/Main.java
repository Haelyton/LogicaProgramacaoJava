package SistemaMecanica;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 19/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OrdemDeServico ordemDeServico = new OrdemDeServico("434", "Peugeot");

        List<Peca> pecas = new ArrayList<>();

        Peca peca1 = new Peca("escapamento", BigDecimal.valueOf(40));
        pecas.add(peca1);
        Peca peca2 = new Peca("motor", BigDecimal.valueOf(500));
        pecas.add(peca2);

        List<Servico> servicos = new ArrayList<>();

        Servico servico1 = new Servico("furado", BigDecimal.valueOf(100));
        servicos.add(servico1);
        Servico servico2 = new Servico("79", BigDecimal.valueOf(1000));
        servicos.add(servico2);

        System.out.println("Ordem de Servico: ");
        ordemDeServico.addPecas(pecas);
        ordemDeServico.addServicos(servicos);

        System.out.println(ordemDeServico.toString());
        System.out.println(ordemDeServico.valorTotalOs());
    }
}
