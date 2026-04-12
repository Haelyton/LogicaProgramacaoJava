package Logica.KadaneSimplificado;

public class Main {

    public static void main(String[] args) {

        int[] vetor = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int soma = vetor[0];
        int somaMaxima = vetor[0];

        for(int i=1; i<vetor.length; i++) {
            if(soma + vetor[i] < vetor[i]) {
                soma = vetor[i];
            }
            else {
                soma = soma + vetor[i];
            }
            if(soma > somaMaxima) {
                somaMaxima = soma;
            }
        }

        System.out.println(somaMaxima);
    }
}