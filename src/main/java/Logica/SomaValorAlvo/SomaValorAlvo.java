package Logica.SomaValorAlvo;

import java.util.Objects;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 12/04/26
 */
public class SomaValorAlvo {
    public static void main(String[] args) {
        int[] vetor = {2, 7, 11, 15};

        int numeroAlvo = 9;
        int indice = vetor[0];
        int posicao1;
        int posicao2;

        for (final int j : vetor) {
            int soma = indice + j;

            if (Objects.equals(soma, numeroAlvo)) {
                posicao1 = indice;
                posicao2 = j;

                System.out.println(posicao1 + "+" + posicao2 + "=" + (indice + j));
            }
        }
    }
}
