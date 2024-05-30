package sequencial.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        double nota3 = scan.nextDouble();

        System.out.print("Digite a quarta nota do aluno: ");
        double nota4 = scan.nextDouble();

        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        double media = somaDasNotas / 4.0;

        System.out.printf("A média das notas é: %.1f\n",media);

        scan.close();
    }
}
