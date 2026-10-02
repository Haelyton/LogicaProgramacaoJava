package melhorarNE;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 30/09/26
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Maior e esse : " + number1);
            return;
        } else if (number1 == number2) {
            System.out.println("sao iguais");
            return;
        }

        System.out.println("maior e esse: " + number2);
    }
}
