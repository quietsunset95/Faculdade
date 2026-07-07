import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA, numB, escolha;
        boolean continuar = true;

        System.out.println("===============================");
        System.out.print("Digite o primeiro número: ");
        numA = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        numB = teclado.nextInt();

        do {
            System.out.println("===============================");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - SAIR");
            System.out.println("===============================");
            System.out.print("Digite a opção desejada: ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("===============================");
                    soma(numA, numB);
                    continuar = false;
                    break;
                case 2:
                    System.out.println("===============================");
                    subtracao(numA, numB);
                    continuar = false;
                    break;
                case 3:
                    System.out.println("===============================");
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.print("Valor inválido!!!\n");
            }
        } while (continuar);

        teclado.close();
    }

    public static void soma(int numA, int numB) {
        int numC = numA + numB;
        System.out.print("O resultado da soma é: " + numC);
    }

    public static void subtracao(int numA, int numB) {
        int numC = numA - numB;
        System.out.print("O resultado da subtração é: " + numC);
    }
}
