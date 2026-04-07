package Logica.MenorPosicao;

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 02/04/26
 */

/*
Faça um programa que leia um valor N.
Este N será o tamanho de um vetor X[N].
A seguir, leia cada um dos valores de X,
encontre o menor elemento deste vetor e a
sua posição dentro do vetor, mostrando esta informação.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] vetor = new int[N];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        int menor = vetor[0];
        int posiscao = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
                posiscao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posiscao);
    }
}
