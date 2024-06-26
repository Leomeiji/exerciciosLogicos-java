package sequencial.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1015 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        System.out.printf("%.4f\n",distancia);

        scan.close();
    }
}
