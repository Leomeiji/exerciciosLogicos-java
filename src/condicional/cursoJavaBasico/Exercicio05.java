package condicional.cursoJavaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a primeira nota do aluno: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Entre com a segunda nota do aluno: ");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2.0;

        if (media == 10.0) {
            System.out.println("APROVADO COM DISTINÇÃO!");
        }
        else if (media >= 7.0) {
            System.out.println("APROVADO!");
        }
        else {
            System.out.println("REPROVADO!");
        }

        scan.close();
    }
}
