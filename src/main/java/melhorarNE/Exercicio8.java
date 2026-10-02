package melhorarNE;

import java.util.HashMap;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 02/10/26
 */
public class Exercicio8 {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 3, 10, 7};

        HashMap<Integer, Integer> hashMap = new HashMap();

        boolean hihihahaha = false;

        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hihihahaha = true;
            }

            hashMap.put(array[i], 1);
        }

        if (hihihahaha) {
            System.out.println("existe sa porra");
        } else {
            System.out.println("nao existe tu acredita?");
        }


        // codigo antigo pensado pra karalho TOMA NO CU logica demoniaca
//        for (int i = 0; i < array.length; i++) {
//            if (hashMap.containsKey(array[i])) {
//                System.out.println("existe");
//                hihihahaha = true;
//            }
//            hashMap.put(array[i], 1);
//        }
//
//        if (!hihihahaha){
//            System.out.println("n existe");
//        }

    }
}
