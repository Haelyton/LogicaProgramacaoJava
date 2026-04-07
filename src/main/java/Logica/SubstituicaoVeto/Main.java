package Logica.SubstituicaoVeto;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 31/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] X = new int[10];

        for (int i = 0; i < X.length; i++) {
            int entrada = scanner.nextInt();

            if (entrada < 0 || entrada == 0) {
                X[i] = 1;
            } else {
                X[i] = entrada;
            }
        }

        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}
