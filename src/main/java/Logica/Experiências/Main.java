package Logica.Experiências;

import java.util.Scanner;

/*
Maria acabou de iniciar seu curso de graduação
na faculdade de medicina e precisa de sua ajuda
para organizar os experimentos de um laboratório o
qual ela é responsável. Ela quer saber no final do ano,
quantas cobaias foram utilizadas no laboratório e o percentual
de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias:
sapos, ratos e coelhos. Para obter estas informações,
ela sabe exatamente o número de experimentos que
foram realizados, o tipo de cobaia utilizada e a quantidade
de cobaias utilizadas em cada experimento.


 */

/**
 * @author Haelyton Maicon <haelyton@nexuscloud.com.br>
 * @since 31/03/26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int totalCobaias = 0;
        int quantidadeCoelho = 0;
        int quantidadeRato = 0;
        int quantidadeSapo = 0;
        for (int i = 0; i < N; i++) {
            int quantidadeAnimal = scanner.nextInt();

            String animal = scanner.nextLine().trim();

            if (animal.equals("C")) {
                quantidadeCoelho += quantidadeAnimal;
            }
            if (animal.equals("R")) {
                quantidadeRato += quantidadeAnimal;
            }
            if (animal.equals("S")) {
                quantidadeSapo += quantidadeAnimal;
            }

            totalCobaias += quantidadeAnimal;
        }

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + quantidadeCoelho);
        System.out.println("Total de ratos: " + quantidadeRato);
        System.out.println("Total de sapos: " + quantidadeSapo);
        double calculoCoelho = (double) quantidadeCoelho / totalCobaias * 100;
        System.out.printf("Percentual de coelhos: %.2f %%%n", calculoCoelho);
        double calculoRatos = (double) quantidadeRato / totalCobaias * 100;
        System.out.printf("Percentual de ratos: %.2f %%%n", calculoRatos);
        double calculoSapo = (double) quantidadeSapo / totalCobaias * 100;
        System.out.printf("Percentual de sapos: %.2f %%%n", calculoSapo);
    }
}
