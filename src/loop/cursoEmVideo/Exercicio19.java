package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        while (numero != 1111) {
            numero = scan.nextInt();
            soma = soma + numero;
        }

        System.out.println("TOTAL: " + soma);


        scan.close();
    }
}
