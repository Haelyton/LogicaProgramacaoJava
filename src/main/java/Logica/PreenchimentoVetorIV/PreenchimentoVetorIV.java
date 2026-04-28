package Logica.PreenchimentoVetorIV;

/*
Preenchimento de Vetor IV
Neste problema você deverá ler
15 valores colocá-los em 2 vetores conforme estes
valores forem pares ou ímpares. Só que o tamanho de
cada um dos dois vetores é de 5 posições. Então, cada vez
que um dos dois vetores encher, você deverá imprimir
todo o vetor e utilizá-lo novamente para os próximos números que
forem lidos. Terminada a leitura, deve-se imprimir o conteúdo que
restou em cada um dos dois vetores, imprimindo primeiro os
valores do vetor impar. Cada vetor pode ser preenchido tantas
vezes quantas for necessário.

Beecrowd: https://judge.beecrowd.com/pt/problems/view/1179


 */

import java.util.Scanner;

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 27/04/26
 */
public class PreenchimentoVetorIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < 15; i++) {
            int valor = scanner.nextInt();

            if (valor % 2 == 0) {
                par[contadorPar] = valor;
                contadorPar++;

                if (contadorPar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "]" + " = " + par[j]);
                    }

                    contadorPar = 0;
                }
            } else {
                impar[contadorImpar] = valor;
                contadorImpar++;

                if (contadorImpar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "]" + " = " + impar[j]);
                    }

                    contadorImpar = 0;
                }
            }
        }

        for (int i = 0; i < contadorImpar; i++) {
            System.out.println("impar[" + i + "]" + " = " + impar[i]);
        }

        for (int i = 0; i < contadorPar; i++) {
            System.out.println("par[" + i + "]" + " = " + par[i]);
        }
    }
}


