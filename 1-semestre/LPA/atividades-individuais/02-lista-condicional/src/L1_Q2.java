package Lista1_Condicional;

import java.util.Scanner;

public class L1_Q2 {
    public static void main(String[] args){
int idade;
Scanner leitor = new Scanner(System.in);

System.out.print("Digite a sua idade: ");
idade = leitor.nextInt();
if (idade >= 18){
    System.out.print("Você é maior de idade!");
} else {
    System.out.print("Você é menor de idade!");
}

    }

}
