package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o carro é popular ou luxo: ");
        String carro = scan.next();

        System.out.print("Informe quantos dias de aluguel: ");
        int diasDeAluguel = scan.nextInt();

        System.out.print("Informe quantos km foram percorridos: ");
        double kmPercorridos = scan.nextDouble();

        if (carro.equalsIgnoreCase("Popular")) {
            double aluguelPopular = diasDeAluguel * 90.00;
            System.out.println("Carro Popular!");
            System.out.printf("VALOR DO ALUGUEL = %.2f\n",aluguelPopular);

            if (kmPercorridos <= 100) {
                double valorDoKm = kmPercorridos * 0.20;
                double valorTotalPopular = aluguelPopular + valorDoKm;

                System.out.printf("VALOR TOTAL A PAGAR = %.2f\n", valorTotalPopular);
            }
            else {
                double valorDoKm = kmPercorridos * 0.10;
                double valorTotalPopular = aluguelPopular + valorDoKm;

                System.out.printf("VALOR TOTAL A PAGAR = %.2f\n", valorTotalPopular);
            }
        } else if (carro.equalsIgnoreCase("Luxo")) {
            double aluguelLuxo = diasDeAluguel * 150.00;
            System.out.println("Carro de Luxo!");
            System.out.printf("VALOR DO ALUGUEL = %.2f\n", aluguelLuxo);

            if (kmPercorridos <= 200) {
                double valorDoKm = kmPercorridos * 0.30;
                double valorTotalLuxo = aluguelLuxo + valorDoKm;

                System.out.printf("VALOR TOTAL A PAGAR = %.2f\n", valorTotalLuxo);
            }
            else {
                double valorDoKm = kmPercorridos * 0.25;
                double valorTotalLuxo = aluguelLuxo + valorDoKm;

                System.out.printf("VALOR TOTAL A PAGAR = %.2f\n", valorTotalLuxo);

            }
        } else {
            System.out.println("Valor Inválido!!!");
        }

        scan.close();
    }
}
