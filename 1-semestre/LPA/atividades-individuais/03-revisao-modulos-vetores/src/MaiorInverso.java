package Revisão_Modulos_e_Vetores;
import java.util.Scanner;

public class MaiorInverso {
    public static void main(String[] args){
        int[] pos = new int[4];
        int maior = 0;

        System.out.println("Prenchar os dados-----");
        prencher(pos);
        System.out.println("Posição-----");
        maior = posMaior(pos, maior);
        System.out.println("sua maior posição é: " + maior);
        System.out.println("Ordem inversa-----");
        invertido(pos);


    }
    public static void prencher(int[] pos){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < pos.length; i++) {
            System.out.print(i + ". digite o seu numero: ");
            pos[i] = sc.nextInt();
        }
    }
    public static void invertido(int[] pos){
        for (int i = pos.length - 1; i >= 0; i--){
            System.out.println(pos[i]);
        }

    }
    public static int posMaior(int[] pos, int maior){
        maior = 0;
        for (int i = 0; i < pos.length; i++){
            int verificar = pos[i];
            if (verificar > pos[maior]){
                maior = i;
            }

        } return maior;
    }

}
