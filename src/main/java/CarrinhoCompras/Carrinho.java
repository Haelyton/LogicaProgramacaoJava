package CarrinhoCompras;

import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 19/03/26
 */
@Getter
public class Carrinho {

    private String cliente;
    private List<CupomDesconto> cupomDescontos;
    private List<Produto> produtos;

    public Carrinho(final String cliente) {
        this.cliente = cliente;
    }

    public void addCupomDescontos(final List<CupomDesconto> cupomDescontos) {
        this.cupomDescontos = cupomDescontos;
    }

    public void addProdutos(final List<Produto> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal totalComDesconto() {
        final var somaProdutos = produtos.stream()
            .map(Produto::getPreco)
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        final var somaCupons = cupomDescontos.stream()
            .map(CupomDesconto::getPorcentagemDesconto)
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        return somaProdutos.subtract(somaProdutos.multiply(somaCupons.divide(BigDecimal.valueOf(100),
            2,
            RoundingMode.HALF_UP)));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Produtos: ");
        stringBuilder.append(produtos);
        stringBuilder.append("\n");
        stringBuilder.append("Descontos: ");
        stringBuilder.append(cupomDescontos);

        return stringBuilder.toString();
    }
}
