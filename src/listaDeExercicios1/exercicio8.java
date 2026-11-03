package listaDeExercicios1;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        int idade = new Scanner(System.in).nextInt();

        System.out.println("Qual a sua idade: ");
        Scanner scanner = new Scanner(System.in);

        if (idade < 16) {
            System.out.println("Não pode votar!");
        }
        else if (idade >= 16 && idade <= 17) {
            System.out.println("O voto é facultativo!");
        }
        else if (idade > 65) {
            System.out.println("O voto é facultativo!");
        }
        else {
            System.out.println("É obrigatório votar!");
        }
    }
}
