package sequencial.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double areaTriangulo = (a * c) / 2.0;
        System.out.printf("TRIANGULO: %.3f\n",areaTriangulo);

        double areaCirculo = Math.pow(c, 2) * 3.14159;
        System.out.printf("CIRCULO: %.3f\n",areaCirculo);

        double areaTrapezio = (a + b) * c / 2;
        System.out.printf("TRAPEZIO: %.3f\n",areaTrapezio);

        double areaQuadrado = b * b;
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);

        double areaRetangulo = a * b;
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        scan.close();
    }
}
