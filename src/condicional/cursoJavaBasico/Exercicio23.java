package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a quantidade de Kg de morango: ");
        int qtdMorango = scan.nextInt();

        System.out.print("Entre com a quantidade de Kg de maças: ");
        int qtdMaca = scan.nextInt();

        double totalDeMorango;
        double totalDeMaca;
        int totalDeKg = qtdMaca + qtdMorango;

        if (qtdMorango < 5) {
            totalDeMorango = qtdMorango * 2.50;
        }
        else {
            totalDeMorango = qtdMorango * 2.20;
        }

        if (qtdMaca < 5) {
            totalDeMaca = qtdMaca * 1.80;
        }
        else {
            totalDeMaca = qtdMaca * 1.50;
        }

        double valorDaCompra = totalDeMorango + totalDeMaca;

        if (totalDeKg > 8 || valorDaCompra >= 25.00) {
            double desconto = (valorDaCompra / 100) * 10;
            double vFinal = valorDaCompra - desconto;

            System.out.printf("TOTAL: R$%.2f\n", vFinal);
        }
        else {
            System.out.printf("TOTAL: R$%.2f\n", valorDaCompra);
        }

        scan.close();
    }
}
