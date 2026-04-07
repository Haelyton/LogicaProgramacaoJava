package Heranca.Exercicio4;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/03/26
 */
public class Veiculo {

    private String modelo;
    private BigDecimal precoPorDia;

    public Veiculo(final BigDecimal precoPorDia, final String modelo) {
        this.precoPorDia = precoPorDia;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(final BigDecimal precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public String etiquetaAluguel(LocalDate dataInicio, LocalDate dataFinal) {
        return "nada";
    }

}
