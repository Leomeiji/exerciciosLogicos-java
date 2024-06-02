package sequencial.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int horasTrabalhadas = scan.nextInt();
        double valorHora = scan.nextDouble();

        double salary = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        scan.close();
    }
}
