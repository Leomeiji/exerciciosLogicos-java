package sequencial.alura;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2.0;

        System.out.printf("Media = %.1f\n", media);

        scan.close();
    }
}
