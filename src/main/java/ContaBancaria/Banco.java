package ContaBancaria;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 28/03/26
 */
@Data
public class Banco {

    private static List<Conta> contas = new ArrayList<>();
    private static Integer proximoId = 1;

    public static void create(final Conta conta) {
        Conta newConta = Conta.builder()
            .id(proximoId++)
            .nome(conta.getNome())
            .saldo(BigDecimal.ZERO)
            .build();

        contas.add(newConta);
    }

    public static void listarConta() {
        if (contas.isEmpty()) {
            System.out.println("Não existe contas criadas");
        }

        for (Conta conta : contas) {
            System.out.println(
                "Identificador da conta: " + conta.getId() + ", Nome: " + conta.getNome());
        }
    }

    public static void findByIdAccount(final Integer id) {
        for (Conta conta : contas) {
            if (conta.getId().equals(id)) {
                System.out.println(
                    "Id: " + conta.getId() + ", Nome: " + conta.getNome() + ", Saldo: " +
                    conta.getSaldo());
            }
        }

    }
}
