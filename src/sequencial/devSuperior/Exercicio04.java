package sequencial.devSuperior;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scan.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scan.nextInt();

        int soma = x + y;
        System.out.println("SOMA = " + soma);

        scan.close();
    }
}
