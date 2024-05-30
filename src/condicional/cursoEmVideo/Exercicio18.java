package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o genero do funcionario M ou F: ");
        String sexo = scan.next();

        System.out.print("Informe o salario do funcionario: ");
        double salario = scan.nextDouble();

        System.out.print("Informe quantos anos o funcionario esta na empresa: ");
        int anos = scan.nextInt();

        if (sexo.equalsIgnoreCase("f")) {
            if (anos < 15) {
                double reajuste = salario * 1.05;
                System.out.printf("Novo salario = %.2f\n",reajuste);
            }
            else if (anos < 20) {
                double reajuste = salario * 1.12;
                System.out.printf("Novo salario = %.2f\n",reajuste);
            }
            else {
                double reajuste = salario * 1.23;
                System.out.printf("Novo salario = %.2f\n",reajuste);
            }
        } else if (sexo.equalsIgnoreCase("m")) {
            if (anos < 20) {
                double reajuste = salario * 1.03;
                System.out.printf("Novo salario = %.2f\n",reajuste);
            }
            else if (anos < 30) {
                double reajuste = salario * 1.13;
                System.out.printf("Novo salario = %.2f\n",reajuste);
            }
            else {
                double reajuste = salario * 1.25;
                System.out.printf("Novo salario = %.2f\n",reajuste);
            }
        }
        else {
            System.out.println("VALOR INVALIDO!");
        }

        scan.close();
    }
}
