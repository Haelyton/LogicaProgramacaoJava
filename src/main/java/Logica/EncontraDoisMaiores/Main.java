package Logica.EncontraDoisMaiores;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 02/04/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] vetor = new int[N];

        int[] newArray = new int[vetor.length - 1];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }


        int maior = vetor[0];
        int segundoMaior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                segundoMaior = maior;
                maior = vetor[i];
            } else if (vetor[i] > segundoMaior && vetor[i] != maior) {
                segundoMaior = vetor[i];
            }

        }

        System.out.println(maior);
        System.out.println(segundoMaior);
    }
}
