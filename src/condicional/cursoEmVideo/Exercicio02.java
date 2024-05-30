package condicional.cursoEmVideo;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o seu ano de nascimento: ");
        int anoDeNascimento = scan.nextInt();

        int idade = 2024 - anoDeNascimento;

        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos.");
            System.out.println("Você já pode votar!!");
        }
        else {
            System.out.println("Você tem " + idade + " anos.");
            System.out.println("Você não pode votar!!");
        }

        scan.close();
    }
}
