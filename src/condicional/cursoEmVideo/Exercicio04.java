package condicional.cursoEmVideo;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scan.nextInt();

        System.out.println("O numero informado e: " + numero);

        if (numero % 2 == 0) {
            System.out.println("O numero é PAR!");
        }
        else {
            System.out.println("O numero é IMPAR!");
        }
    }
}
