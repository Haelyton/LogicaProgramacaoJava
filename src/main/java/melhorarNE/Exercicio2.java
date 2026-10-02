package melhorarNE;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/09/26
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        int[] array = {one, two, three} ;

        int maiorValor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
            }
        }

        System.out.println(maiorValor);
    }
}
