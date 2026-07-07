import java.util.Scanner;

public class Mudanca_Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA, numB, escolha, resultado;
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
                    resultado = soma(numA, numB);
                    System.out.print("O valor da soma é: " + resultado);
                    continuar = false;
                    break;
                case 2:
                    System.out.println("===============================");
                    resultado = subtracao(numA, numB);
                    System.out.print("O valor da subtração é: " + resultado);
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

    public static int soma(int numA, int numB) {
        int resultado = numA + numB;
        return resultado;
    }

    public static int subtracao(int numA, int numB) {
        int resultado = numA - numB;
        return resultado;
    }
}
