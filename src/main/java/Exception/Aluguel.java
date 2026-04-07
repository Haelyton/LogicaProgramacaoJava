package Exception;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 06/04/26
 */
public class Aluguel {

    private String modelo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double precoPorDia;
    private long quantidadeDias;

    public Aluguel(final String modelo,
        final LocalDate dataInicio,
        final LocalDate dataFim,
        final double precoPorDia) {
        this.modelo = modelo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.precoPorDia = precoPorDia;

        validate();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(final LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(final LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(final double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public long getQuantidadeDias() {
        return quantidadeDias;
    }

    public double precoTotal() {
        validate();
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim) + 1;

        quantidadeDias = dias;

        return precoPorDia * dias;
    }

    private void validate() {
        checkDataFimConstraint();
        checkPrecoConstraint();
        checkModeloConstraint();
        checkDataInicioConstraint();
    }

    private void checkModeloConstraint() {
        if (modelo == null || modelo.isEmpty()) {
            throw new DomainException("Não é permitido cadastrar um novo aluguel com o modelo vazio");
        }
    }

    private void checkDataFimConstraint() {
        if (dataFim.isBefore(dataInicio)) {
            throw new DomainException(
                "A data final não pode ser antes da data inicio " + this.dataFim);
        }

        if (dataFim.isBefore(LocalDate.now())) {
            throw new DomainException(
                "A data final não pode ser antes da data atual: " + LocalDate.now());
        }
    }

    private void checkDataInicioConstraint() {
        if (dataInicio.isBefore(LocalDate.now())) {
            throw new DomainException(
                "A data inicio não pode ser antes da data atual: " + LocalDate.now());
        }
    }

    private void checkPrecoConstraint() {
        if (precoPorDia <= 0) {
            throw new DomainException(
                "O preço por dia não pode ser menor ou igual a zero " + precoPorDia);
        }
    }
}
