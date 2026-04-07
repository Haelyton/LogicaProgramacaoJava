package Heranca.Exercicio05;

import java.math.BigDecimal;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/03/26
 */
public class Conta {

    private Integer numero;
    private BigDecimal saldo;

    public Conta(final Integer numero, final BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(final Integer numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(final BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String resumo(){
        return "";
    }


}
