package condicional.cursoEmVideo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();

        System.out.print("Informe a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("MEDIA = %.1f\n",media);

        if (media <= 4.9) {
            System.out.println("REPROVADO!");
        }
        else if (media <= 6.9) {
            System.out.println("RECUPERACAO!");
        }
        else if (media >= 7.0) {
            System.out.println("APROVADO!");
        }

        scan.close();
    }
}
