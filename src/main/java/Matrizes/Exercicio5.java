package Matrizes;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 08/03/26
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int somaLinhas = 0;

            for (int j = 0; j < mat[i].length; j++) {
                somaLinhas += mat[i][j];
            }

            System.out.println(somaLinhas);
        }
    }
}
