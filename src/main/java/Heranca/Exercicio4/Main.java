package Heranca.Exercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Veiculo> veiculos = new ArrayList<>();

        System.out.println("Insira a quantidade de veiculos usados");
        int N = scanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o veiculo usado (Carro, Moto ou Caminhão) #" + i + 1);
            String veiculoUsado = scanner.nextLine();

            if (veiculoUsado.equals("Carro")) {
                System.out.println("Insira a data de inicio da utilização dao carro");
                LocalDate dataInicio = LocalDate.parse(scanner.next(), formatter);

                System.out.println("Insira a data final da utilização dao carro");
                LocalDate dataFinal = LocalDate.parse(scanner.next(), formatter);

                Carro carro = new Carro(BigDecimal.valueOf(50), "Civicão");

                veiculos.add(carro);

                System.out.println(carro.etiquetaAluguel(dataInicio, dataFinal));
            }

            if (veiculoUsado.equals("Moto")) {
                System.out.println("Insira a data de inicio da utilização da Moto");
                LocalDate dataInicio = LocalDate.parse(scanner.next(), formatter);

                System.out.println("Insira a data final da utilização da Moto");
                LocalDate dataFinal = LocalDate.parse(scanner.next(), formatter);

                Moto moto = new Moto(BigDecimal.valueOf(20), "MT-03");

                veiculos.add(moto);

                System.out.println(moto.etiquetaAluguel(dataInicio, dataFinal));
            }
        }
    }
}
