package sequencial.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1011 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double formula = (4 / 3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", formula);

        scan.close();
    }
}
