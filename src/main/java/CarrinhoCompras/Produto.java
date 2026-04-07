package CarrinhoCompras;

import lombok.*;

import java.math.BigDecimal;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 19/03/26
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private String nome;
    private BigDecimal preco;

    @Override
    public String toString() {
        return "Preco{" +
               ", preco=" + preco +
               '}';
    }
}
