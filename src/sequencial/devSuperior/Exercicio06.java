package sequencial.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo: ");
        double r = scan.nextDouble();

        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("AREA = %.3f\n", area);

        scan.close();
    }
}
