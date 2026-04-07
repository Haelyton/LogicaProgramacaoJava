package Heranca.Exercicio03;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 29/03/26
 */
public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(final String nome, final double salario) {
        super(nome, salario);
    }

    @Override
    public String etiquetaSalario() {
        double somaBonus = getSalario() * 0.10;
        double salarioTotal = getSalario() + somaBonus;
        return super.etiquetaSalario() + " Salário Total com bonus de 10%: R$ " + salarioTotal;
    }
}
