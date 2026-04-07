package SistemaMecanica;

import java.math.BigDecimal;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 19/03/26
 */
public class Peca {

    private String nome;
    private BigDecimal preco;

    public Peca(final String nome, final BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(final BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Peca{" +
               "nome='" + nome + '\'' +
               ", preco=" + preco +
               '}';
    }
}
