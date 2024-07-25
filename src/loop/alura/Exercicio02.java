package loop.alura;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial );

        scan.close();
    }
}
