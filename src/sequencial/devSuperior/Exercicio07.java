package sequencial.devSuperior;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Valor por hora: ");
        double valorPorHora = scan.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();

        double pagamento = valorPorHora * horasTrabalhadas;
        System.out.printf("O pagamento para %s deve ser %.2f\n",nome, pagamento);

        scan.close();
    }
}
