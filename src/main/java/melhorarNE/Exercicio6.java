package melhorarNE;

import java.util.HashMap;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/09/26
 */
public class Exercicio6 {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 9, 4, 7, 4, 1};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int maiorFrequencia = 0;
        int numeroMaisFrquente = 0;

        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);
            }
        }

        for (Integer numero : hashMap.keySet()) {
            int frequencia = hashMap.get(numero);

            if (frequencia > maiorFrequencia) {
                maiorFrequencia = frequencia;
                numeroMaisFrquente = numero;
            }
        }


//        for (Integer numero : hashMap.keySet()) {
//            int frequencia = hashMap.get(numero);
//
//            if (frequencia > maiorFrequencia) {
//                maiorFrequencia = frequencia;
//                numeroMaisFrquente = numero;
//            }
//        }


        System.out.println("Número mais frequente: " + numeroMaisFrquente);
        System.out.println("Frequência: " + maiorFrequencia);
    }
}
