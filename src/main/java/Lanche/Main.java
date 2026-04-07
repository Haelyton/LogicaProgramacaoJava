package Lanche;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 24/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.printf("Total: R$ %.2f%n", 4.00 * quantidade);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f%n", 4.50 * quantidade);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f%n", 5.00 * quantidade);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f%n", 2.00 * quantidade);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f%n", 1.50 * quantidade);
                break;
        }
    }
}
