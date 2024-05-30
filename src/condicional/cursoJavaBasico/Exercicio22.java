package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o tipo de combustivel " +
                " G - Gasolina e A - alcool: ");
        String combustivel = scan.next();

        System.out.print("Entre com a quantidade de combustivel: ");
        int qtdCombustivel = scan.nextInt();

        if (combustivel.equalsIgnoreCase("A")) {
            System.out.println("Álcool: " + qtdCombustivel + "L");

            double valorDoCombustivel = qtdCombustivel * 1.90;
            double desconto;
            double valorTotal;

            if (qtdCombustivel <= 20) {
                desconto = (valorDoCombustivel / 100) * 3;
            }
            else {
                desconto = (valorDoCombustivel / 100) * 5;
            }

            valorTotal = valorDoCombustivel - desconto;
            System.out.printf("VALOR TOTAL = R$%.2f\n",valorTotal);
        }
        else if (combustivel.equalsIgnoreCase("G")) {
            System.out.println("Gasolina: " + qtdCombustivel + "L");

            double valorDoCombustivel = qtdCombustivel * 2.50;
            double desconto;
            double valorTotal;

            if (qtdCombustivel <= 20) {
                desconto = (valorDoCombustivel / 100) * 4;
            }
            else {
                desconto = (valorDoCombustivel / 100) * 6;
            }

            valorTotal = valorDoCombustivel - desconto;
            System.out.printf("VALOR TOTAL = R$%.2f\n",valorTotal);

        }
        else {
            System.out.println("Valor invalido!");
        }
        scan.close();
    }
}
