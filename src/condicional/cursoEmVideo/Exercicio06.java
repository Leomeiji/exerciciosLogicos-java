package condicional.cursoEmVideo;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o ano de nascimento: ");
        int anoDeNascimento = scan.nextInt();

        int idade = 2024 - anoDeNascimento;
        int qtosFalta = 18 - idade;
        int qtosPassou = idade - 18;

        if (idade < 18) {
            System.out.printf("Falta %d anos para o alistamento militar!\n",qtosFalta);
        }
        else {
            System.out.printf("Já passou %d anos do alistamento militar!\n",qtosPassou);
        }

        scan.close();
    }
}
