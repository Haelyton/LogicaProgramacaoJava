package melhorarNE;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/09/26
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int[] array = {10, 4, 7, -3, 15, 2};

        int menorValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menorValue) {
                menorValue = array[i];
            }
        }

        System.out.println(menorValue);
    }
}
