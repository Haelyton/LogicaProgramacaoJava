package melhorarNE;

import java.util.HashMap;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 02/10/26
 */
public class Exercicio12 {
    public static void main(String[] args) {
        String palavra = "banana";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);

            } else {
                hashMap.put(c, 1);
            }
        }

        for (Character hehe : hashMap.keySet()) {
            System.out.println(hehe + " -> " + hashMap.get(hehe));
        }
    }
}
