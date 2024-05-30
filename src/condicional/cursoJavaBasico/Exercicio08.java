package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do prod 1: ");
        double prod1 = scan.nextDouble();

        System.out.print("Informe o valor do prod 2: ");
        double prod2 = scan.nextDouble();

        System.out.print("Informe o valor do prod 3: ");
        double prod3 = scan.nextDouble();

        if (prod1 < prod2 && prod1 < prod3) {
            System.out.println("Compre o primeiro produto!");
        }
        else if (prod2 < prod1 && prod2 < prod3) {
            System.out.println("Compre o segundo produto!");
        }
        else {
            System.out.println("Compre o terceiro produto!");
        }

        scan.close();
    }
}
