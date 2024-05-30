package loop.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        double salarioHomens = 0;
        double salarioMulheres = 0;
        char resposta = 's';

        while (resposta == 's'){
            System.out.print("Informe o sexo M/F: ");
            char sexo = scan.next().charAt(0);
            sexo = Character.toLowerCase(sexo);

            if (sexo == 'm') {
                System.out.print("Informe o salario: ");
                double salario = scan.nextDouble();
                salarioHomens = salarioHomens + salario;
            }
            else if (sexo == 'f'){
                System.out.print("Informe o salario: ");
                double salario = scan.nextDouble();
                salarioMulheres = salarioMulheres + salario;
            }
            else {
                System.out.println("Valor inválido!");
            }

            System.out.print("Você deseja continuar S/N: ");
            resposta = scan.next().toLowerCase().charAt(0);
        }

        System.out.printf("Total salario dos homens:R$ %.2f\n",salarioHomens);
        System.out.printf("Total salario das mulheres:R$ %.2f\n",salarioMulheres);

        scan.close();
    }
}
