package Logica.SomaImparesConsecutivosII;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 24/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int x;
        int y;

        for (int i = 0; i < N; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();

            int menor = Math.min(x, y);
            int maior = Math.max(x,y);
            int soma = 0;

            for (int j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }

            System.out.println(soma);

        }
    }
}
