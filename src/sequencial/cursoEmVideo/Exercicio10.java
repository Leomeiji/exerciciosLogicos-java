package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        int altura = scan.nextInt();

        System.out.println("Digite a largura: ");
        int largura = scan.nextInt();

        int area = altura * largura;
        int tinta = area / 2;

        System.out.println("A area ser pintade é " + area + " e a quantidade de tinta" +
                " é " + tinta);

        scan.close();
    }
}
