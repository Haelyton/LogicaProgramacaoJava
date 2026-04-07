package Heranca.Exercicio05;

import java.math.BigDecimal;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/03/26
 */
public class ContaCorrente extends Conta {
    public ContaCorrente(final Integer numero, final BigDecimal saldo) {
        super(numero, saldo);
    }

    @Override
    public String resumo() {
        return "Número conta: " + getNumero() + ", Saldo da conta: R$" + getSaldo();
    }

    public void deposito(final BigDecimal valorDeposito) {
        if (valorDeposito.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal valorFinal = getSaldo().add(valorDeposito).subtract(BigDecimal.valueOf(2));
            System.out.println(
                "Novo valor depositado: R$" + valorDeposito + ", Valor inicial: R$" + getSaldo() +
                ", Valor final: R$" + valorFinal);
        }
    }

    public void saque(final BigDecimal valorSaque) {
        if (valorSaque.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal valorNovo = getSaldo().subtract(valorSaque).subtract(BigDecimal.valueOf(2));
            System.out.println(
                "Novo valor sacado: R$" + valorSaque + ", Valor inicial: R$" + getSaldo() +
                ", Valor final: R$" + valorNovo);
        }
    }
}
