package Heranca.Exercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/03/26
 */
public class Carro extends Veiculo {
    public Carro(final BigDecimal precoPorDia, final String modelo) {
        super(precoPorDia, modelo);
    }

    @Override
    public String etiquetaAluguel(LocalDate dataInicio, LocalDate dataFinal) {
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFinal);
        BigDecimal somaAlguel = getPrecoPorDia().multiply(BigDecimal.valueOf(dias));

        return "Soma do alguel total do veiculo foi de R$" + somaAlguel;
    }

}
