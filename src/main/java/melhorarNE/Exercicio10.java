package melhorarNE;

import java.util.HashMap;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 02/10/26
 */
public class Exercicio10 {
    public static void main(String[] args) {
        String[] itens = {
            "fruta", "carne", "fruta",
            "bebida", "carne", "fruta"
        };

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < itens.length; i++) {
            if (hashMap.containsKey(itens[i])) {
                hashMap.put(itens[i], hashMap.get(itens[i]) + 1);
            } else {
                hashMap.put(itens[i], 1);
            }
        }

        for (String key : hashMap.keySet()) {
            System.out.println(key + " -> " + hashMap.get(key));
        }
    }
}
