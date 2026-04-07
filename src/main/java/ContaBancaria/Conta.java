package ContaBancaria;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 28/03/26
 */
@Data
public class Conta {

    private Integer id;
    private String nome;
    private BigDecimal saldo;

    @Builder
    public Conta(final Integer id,
        final String nome,
        final BigDecimal saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }
}
