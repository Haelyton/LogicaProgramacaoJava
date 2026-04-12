package Logica.RemoverDuplicados;

import Heranca.Exercicio4.Veiculo;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 06/04/26
 */
public class RemoverDuplicados {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 2, 2, 2, 2, 5};

        for (int i = 0; i < vetor.length; i++) {

            boolean igual = false;

            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    igual = true;
                    break;
                }

            }
            if (!igual) {
                System.out.println(vetor[i]);
            }
        }
    }
}
