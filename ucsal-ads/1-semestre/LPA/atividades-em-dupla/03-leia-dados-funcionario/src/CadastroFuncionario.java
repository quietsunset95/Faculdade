import java.util.Scanner;

public class CadastroFuncionario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeFuncionario;
        double pesoFuncionario, salarioDesejado;
        int idadeFuncionario;

        System.out.println("==========================================");
        System.out.println("Bom dia! Seja bem vindo");
        System.out.println("==========================================");

        System.out.print("Digite o seu NOME: ");
        nomeFuncionario = teclado.nextLine();

        System.out.print("Digite o seu PESO: ");
        pesoFuncionario = teclado.nextDouble();

        System.out.print("Digite a sua IDADE: ");
        idadeFuncionario = teclado.nextInt();

        System.out.print("Digite o seu SALARIO DESEJADO: ");
        salarioDesejado = teclado.nextDouble();

        System.out.println("==========================================");
        System.out.println("Nome do Usuário: " + nomeFuncionario);
        System.out.println("Peso do Usuário: " + pesoFuncionario);
        System.out.println("Idade do Usuário: " + idadeFuncionario);
        System.out.println("Salário Desejado: " + salarioDesejado);
        System.out.println("==========================================");

        teclado.close();
    }
}
