package melhorarNE;

import java.util.HashMap;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 02/10/26
 */
public class Exercicio7 {
    public static void main(String[] args) {
        String[] palavras = {
            "java", "python", "java", "c++", "java",
            "python", "javascript"
        };

        HashMap<String, Integer> hashMap = new HashMap();

        int maiorFrequencia = 0;
        String textoComMaiorFrequencia = "";

        for (int i = 0; i < palavras.length; i++) {
            if (hashMap.containsKey(palavras[i])) {
                hashMap.put(palavras[i], hashMap.get(palavras[i]) + 1);
            } else {
                hashMap.put(palavras[i], 1);
            }
        }

        for (String text : hashMap.keySet()) {
            Integer frequenciaValor = hashMap.get(text);

            if (frequenciaValor > maiorFrequencia) {
                maiorFrequencia = frequenciaValor;
                textoComMaiorFrequencia = text;
            }
        }

        System.out.println(maiorFrequencia);
        System.out.println(textoComMaiorFrequencia);
    }
}
