package SistemaMecanica;

import java.math.BigDecimal;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 19/03/26
 */
public class Servico {

    private String descricao;
    private BigDecimal maoDeObra;

    public Servico(final String descricao, final BigDecimal maoDeObra) {
        this.descricao = descricao;
        this.maoDeObra = maoDeObra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(final BigDecimal maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    @Override
    public String toString() {
        return "Servico{" +
               "descricao='" + descricao + '\'' +
               ", maoDeObra=" + maoDeObra +
               '}';
    }
}
