package FrequencyNumber;

import java.util.HashMap;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 25/09/26
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 2, 4, 9, 2, 7};

        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];

            if (mapa.containsKey(number)) {
                int quatidade = mapa.get(number);
                mapa.put(number, quatidade + 1);
            } else {
                mapa.put(array[i], 1);
            }
        }

        System.out.println(mapa);
    }
}
