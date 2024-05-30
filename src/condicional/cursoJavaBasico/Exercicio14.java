package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2.0;

        if (media > 9.0) {
            System.out.printf("Media de: %.1f\n",media);
            System.out.println("Conceito: A");
            System.out.println("APROVADO!");
        }
        else if (media > 7.5) {
            System.out.printf("Media de: %.1f\n",media);
            System.out.println("Conceito: B");
            System.out.println("APROVADO!");
        }
        else if (media > 6.0) {
            System.out.printf("Media de: %.1f\n", media);
            System.out.println("Conceito: C");
            System.out.println("APROVADO!");
        }
        else if (media > 4.0) {
            System.out.printf("Media de: %.1f\n",media);
            System.out.println("Conceito: D");
            System.out.println("REPROVADO!");
        }
        else {
            System.out.printf("Media de: %.1f\n",media);
            System.out.println("Conceito: E");
            System.out.println("REPROVADO!");
        }

        scan.close();
    }
}
