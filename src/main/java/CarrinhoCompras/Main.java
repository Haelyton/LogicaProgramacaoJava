package CarrinhoCompras;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 19/03/26
 */
public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho("Alisson Ap. Santos -> Gay");

        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("tijosh", BigDecimal.valueOf(100));
        produtos.add(produto1);
        Produto produto2 = new Produto("aaaaa", BigDecimal.valueOf(5000));
        produtos.add(produto2);

        List<CupomDesconto> cupomDescontos = new ArrayList<>();

        CupomDesconto cupomDesconto1 = new CupomDesconto(45, BigDecimal.valueOf(5));
        cupomDescontos.add(cupomDesconto1);

        CupomDesconto cupomDesconto2 = new CupomDesconto(535, BigDecimal.valueOf(5));
        cupomDescontos.add(cupomDesconto2);

        System.out.println("Carrinho: ");
        carrinho.addProdutos(produtos);
        carrinho.addCupomDescontos(cupomDescontos);

        System.out.println(carrinho.toString());
        System.out.println(carrinho.totalComDesconto());
    }
}
