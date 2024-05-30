package condicional.cursoEmVideo;

import java.util.Random;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        // 1- Pedra 2- Papel 3- Tesoura
        // 1 (J) - 2 (C) = -1 Computador
        // 1 (J) - 3 (C) = -2 Jogador
        // 2 (J) - 1 (C) =  1 Jogador
        // 2 (J) - 3 (C) = -1 Computador
        // 3 (J) - 1 (C) =  2 Computaodor
        // 3 (J) - 2 (C) =  1 Jogador

        // Numeros do jogador = 1 e -2
        // Numeros do Computaodr = -1 e 2

        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int jogador;
        int computador;

        System.out.println("VAMOS JOGAR!");
        System.out.println();

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        jogador = scan.nextInt();
        computador = gerador.nextInt(3) + 1;

        System.out.println("JOGADOR = " + jogador);
        System.out.println("COMPUTADOR = " + computador);

        if (jogador == computador) {
            System.out.println("Empatado!");
        }
        else if (jogador - computador == 1 || jogador - computador == -2) {
            System.out.println("JOGADOR GANHOU!");
        }
        else {
            System.out.println("COMPUTADOR GANHOU!");
        }

        scan.close();

    }

}
