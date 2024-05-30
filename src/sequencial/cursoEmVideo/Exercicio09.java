package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos de dinheiro você tem na carteira: ");
        double reais = scan.nextDouble();

        double compraDeDolares = reais / 3.45;
        System.out.printf("Você pode comprar %.2f de dólares\n",compraDeDolares);

        scan.close();
    }
}
