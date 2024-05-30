package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = 0;
        int numero;
        int soma = 0;

        while (x < 7) {
            System.out.print("Informe um numero inteiro: ");
            numero = scan.nextInt();
            soma = soma + numero;
            System.out.println(soma);
            x++;
        }

        scan.close();
    }
}
