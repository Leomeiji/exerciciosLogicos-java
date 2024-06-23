package sequencial.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        double salarioFixo = scan.nextDouble();
        double vendasEfetuadas = scan.nextDouble();

        double comissao = vendasEfetuadas * 0.15;
        double totalRecebido = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", totalRecebido);

        scan.close();
    }
}
