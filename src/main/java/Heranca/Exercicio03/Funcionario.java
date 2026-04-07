package Heranca.Exercicio03;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 29/03/26
 */
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String etiquetaSalario() {
        return "Funcionário: " + nome + ", Salário: R$ " + salario;
    }
}
