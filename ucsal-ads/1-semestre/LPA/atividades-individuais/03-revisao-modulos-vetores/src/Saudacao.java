package Revisão_Modulos_e_Vetores;
import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hora;
        System.out.print("qual é o seu nome: ");
        String nome = input.next();
        System.out.print("Que horas são?: ");
        hora = input.nextInt();

        dia(hora, nome);
    }
    public static void dia(int hora, String nome){
        // 1. Validação: Filtra logo se a hora é inválida
        if (hora < 0 || hora > 23){
            System.out.println("Hora inválida! Digite entre 0 e 23.");
        }
        // 2. Madrugada/Noite: cobre de 19h até as 4h da manhã
        else if (hora >= 19 || hora <= 4){
            System.out.println("Boa noite! " + nome);
        }
        // 3. Manhã: cobre de 5h até as 11h
        else if (hora >= 5 && hora <= 11){
            System.out.println("Bom dia! " + nome);
        }
        // 4. Tarde: cobre de 12h até as 18h
        else {
            System.out.println("Boa tarde! " + nome);
        }
    }
}
