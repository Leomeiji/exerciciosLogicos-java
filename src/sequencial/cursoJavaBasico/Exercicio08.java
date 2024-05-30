package sequencial.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o seu valor de hora trabalhada? ");
        double valorHora = scan.nextDouble();

        System.out.print("Quantas horas você trabalhou neste mês? ");
        int horasTrabalhadas = scan.nextInt();

        double salarioMensal = valorHora * horasTrabalhadas;

        System.out.printf("Você receberá este mês: R$%.2f\n",salarioMensal);

        scan.close();
    }
}
