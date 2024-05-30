package sequencial.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Quantas horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = (salarioBruto / 100) * 11;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double descontos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("Salário Bruto: %.2f\n",salarioBruto);
        System.out.printf("IR: %.2f\n",ir);
        System.out.printf("INSS: %.2f\n",inss);
        System.out.printf("Sindicato: %.2f\n",sindicato);
        System.out.printf("Descontos: %.2f\n",descontos);
        System.out.printf("Salário Líquido: %.2f\n",salarioLiquido);


        scan.close();
    }
}
