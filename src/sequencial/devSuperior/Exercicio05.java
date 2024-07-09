package sequencial.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Preco unitário do produto: ");
        double precoUnitario = scan.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidadeComprada = scan.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = scan.nextDouble();

        double totalDaCompra = precoUnitario * quantidadeComprada;
        double troco = dinheiroRecebido - totalDaCompra;
        System.out.printf("TROCO = %.2f\n",troco);

        scan.close();
    }
}
