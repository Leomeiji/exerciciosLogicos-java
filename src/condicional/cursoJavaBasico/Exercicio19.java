package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double segundaNota = scan.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double terceiraNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3.0;

        if (media == 10.0) {
            System.out.println("APROVADO COM DISTINÇÃO!");
        }
        else if (media >= 7.0) {
            System.out.println("APROVADO!");
        }
        else {
            System.out.println("REPROVADO!");
        }

        scan.close();
    }
}
