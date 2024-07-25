package condicional.alura;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Para calcular area do quadrado!:");
        System.out.println("2 - Para calcular area do circulo:");

        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                double numeroQ = scan.nextDouble();
                double areaQ = numeroQ * numeroQ;
                System.out.println("Area do quadrado: " + areaQ);
                break;
            case 2:
                double numeroC = scan.nextInt();
                double areaC = Math.PI * numeroC * numeroC;
                System.out.println("Area do circulo: " + areaC);
                break;
            default:
                System.out.println("Escolha invalida!");
                break;

        }

        scan.close();
    }
}
