package sequencial.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int codigo = scan.nextInt();
        int numeroDePecas = scan.nextInt();
        double valorUnitario = scan.nextDouble();

        double pagamento1 = numeroDePecas * valorUnitario;

        int codigo2 = scan.nextInt();
        int numeroDePecas2 = scan.nextInt();
        double valorUnitario2 = scan.nextDouble();

        double pagamento2 = numeroDePecas2 * valorUnitario2;

        double valorDePagamento = pagamento1 + pagamento2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorDePagamento);

        scan.close();
    }
}
