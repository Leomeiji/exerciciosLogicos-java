package sequencial.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double a = scan.nextDouble();

        System.out.print("Digite a medida B: ");
        double b = scan.nextDouble();

        System.out.print("Digite a medida C: ");
        double c = scan.nextDouble();

        double areaDoQuadrado = a * a;
        System.out.printf("AREA DO QUADRADO = %.4f\n", areaDoQuadrado);

        double areaDoTriangulo = (a * b) / 2.0;
        System.out.printf("AREA DO TRIANGULO = %.4f\n", areaDoTriangulo);

        double areaDoTrapezio = (a + b) * c / 2.0;
        System.out.printf("AREA DO TRAPEZIO = %.4f\n", areaDoTrapezio);

        scan.close();
    }
}
