package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade = 0;
        int quantosAlunos = 0;
        int soma = 0;

        while (idade != 999) {
            System.out.print("Entre com a idade do aluno: ");
            idade = scan.nextInt();
            quantosAlunos++;
            soma = soma + idade;
        }

        System.out.printf("Existem %d alunos na classe.\n",quantosAlunos);

        int media = (soma - 999) / quantosAlunos;
        System.out.printf("A média de idade do grupo é %d anos.\n",media);

        scan.close();
    }
}
