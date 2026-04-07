package Heranca.Exercicio03;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 29/03/26
 */
public class FuncionarioTercerizado extends Funcionario {

    public FuncionarioTercerizado(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String etiquetaSalario() {
        return super.etiquetaSalario() + " Salário Total com bonus de 10%: R$ " +
               super.getSalario() + 50;
    }
}
