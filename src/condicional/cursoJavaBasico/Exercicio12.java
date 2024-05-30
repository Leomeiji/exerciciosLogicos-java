package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor hora do colaborador: ");
        double valorHora = scan.nextDouble();

        System.out.print("Entre com as horas trabalhadas do colaborador: ");
        int horasTrabalhadas = scan.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        System.out.printf("SALARIO BRUTO: R$%.2f\n",salarioBruto);

        if (salarioBruto < 900) {
            System.out.println("IR: Isento");

            double inss = (salarioBruto / 100) * 10;
            System.out.printf("INSS: R$%.2f\n", inss);

            System.out.printf("TOTAL DE DESCONTOS: R$%.2f\n", inss);

            double salarioLiquido = salarioBruto - inss;
            System.out.printf("SALARIO LIQUIDO: R$%.2f\n", salarioLiquido);

        }
        else if (salarioBruto < 1500) {
            double ir = (salarioBruto / 100) * 5;
            System.out.printf("IR: R$%.2f\n",ir);

            double inss = (salarioBruto / 100) * 10;
            System.out.printf("INSS: R$%.2f\n",inss);

            double totalDeDescontos = ir + inss;
            System.out.printf("TOTAL DE DESCONTOS: R$%.2f\n", totalDeDescontos);

            double salarioLiquido = salarioBruto - totalDeDescontos;
            System.out.printf("SALARIO LIQUIDO: R$%.2f\n",salarioLiquido);
        }
        else if (salarioBruto < 2500) {
            double ir = (salarioBruto / 100) * 10;
            System.out.printf("IR: R$%.2f\n",ir);

            double inss = (salarioBruto / 100) * 10;
            System.out.printf("INSS: R$%.2f\n",inss);

            double totalDeDescontos = ir + inss;
            System.out.printf("TOTAL DE DESCONTOS: R$%.2f\n", totalDeDescontos);

            double salarioLiquido = salarioBruto - totalDeDescontos;
            System.out.printf("SALARIO LIQUIDO: R$%.2f\n",salarioLiquido);
        }
        else {
            double ir = (salarioBruto / 100) * 20;
            System.out.printf("IR: R$%.2f\n",ir);

            double inss = (salarioBruto / 100) * 10;
            System.out.printf("INSS: R$%.2f\n",inss);

            double totalDeDescontos = ir + inss;
            System.out.printf("TOTAL DE DESCONTOS: R$%.2f\n", totalDeDescontos);

            double salarioLiquido = salarioBruto - totalDeDescontos;
            System.out.printf("SALARIO LIQUIDO: R$%.2f\n",salarioLiquido);
        }
        scan.close();
    }
}
