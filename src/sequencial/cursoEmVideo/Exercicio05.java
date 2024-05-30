package sequencial.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = scan.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("A média entre %.1f e %.1f é igual a %.1f\n",nota1,nota2,media);

        scan.close();
    }
}
