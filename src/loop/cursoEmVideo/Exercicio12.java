package loop.cursoEmVideo;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = 0;
        int numero;
        int par = 0;
        int impar = 0;

        while (x < 6) {
            System.out.print("Entre com um numero inteiro: ");
            numero = scan.nextInt();
            x++;

            if (numero % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }

        }

        System.out.println("Contador Par: " + par);
        System.out.println("Contador Impar: " + impar);

        scan.close();
    }
}
