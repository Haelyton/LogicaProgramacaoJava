package Logica.NotaEMoedas;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 14/02/26
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = (int) (scanner.nextDouble() * 100.0 + 0.5);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtd = valor / nota;
            valor %= nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", qtd, nota / 100.0);
        }

        System.out.println("MOEDAS:");

        for (int moeda : moedas) {
            int qtd = valor / moeda;
            valor %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtd, moeda / 100.0);
        }
    }
}
