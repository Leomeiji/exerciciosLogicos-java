package sequencial.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double baseDoRetangulo = scan.nextDouble();

        System.out.print("Altura do retangulo: ");
        double alturaDoRetangulo = scan.nextDouble();

        double area = baseDoRetangulo * alturaDoRetangulo;
        System.out.printf("AREA = %.4f\n", area);

        double perimetro = 2 * (baseDoRetangulo + alturaDoRetangulo);
        System.out.printf("PERIMETRO = %.4f\n", perimetro);

        double diagonal = Math.sqrt(Math.pow(baseDoRetangulo, 2) + Math.pow(alturaDoRetangulo, 2));
        System.out.printf("DIAGONAL = %.4f\n", diagonal);

        scan.close();
    }
}
