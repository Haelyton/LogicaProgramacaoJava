package Logica.SortSimples;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 12/04/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int[] vetor = {n1, n2, n3};
        int[] ordenado = {n1, n2, n3};
        Arrays.sort(ordenado);

        for (int i : ordenado) {
            System.out.println(i);
        }

        System.out.println();

        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
