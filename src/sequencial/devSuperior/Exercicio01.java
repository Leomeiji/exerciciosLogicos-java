package sequencial.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double larguraDoTerreno = scan.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimentoDoTerreno = scan.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double metroQuadrado = scan.nextDouble();

        double areaDoTerreno = larguraDoTerreno * comprimentoDoTerreno;
        System.out.printf("Area do terreno = %.2f\n", areaDoTerreno);

        double precoDoTerreno = areaDoTerreno * metroQuadrado;
        System.out.printf("Preco do terreno = %.2f\n", precoDoTerreno);

        scan.close();
    }
}
