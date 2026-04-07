package SistemaMecanica;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 19/03/26
 */
public class OrdemDeServico {

    private String numeroOS;
    private String modeloCarro;
    private List<Peca> pecas = new ArrayList<>();
    private List<Servico> servicos = new ArrayList<>();

    public OrdemDeServico(final String numeroOS,
        final String modeloCarro) {
        this.numeroOS = numeroOS;
        this.modeloCarro = modeloCarro;
    }

    public OrdemDeServico() {
    }

    public String getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(final String numeroOS) {
        this.numeroOS = numeroOS;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(final String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void addPecas(final List<Peca> pecas) {
        this.pecas = pecas;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void addServicos(final List<Servico> servicos) {
        this.servicos = servicos;
    }

    public BigDecimal valorTotalOs() {
        final var somaPrecosPecas = pecas.stream()
            .map(Peca::getPreco)
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        final var somaMaoDeObra = servicos.stream()
            .map(Servico::getMaoDeObra)
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        return somaMaoDeObra.add(somaPrecosPecas);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Peças :");
        stringBuilder.append(pecas);
        stringBuilder.append(", \n");
        stringBuilder.append("Servicos: ");
        stringBuilder.append(servicos);

        return stringBuilder.toString();
    }
}
