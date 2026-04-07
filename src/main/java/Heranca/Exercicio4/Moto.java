package Heranca.Exercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/03/26
 */
public class Moto extends Veiculo {

    public Moto(final BigDecimal precoPorDia, final String modelo) {
        super(precoPorDia, modelo);
    }

    @Override
    public String etiquetaAluguel(LocalDate dataInicio, LocalDate dataFinal) {
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFinal);
        BigDecimal somaAlguel = getPrecoPorDia().multiply(BigDecimal.valueOf(dias));
        BigDecimal descontoAluquel = somaAlguel.multiply(BigDecimal.valueOf(0.10));

        return "Soma do alguel total do veiculo foi de R$" + somaAlguel.subtract(descontoAluquel);
    }
}
