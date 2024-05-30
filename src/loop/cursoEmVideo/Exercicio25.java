package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        int idadeDigitadas = 0;
        int maisDe21 = 0;
        int soma = 0;
        char resposta;

        do {
            System.out.print("Informe a idade: ");
            idade = scan.nextInt();

            idadeDigitadas++;

            soma = soma + idade;

            if (idade >= 21) {
                maisDe21++;
            }

            System.out.print("Você deseja continuar [s/n]: ");
            resposta = scan.next().charAt(0);

        } while (resposta != 'n');

        System.out.println("A) Quantas idades foram digitadas: " + idadeDigitadas);

        int media = soma / idadeDigitadas;
        System.out.println("B) Qual é a média entre as idades digitas: " + media);

        System.out.println("C) Quantas pessoas tem 21 anos ou mais: " + maisDe21);

        scan.close();
    }
}
