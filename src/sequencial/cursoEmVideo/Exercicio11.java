package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scan.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scan.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scan.nextInt();

        int delta = (b * b) - (4 * a * c);
        System.out.println(delta);

        scan.close();
    }
}
