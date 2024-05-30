package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Digite outro valor: ");
        int segundoNumero = scan.nextInt();

        int soma = primeiroNumero + segundoNumero;
        System.out.printf("A soma entre %d e %d é igual a %d\n",primeiroNumero,segundoNumero,soma);

        scan.close();

    }
}
