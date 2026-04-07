package CarrinhoCompras;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 19/03/26
 */
@Builder
@Getter
@Setter
public class CupomDesconto {

    private final Integer codigo;
    private BigDecimal porcentagemDesconto;

    @Override
    public String toString() {
        return "CupomDesconto{" +
               ", porcentagemDesconto=" + porcentagemDesconto +
               '}';
    }
}
