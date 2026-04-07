package Matrizes;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 10/03/26
 */
public class Exercicio08 {
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

        int posicaoI = 0;
        int posicaoJ = 0;
        int maiorNumero = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > maiorNumero) {
                    maiorNumero = mat[i][j];
                    posicaoI = i;
                    posicaoJ = j;
                }
            }
        }

        System.out.println("Mairo numero: " + maiorNumero);
        System.out.println("Posicao: " + posicaoI + ", " + posicaoJ);
    }
}
