package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();

        for (int i = 0; i < 11; i++) {
            int resposta = numero * i;
            System.out.println(numero + " x " + i + " = " + resposta);
        }

        scan.close();
    }
}
