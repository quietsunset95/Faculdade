package Lista1_Condicional;

import java.util.Scanner;

public class L1_Q1 {

    public static void main(String[] args) {
        int A, B, C, soma;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insire o Valor de A: ");
        A = leitor.nextInt();
        System.out.print("Insire o Valor de B: ");
        B = leitor.nextInt();
        System.out.print("Insire o Valor de C: ");
        C = leitor.nextInt();
        leitor.close();

        soma = A + B;

        if (soma < C) {
            System.out.println("A soma de A + B, é menor que C ");
            System.out.print(soma + " menor que " + C);
        } else {
            System.out.println("A soma de A + B, é maior que C ");
            System.out.print(soma + " maior que " + C);
        }
    }

}