package sequencial.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        double y = scan.nextDouble();
        double consumoMedio = x / y;
        System.out.printf("%.3f km/l\n",consumoMedio);

        scan.close();
    }
}
