package sequencial.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        int distanciaPercorrida = scan.nextInt();

        System.out.print("Combustível gasto: ");
        double combustivelGasto = scan.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;
        System.out.printf("Consumo medio = %.3f\n", consumoMedio);

        scan.close();
    }
}
