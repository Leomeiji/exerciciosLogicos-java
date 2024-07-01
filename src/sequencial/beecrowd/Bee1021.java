package sequencial.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double totalDeDinheiro = scan.nextDouble();
        int dinheiro = (int) Math.round(totalDeDinheiro * 100);

        int n100 =  dinheiro / 10000;
        dinheiro %= 10000;
        int n50 =  dinheiro / 5000;
        dinheiro %= 5000;
        int n20 = dinheiro / 2000;
        dinheiro %= 2000;
        int n10 = dinheiro / 1000;
        dinheiro %= 1000;
        int n5 = dinheiro / 500;
        dinheiro %= 500;
        int n2 = dinheiro / 200;
        dinheiro %= 200;
        int m1 = dinheiro / 100;
        dinheiro %= 100;
        int m50 = dinheiro / 50;
        dinheiro %= 50;
        int m25 = dinheiro / 25;
        dinheiro %= 25;
        int m10 = dinheiro / 10;
        dinheiro %= 10;
        int m5 = dinheiro / 5;
        dinheiro %= 5;
        int m01 = dinheiro;

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m5 + " moeda(s) de R$ 0.05");
        System.out.println(m01 + " moeda(s) de R$ 0.01");

        scan.close();
    }
}
