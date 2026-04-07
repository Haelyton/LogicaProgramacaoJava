package Logica.SomaImparesConsecutivos;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 24/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int maior = 0;
        int menor = 0;

        if (x > y) {
            maior = x;
        }
        if (y > x) {
            maior = y;
        }

        if (x < y) {
            menor = x;
        }

        if (y < x) {
            menor = y;
        }

        int soma = 0;

        for (int i = menor + 1; i < maior; i++){
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
