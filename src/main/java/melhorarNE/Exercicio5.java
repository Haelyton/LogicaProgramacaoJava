package melhorarNE;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/09/26
 */
public class Exercicio5 {
    public static void main(String[] args) {
        int[] array = {10, 7, 3, 8, 12, 5, 6, 2};

        int sumPar = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0) {
                sumPar += array[i];
            }
        }

        System.out.println(sumPar);
    }
}
