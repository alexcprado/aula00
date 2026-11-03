package listaDeExercicios1;

import java.awt.*;

public class exercicio3 {
    public static void main(String[] args) {
        int[] listaDeNumeros = {4, 7, 10};

        int media = 0;
        int soma = 0;
        int maiorNum = Integer.MIN_VALUE;
        int menorNum = Integer.MAX_VALUE;

        for(int n : listaDeNumeros){
            soma += n;
            media = soma / listaDeNumeros.length;

            if (n > maiorNum) {
                maiorNum = n;
            }
            if (n < menorNum) {
                menorNum = n;
            }
        }

        System.out.println("Maior: " + maiorNum);
        System.out.println("Menor: " + menorNum);
        System.out.println("Média: " + media);
    }
}
