package condicional.cursoJavaBasico;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = scan.nextInt();

        if (numero >= 0) {
            System.out.printf("O numero %d é positivo!\n",numero);
        }
        else {
            System.out.printf("O numero %d é negativo!\n",numero);

        }

        scan.close();
    }
}
