package Heranca.Exercicio1;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 29/03/26
 */
public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(final String nome, final double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 0.10;
        return getSalario() + bonus;
    }
}
