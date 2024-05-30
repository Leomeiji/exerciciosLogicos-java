package condicional.cursoEmVideo;

import java.util.Random;
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int sorteio;
        int jogador;

        sorteio = gerador.nextInt(5) + 1;

        System.out.print("Informe um numero de 1 a 5: ");
        jogador = scan.nextInt();

        if (jogador == sorteio) {
            System.out.println("Você acertou!");
        }
        else {
            System.out.println("Você errou!");
            System.out.println("O numero é " + sorteio);
        }

        scan.close();
    }
}
