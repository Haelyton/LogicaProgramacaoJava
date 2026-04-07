package Heranca.Exercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/03/26
 */
public class Caminhao extends Veiculo {

    public Caminhao(final BigDecimal precoPorDia, final String modelo) {
        super(precoPorDia, modelo);
    }

    @Override
    public String etiquetaAluguel(LocalDate dataInicio, LocalDate dataFinal) {
        BigDecimal calculo = getPrecoPorDia().add(BigDecimal.valueOf(100));
        return "valor caminhao: " + calculo;
    }
}
