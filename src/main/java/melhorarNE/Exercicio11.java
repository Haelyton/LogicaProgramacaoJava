package melhorarNE;

import java.util.HashMap;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 02/10/26
 */
public class Exercicio11 {
    public static void main(String[] args) {
        int[] array = {4, 7, 4, 2, 7, 9, 2};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);
            }
        }

        for (Integer frequenciaUma : hashMap.keySet()) {
            if (hashMap.get(frequenciaUma) == 1) {
                System.out.println(frequenciaUma);
            }
        }
    }
}
