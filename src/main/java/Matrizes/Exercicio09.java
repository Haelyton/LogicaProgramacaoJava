package Matrizes;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 10/03/26
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int x = scanner.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    if (i > 0) {
                        soma += mat[i-1][j];
                    }
                    if (j > 0) {
                        soma += mat[i][j-1];
                    }
                    if (i < mat[i].length-1) {
                        soma += mat[i+1][j];
                    }
                    if (j < mat[i].length-1) {
                        soma += mat[i][j+1];
                    }
                }
            }
        }
            System.out.println(soma);
    }
}
