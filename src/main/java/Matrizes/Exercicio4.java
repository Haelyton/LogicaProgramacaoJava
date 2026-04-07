package Matrizes;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 08/03/26
 */
public class Exercicio4 {
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

        int maiorNumero = mat[0][0];
        int posicaoI = 0;
        int posicaoJ = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > maiorNumero){
                    maiorNumero = mat[i][j];
                    posicaoI = i;
                    posicaoJ = j;
                }
            }
        }

        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Posicao: " + posicaoI + ", " + posicaoJ);
    }
}
