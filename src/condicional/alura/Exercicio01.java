package condicional.alura;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println("O numero e positivo!");
        } else {
            System.out.println("O numero e negativo! ");
        }

        scan.close();

    }
}
