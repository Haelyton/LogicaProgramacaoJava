package melhorarNE;

import java.util.HashMap;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 02/10/26
 */
public class Exercicio9 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 3, 9, 5};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                System.out.println("termino vagabunda");
                System.out.println(array[i]);
                break;
            }

            hashMap.put(array[i], 1);

        }
    }
}
