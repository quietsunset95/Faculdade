package Revisão_Modulos_e_Vetores;
import java.util.Scanner;

public class Cadastroavaliacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        double peso, altura, imc;

        System.out.print("Qual é o seu Nome?");
        nome = sc.nextLine().toUpperCase();
        System.out.print("Qual é o seu Peso?");
        peso= sc.nextDouble();
        System.out.print("Qual é a sua Altura?");
        altura = sc.nextDouble();

        imc = calcularImcAtleta(peso, altura);
        emitirParecer(imc, nome);


    }
    public static double calcularImcAtleta(double peso, double altura){
        double imc = peso/(altura * altura);
        return imc;

    }

    public static void emitirParecer(double imc, String nome){
        if (imc <= 25){
            System.out.println("Sucesso! " + nome);
        } else{
            System.out.println("Alerta!!!!!! " + nome);
        }

    }
}
