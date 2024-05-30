package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor da casa: ");
        double valorCasa = scan.nextDouble();

        System.out.print("Informe o salario do comprador: ");
        double salario = scan.nextDouble();

        System.out.print("Informe em quantos anos ele vai pagar: ");
        int anos = scan.nextInt();

        double prestacao = valorCasa / (anos * 12);
        double trintaPorcento = salario * 0.3;

        if (prestacao > trintaPorcento) {
            System.out.println("EMPRESTIMO NEGADO!");
        }
        else {
            System.out.println("EMPRESTIMO CONCEDIDO!");
        }

        scan.close();
    }
}
