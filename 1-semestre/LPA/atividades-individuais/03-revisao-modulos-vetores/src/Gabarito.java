package Revisão_Modulos_e_Vetores;
import java.util.Scanner;

public class Gabarito {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tamanho = 4;
        int[] notas = new int[tamanho];
        int media = 0, notaalvo;
        String[] alunos = new String[tamanho];
        int selecao;
        boolean sair = false;

        System.out.println("insira dados----");
        for (int i = 0;  i < tamanho; i++){
            System.out.print((i + 1 )+ ". aluno: ");
            alunos[i] = sc.nextLine().toUpperCase();
            System.out.print((i + 1)+ ". nota: ");
            notas[i] = sc.nextInt();
            sc.nextLine();
        }
        media = calcularMedia(notas);
        System.out.println("a media da turma é: " + media);

        do {
            System.out.print("Selecione a opção valida----- \n 1 - filtrar alunos. \n 2 - nota exatas\n 3 - Sair\n");
            selecao = sc.nextInt();
            sc.nextLine();
            switch (selecao) {
                case 1:
                    filtraAlunos(alunos, notas, media, tamanho);
                    break;
                case 2:
                    System.out.print("qual é a sua nota alvo?:  ");
                    notaalvo = sc.nextInt();
                    sc.nextLine();
                    notaalvo = contarNotasExatas(notas, notaalvo);
                    if (notaalvo != 0 ) {
                        System.out.println("Apenas " + notaalvo + " receberam a nota alvo");
                    } else{
                        System.out.println("Nota alvo não encontrada no banco de dados");
                    }
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("repita pfv");
            }
        } while (!sair);
        System.out.println("cabo:)");
        sc.close();
    }
    public static int calcularMedia(int[] notas) {
        int media = 0, resultado;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        resultado = media / (notas.length);
        return resultado;
    }
    public static void filtraAlunos(String[] alunos, int[] notas, int media, int tamanho){
        System.out.println("Os alunos que passaram foram: ");
        for (int i = 0; i < tamanho; i++ ){
            if (notas[i] >= media){
                System.out.println(alunos[i]);
            }
        }
    }
    public static int contarNotasExatas(int[] notas, int notaalvo){
        int totalPessoas = 0;
        for (int i = 0; i < notas.length; i++ ){
            if (notaalvo == notas[i]){
                totalPessoas ++;
            }
        }
        return totalPessoas;
    }
}
