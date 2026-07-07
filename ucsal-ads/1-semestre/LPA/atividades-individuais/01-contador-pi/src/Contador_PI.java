package Exercicios;
import java.util.Scanner;

public class Contador_PI {
    public static void main(String[] args){
        double par, impar, num, medial;
        int contadorP, contadorI;
        Scanner teclado = new Scanner(System.in);
        contadorP = 0;
        contadorI = 0;
        par = 0;
        impar = 0;

        System.out.println("---------------Analisador de Pares---------------");
        System.out.println("Digite ate 10 numeros pares para ter o resultado!");
        System.out.println("Caso não digite, tera a media dos numeros impares");

        do {
            System.out.print("Digite o numero: ");
            num = teclado.nextDouble();
            if ( num%2 == 0 ) {
                contadorP ++;
                par = num + par;
                System.out.println("O seu contador de PAR é: " + contadorP);
            } else {
                contadorI++;
                impar = num + impar;
            }
        }while( contadorP < 10);
        {
            System.out.println("\n----------------- Resultados --------------");
            System.out.println("A soma total dos numeros Pares foi de: " + par);

            if (contadorI > 0) {
                medial = impar / contadorI;
                System.out.println("E a media dos numeros impares foram de: " + medial);
            } else {
                System.out.println("Nenhum numero impar foi encontrado!");
            }
        }

    }
}
