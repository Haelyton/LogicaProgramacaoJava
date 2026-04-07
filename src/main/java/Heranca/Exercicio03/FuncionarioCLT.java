package Heranca.Exercicio03;

import lombok.Data;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 29/03/26
 */
public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(final String nome, final double salario) {
        super(nome, salario);
    }
}
