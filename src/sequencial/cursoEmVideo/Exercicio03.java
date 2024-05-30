package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nomeDoFuncionario = scan.nextLine();

        System.out.print("Salário: ");
        double salario = scan.nextDouble();

        System.out.printf("O funcionário %s tem o um salário de R$%.2f em Junho.",nomeDoFuncionario, salario);

        scan.close();
    }
}
