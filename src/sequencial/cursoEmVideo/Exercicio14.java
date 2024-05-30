package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos Km foi percorrido: ");
        int km = scan.nextInt();

        System.out.println("Quantos dias ficou alugado: ");
        int dias = scan.nextInt();

        double valorPorKm = km * 0.20;
        double valorPorDia = dias * 90;
        double valorFinal = valorPorKm + valorPorDia;

        System.out.printf("O valor final a ser pago é %.2f\n",valorFinal);

        scan.close();
    }
}
