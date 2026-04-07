package Logica.SenhaFixa;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 24/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senhaDigitada = 0;
        int senhaFixa = 2002;

        while (senhaDigitada != senhaFixa) {
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada != senhaFixa) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
            }
        }
    }
}
