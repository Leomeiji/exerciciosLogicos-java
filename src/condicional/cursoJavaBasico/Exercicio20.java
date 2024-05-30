package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par!");
        }
        else {
            System.out.println("O numero " + numero + " é impar!");
        }
        scan.close();
    }
}
