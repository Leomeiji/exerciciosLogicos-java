package sequencial.cursoEmVideo;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos dias trabalhados no mês: ");
        int dias = scan.nextInt();

        int horasTrabalhadas = 8 * 25;
        int salarioFinal = dias * horasTrabalhadas;

        System.out.println("Salário do mês: " + salarioFinal);

        scan.close();
    }
}
