package SistemaEstacionamento;

import java.sql.Timestamp;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 27/04/26
 */
public class SistemaEstacionamento {

    private Timestamp horaEntrada;
    private Timestamp horaSaida;
    private String tipoVeiculo;

    public SistemaEstacionamento(final Timestamp horaEntrada,
        final Timestamp horaSaida,
        final String tipoVeiculo) {
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.tipoVeiculo = tipoVeiculo;
    }

    public Timestamp getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(final Timestamp horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Timestamp getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(final Timestamp horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(final String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
