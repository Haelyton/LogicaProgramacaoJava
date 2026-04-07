package Matrizes;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 10/03/26
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int contador = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                boolean esquerda = i == 0 || mat[i][j] > mat[i-1][j];
                boolean direita = i == mat[i].length - 1 || mat[i][j] > mat[i+1][j];

                if (esquerda && direita) {
                    contador++;
                }
            }
        }

        System.out.println(contador);
    }
}
