package Exception;

import CarrinhoCompras.Carrinho;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 06/04/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Aluguel> alugueis = new ArrayList<>();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        double aluguelMaisCaro = 0;

        System.out.println("Quantos alugueis deseja realizar?");
        int quantidadeAlugueis = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i < quantidadeAlugueis; i++) {
            scanner.nextLine();
            System.out.println("Digite o modelo do carro #" + i++);
            String modeloCarro = scanner.nextLine();

            System.out.println("Digite a data de inicio do aluguel do carro: " + modeloCarro);
            LocalDate dataInicio = LocalDate.parse(scanner.next(), dateTimeFormatter);

            System.out.println("Digite a data final do aluguel do carro " + modeloCarro);
            LocalDate dataFim = LocalDate.parse(scanner.next(), dateTimeFormatter);

            System.out.println("Digite o preço diário do aluguel do carro " + modeloCarro);
            double precoPorDia = scanner.nextDouble();

            alugueis.add(new Aluguel(modeloCarro, dataInicio, dataFim, precoPorDia));
        }

        for (Aluguel aluguel : alugueis) {
            System.out.println(
                "Modelo: " + aluguel.getModelo() + " | " + "Início: " + aluguel.getDataFim() +
                " | " + "Fim: " + aluguel.getDataFim() + " | " + "Total: " + aluguel.precoTotal());

            System.out.println("Total de dias: " + aluguel.getQuantidadeDias());

            if (aluguel.precoTotal() > aluguel.precoTotal()) {
                aluguelMaisCaro = aluguel.precoTotal();
            }
        }

        for (Aluguel aluguel : alugueis) {
            if (aluguel.precoTotal() > aluguel.precoTotal()) {
                System.out.println("Aluguel mais caro: " + aluguelMaisCaro);
            }
        }
    }
}
