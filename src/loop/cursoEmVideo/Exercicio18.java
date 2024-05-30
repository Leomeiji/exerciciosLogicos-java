package loop.cursoEmVideo;

import java.util.Random;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int sorteio;
        int jogador;
        int tentativas = 0;

        sorteio = gerador.nextInt(10) + 1;

        while (tentativas < 4) {

            System.out.print("Informe um numero de 1 a 10: ");
            jogador = scan.nextInt();

            if (jogador == sorteio) {
                System.out.println("Você acertou!");
            }
            else {
                System.out.println("Você errou!");
                System.out.println("O numero é " + sorteio);
            }

            tentativas++;
            System.out.println(tentativas);
        }
        scan.close();
    }
}
