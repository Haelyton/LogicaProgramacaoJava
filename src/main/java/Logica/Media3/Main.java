package Logica.Media3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10.0;

        media = Math.floor(media * 10) / 10.0;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double exame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exame);

            double mediaFinal = (media + exame) / 2.0;

            mediaFinal = Math.floor(mediaFinal * 10) / 10.0;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        scanner.close();
    }
}