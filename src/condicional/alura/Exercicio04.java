package condicional.alura;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par!");
        } else {
            System.out.println("O numero é impar!");
        }

        scan.close();
    }
}
