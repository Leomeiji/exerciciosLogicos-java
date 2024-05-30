package condicional.cursoEmVideo;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.printf("O ano de %d e Bissexto!",ano);
        }
        else {
            System.out.printf("O ano de %d nao e Bissexto!",ano);
        }

        scan.close();
    }
}
