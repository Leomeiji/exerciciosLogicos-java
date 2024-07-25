package condicional.alura;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int primeiroNumero = scan.nextInt();
        int segundoNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("Primeiro numero é maior!");
            System.out.println("Os numeros sao diferentes!");
        } else if (primeiroNumero < segundoNumero){
            System.out.println("Segundo numero e maior!");
            System.out.println("Os numeros sao diferentes!");
        } else {
            System.out.println("Os numeros sao iguais!");
        }


        scan.close();
    }
}
