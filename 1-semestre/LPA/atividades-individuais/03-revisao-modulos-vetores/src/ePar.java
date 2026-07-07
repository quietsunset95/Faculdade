package Revisão_Modulos_e_Vetores;
import java.util.Scanner;

public class ePar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean par;

        System.out.print("Qual numero é?: ");
        int num = sc.nextInt();

        par = parimpar(num);

        if (par == true){
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }

    }
    public static boolean parimpar( int num){
        boolean par;
        if (num%2 == 0){
            par = true;

        } else {
            par = false;
        }
        return par;
    }
}
