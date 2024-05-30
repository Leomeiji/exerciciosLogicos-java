package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scan.nextDouble();

        double salarioAtual = salario * 1.15;

        System.out.printf("O salário reajustado é %.2f\n",salarioAtual);

        scan.close();
    }
}
