package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe qual carne você deseja: " +
                "F - File - A - Alcatra - P - Picanha: ");
        String tipoDeCarne = scan.next();

        System.out.print("Informe a quantidade de Kg que você deseja: ");
        int qtdDeKg = scan.nextInt();

        double precoTotal = 0;

        if (tipoDeCarne.equalsIgnoreCase("F")) {
            System.out.println("Tipo de Carne: File Duplo");
            System.out.println("Quantidade de Carne: " + qtdDeKg + "Kg");

            if (qtdDeKg < 5) {
                precoTotal = qtdDeKg * 4.90;
                System.out.printf("Preço total: R$%.2f\n",precoTotal);
            }
            else {
                precoTotal = qtdDeKg * 5.80;
                System.out.printf("Preço total: R$%.2f\n",precoTotal);
            }
        }
        else if (tipoDeCarne.equalsIgnoreCase("A")) {
            System.out.println("Tipo de Carne: Alcatra");
            System.out.println("Quantidade de Carne: " + qtdDeKg + "Kg");

            if (qtdDeKg < 5) {
                precoTotal = qtdDeKg * 5.90;
                System.out.printf("Preço total: R$%.2f\n",precoTotal);
            }
            else {
                precoTotal = qtdDeKg * 6.80;
                System.out.printf("Preço total: R$%.2f\n",precoTotal);
            }
        }
        else if (tipoDeCarne.equalsIgnoreCase("P")) {
            System.out.println("Tipo de Carne: Picanha");
            System.out.println("Quantidade de Carne: " + qtdDeKg + "Kg");

            if (qtdDeKg < 5) {
                precoTotal = qtdDeKg * 6.90;
                System.out.printf("Preço total: R$%.2f\n", precoTotal);
            } else {
                precoTotal = qtdDeKg * 7.80;
                System.out.printf("Preço total: R$%.2f\n", precoTotal);
            }
        }
        else {
            System.out.println("Valor Inválido!");
        }

        System.out.print("Informe o tipo de pagamento: " +
                "C - cartão comum T - cartão tabajara D - dinheiro: ");
        String formaDePagamento = scan.next();

        if (formaDePagamento.equalsIgnoreCase("C")) {
            System.out.println("Tipo de pagamento: Cartão");
            System.out.println("Desconto: R$0.00");
            System.out.printf("Valor a pagar: R$%.2f\n",precoTotal);
        }
        else if (formaDePagamento.equalsIgnoreCase("T")) {
            System.out.println("Tipo de pagamento: Cartão Tabajara");
            double desconto = (precoTotal / 100) * 5;
            System.out.printf("Desconto: R$%.2f\n",desconto);
            double valorFinal = precoTotal - desconto;
            System.out.printf("Valor a pagar: R$%.2f\n", valorFinal);
        }
        else if (formaDePagamento.equalsIgnoreCase("D")) {
            System.out.println("Tipo de pagamento: Dinheiro");
            System.out.println("Desconto: R$0.00");
            System.out.printf("Valor a pagar: R$%.2f\n",precoTotal);
        }

        scan.close();
    }
}
