package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o salario do colaborador: ");
        double salarioAtual = scan.nextDouble();

        if (salarioAtual < 280.00) {
            double reajuste = salarioAtual * 1.20;
            double aumento = reajuste - salarioAtual;

            System.out.printf("Salario antes do reajuste R$%.2f\n",salarioAtual);
            System.out.println("O percentual de aumento aplicado de 20%");
            System.out.printf("O valor do aumento R$%.2f\n",aumento);
            System.out.printf("O novo salario R$%.2f\n",reajuste);
        }
        else if (salarioAtual < 700) {
            double reajuste = salarioAtual * 1.15;
            double aumento = reajuste - salarioAtual;

            System.out.printf("Salario antes do reajuste R$%.2f\n",salarioAtual);
            System.out.println("O percentual de aumento aplicado de 15%");
            System.out.printf("O valor do aumento R$%.2f\n",aumento);
            System.out.printf("O novo salario R$%.2f\n",reajuste);
        }
        else if (salarioAtual < 1500) {
            double reajuste = salarioAtual * 1.10;
            double aumento = reajuste - salarioAtual;

            System.out.printf("Salario antes do reajuste R$%.2f\n",salarioAtual);
            System.out.println("O percentual de aumento aplicado de 10%");
            System.out.printf("O valor do aumento R$%.2f\n",aumento);
            System.out.printf("O novo salario R$%.2f\n",reajuste);
        }
        else {
            double reajuste = salarioAtual * 1.05;
            double aumento = reajuste - salarioAtual;

            System.out.printf("Salario antes do reajuste R$%.2f\n",salarioAtual);
            System.out.println("O percentual de aumento aplicado de 5%");
            System.out.printf("O valor do aumento R$%.2f\n",aumento);
            System.out.printf("O novo salario R$%.2f\n",reajuste);
        }

        scan.close();
    }
}
